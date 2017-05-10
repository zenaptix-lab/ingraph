package ingraph.relalg2rete

import ingraph.logger.IngraphLogger
import ingraph.optimization.patterns.UnnecessaryAllDifferentOperatorMatcher
import ingraph.optimization.patterns.UnnecessaryJoinMatcher
import ingraph.optimization.transformations.AbstractRelalgTransformation
import relalg.RelalgContainer
import ingraph.optimization.patterns.GetVerticesWithPropertiesMatcher
import relalg.ArithmeticComparisonOperatorType

class SimplifyingTransformation extends AbstractRelalgTransformation {

	extension IngraphLogger logger = new IngraphLogger(SimplifyingTransformation.name)

	new(RelalgContainer container) {
		super(container)
	}
	
	def simplify() {
		info("Simplifying relational algebra expression")

		if (container.simplifiedPlan || container.incrementalPlan) {
			throw new IllegalStateException(
				"The query plan is already simplified or incremental. Simplfication transformation should be invoked on a non-simplified search plan")
		}

		statements.fireWhilePossible(unnecessaryJoinOperatorRule)
		statements.fireWhilePossible(unnecessaryAllDifferentOperatorRule)
		statements.fireWhilePossible(addSelectionForPropertiesRule)
		container.simplifiedPlan = true
		return container
	}
	
	/**
	 * [a] Remove unnecessary JoinOperators
	 */
	protected def unnecessaryJoinOperatorRule() {
		createRule() //
		.precondition(UnnecessaryJoinMatcher.querySpecification) //
		.action [ //
			info('''unnecessaryJoinOperatorRule fired for «equiJoinLikeOperator»''')
			changeChildOperator(parentOperator, equiJoinLikeOperator, otherInputOperator)
		].build
	}

	/**
	 * [b] Remove unnecessary AllDifferentOperators
	 */
	protected def unnecessaryAllDifferentOperatorRule() {
		createRule() //
		.precondition(UnnecessaryAllDifferentOperatorMatcher.querySpecification) //
		.action [ //
			info('''unnecessaryAllDifferentOperatorRule fired for «allDifferentOperator»''')
			changeChildOperator(parentOperator, allDifferentOperator, inputOperator)
		].build
	}


	/**
	 * [c] Add selection operator for properties
	 */
	protected def addSelectionForPropertiesRule() {
		createRule() //
		.precondition(GetVerticesWithPropertiesMatcher.querySpecification) //
		.action [ //
			val getVerticesOperator = getVerticesOperator
			val vertexVariable = vertexVariable
			val propertyList = propertyList
			info('''getVerticesWithPropertiesMatcher fired for «getVerticesOperator»''')
			
			// TODO process more than a single list entry using a tree of ANDs
			val selectionOperator = createSelectionOperator => [
				condition = createArithmeticComparisonExpression => [
					operator = ArithmeticComparisonOperatorType.EQUAL_TO
					leftOperand = 
						createVariableExpression => [
							variable = createAttributeVariable => [
								name = propertyList.entries.get(0).key
								element = vertexVariable
								namedElementContainer = container
							]
							expressionContainer = container
						]
					rightOperand = propertyList.entries.get(0).value
					expressionContainer = container
				]
				input = getVerticesOperator
			]
			
//			val simpleVertexVariable = createVertexVariable => [
//				name = vertexVariable.name
//				namedElementContainer = vertexVariable.namedElementContainer
//			]
//			getVerticesOperator.vertexVariable = simpleVertexVariable
			vertexVariable.properties = null
			
			changeChildOperator(parentOperator, getVerticesOperator, selectionOperator)
		].build
	}

}
