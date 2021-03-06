package ingraph.relalg.calculators

import relalg.RelalgContainer

/**
 * Executes the ExternalSchemaCalculator, the ExtraVariablesCalculator and the InternalSchemaCalculator
 * on a relational algebra expression.
 */
class OneStepSchemaCalculator {

	extension ExternalSchemaCalculator externalSchemaCalculator = new ExternalSchemaCalculator
	extension ExtraVariablesCalculator extraVariablesCalculator = new ExtraVariablesCalculator
	extension InternalSchemaCalculator internalSchemaCalculator = new InternalSchemaCalculator

	def calculateSchema(RelalgContainer container) {
		container.calculateExternalSchema
		container.calculateExtraVariables
		container.calculateInternalSchema
	}

}
