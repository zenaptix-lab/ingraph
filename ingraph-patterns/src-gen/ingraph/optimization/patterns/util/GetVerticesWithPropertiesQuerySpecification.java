/**
 * Generated from platform:/resource/ingraph-patterns/src/ingraph/optimization/patterns/RelalgSimplifier.vql
 */
package ingraph.optimization.patterns.util;

import com.google.common.collect.Sets;
import ingraph.optimization.patterns.GetVerticesWithPropertiesMatch;
import ingraph.optimization.patterns.GetVerticesWithPropertiesMatcher;
import ingraph.optimization.patterns.util.ParentOperatorQuerySpecification;
import ingraph.optimization.patterns.util.PropertyListQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackendFactory;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate GetVerticesWithPropertiesMatcher in a type-safe way.
 * 
 * @see GetVerticesWithPropertiesMatcher
 * @see GetVerticesWithPropertiesMatch
 * 
 */
@SuppressWarnings("all")
public final class GetVerticesWithPropertiesQuerySpecification extends BaseGeneratedEMFQuerySpecification<GetVerticesWithPropertiesMatcher> {
  private GetVerticesWithPropertiesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static GetVerticesWithPropertiesQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected GetVerticesWithPropertiesMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return GetVerticesWithPropertiesMatcher.on(engine);
  }
  
  @Override
  public GetVerticesWithPropertiesMatcher instantiate() throws ViatraQueryException {
    return GetVerticesWithPropertiesMatcher.create();
  }
  
  @Override
  public GetVerticesWithPropertiesMatch newEmptyMatch() {
    return GetVerticesWithPropertiesMatch.newEmptyMatch();
  }
  
  @Override
  public GetVerticesWithPropertiesMatch newMatch(final Object... parameters) {
    return GetVerticesWithPropertiesMatch.newMatch((relalg.GetVerticesOperator) parameters[0], (relalg.VertexVariable) parameters[1], (relalg.Operator) parameters[2], (relalg.PropertyList) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link GetVerticesWithPropertiesQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link GetVerticesWithPropertiesQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static GetVerticesWithPropertiesQuerySpecification INSTANCE = new GetVerticesWithPropertiesQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static GetVerticesWithPropertiesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pGetVerticesOperator = new PParameter("getVerticesOperator", "relalg.GetVerticesOperator", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://ingraph/relalg", "GetVerticesOperator")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pVertexVariable = new PParameter("vertexVariable", "relalg.VertexVariable", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://ingraph/relalg", "VertexVariable")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pParentOperator = new PParameter("parentOperator", "relalg.Operator", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://ingraph/relalg", "Operator")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pPropertyList = new PParameter("propertyList", "relalg.PropertyList", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://ingraph/relalg", "PropertyList")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pGetVerticesOperator, parameter_pVertexVariable, parameter_pParentOperator, parameter_pPropertyList);
    
    @Override
    public String getFullyQualifiedName() {
      return "ingraph.optimization.patterns.getVerticesWithProperties";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("getVerticesOperator","vertexVariable","parentOperator","propertyList");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, (IQueryBackendFactory)null));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_getVerticesOperator = body.getOrCreateVariableByName("getVerticesOperator");
      		PVariable var_vertexVariable = body.getOrCreateVariableByName("vertexVariable");
      		PVariable var_parentOperator = body.getOrCreateVariableByName("parentOperator");
      		PVariable var_propertyList = body.getOrCreateVariableByName("propertyList");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_getVerticesOperator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://ingraph/relalg", "GetVerticesOperator")));
      		new TypeConstraint(body, new FlatTuple(var_vertexVariable), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://ingraph/relalg", "VertexVariable")));
      		new TypeConstraint(body, new FlatTuple(var_parentOperator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://ingraph/relalg", "Operator")));
      		new TypeConstraint(body, new FlatTuple(var_propertyList), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://ingraph/relalg", "PropertyList")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_getVerticesOperator, parameter_pGetVerticesOperator),
      		   new ExportedParameter(body, var_vertexVariable, parameter_pVertexVariable),
      		   new ExportedParameter(body, var_parentOperator, parameter_pParentOperator),
      		   new ExportedParameter(body, var_propertyList, parameter_pPropertyList)
      		));
      		//   GetVerticesOperator.vertexVariable(getVerticesOperator, vertexVariable)
      		new TypeConstraint(body, new FlatTuple(var_getVerticesOperator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://ingraph/relalg", "GetVerticesOperator")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_getVerticesOperator, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://ingraph/relalg", "GetVerticesOperator", "vertexVariable")));
      		new Equality(body, var__virtual_0_, var_vertexVariable);
      		//   VertexVariable.properties(vertexVariable, propertyList)
      		new TypeConstraint(body, new FlatTuple(var_vertexVariable), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://ingraph/relalg", "VertexVariable")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_vertexVariable, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://ingraph/relalg", "ElementVariable", "properties")));
      		new Equality(body, var__virtual_1_, var_propertyList);
      		//   count find propertyList(propertyList, _) != 0
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new PatternMatchCounter(body, new FlatTuple(var_propertyList, var___0_), PropertyListQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_2_);
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new ConstantValue(body, var__virtual_3_, 0);
      		new Inequality(body, var__virtual_2_, var__virtual_3_);
      		//   find parentOperator(getVerticesOperator, parentOperator)
      		new PositivePatternCall(body, new FlatTuple(var_getVerticesOperator, var_parentOperator), ParentOperatorQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	// to silence compiler error
      	if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
  
  private static int evaluateExpression_1_1() {
    return 0;
  }
}
