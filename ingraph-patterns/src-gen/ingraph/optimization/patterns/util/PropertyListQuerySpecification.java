/**
 * Generated from platform:/resource/ingraph-patterns/src/ingraph/optimization/patterns/RelalgSimplifier.vql
 */
package ingraph.optimization.patterns.util;

import com.google.common.collect.Sets;
import ingraph.optimization.patterns.PropertyListMatch;
import ingraph.optimization.patterns.PropertyListMatcher;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate PropertyListMatcher in a type-safe way.
 * 
 * @see PropertyListMatcher
 * @see PropertyListMatch
 * 
 */
@SuppressWarnings("all")
public final class PropertyListQuerySpecification extends BaseGeneratedEMFQuerySpecification<PropertyListMatcher> {
  private PropertyListQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static PropertyListQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected PropertyListMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return PropertyListMatcher.on(engine);
  }
  
  @Override
  public PropertyListMatcher instantiate() throws ViatraQueryException {
    return PropertyListMatcher.create();
  }
  
  @Override
  public PropertyListMatch newEmptyMatch() {
    return PropertyListMatch.newEmptyMatch();
  }
  
  @Override
  public PropertyListMatch newMatch(final Object... parameters) {
    return PropertyListMatch.newMatch((relalg.PropertyList) parameters[0], (relalg.PropertyListEntry) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link PropertyListQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link PropertyListQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static PropertyListQuerySpecification INSTANCE = new PropertyListQuerySpecification();
    
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
    private final static PropertyListQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pList = new PParameter("list", "relalg.PropertyList", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://ingraph/relalg", "PropertyList")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pEntry = new PParameter("entry", "relalg.PropertyListEntry", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://ingraph/relalg", "PropertyListEntry")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pList, parameter_pEntry);
    
    @Override
    public String getFullyQualifiedName() {
      return "ingraph.optimization.patterns.propertyList";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("list","entry");
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
      		PVariable var_list = body.getOrCreateVariableByName("list");
      		PVariable var_entry = body.getOrCreateVariableByName("entry");
      		new TypeConstraint(body, new FlatTuple(var_list), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://ingraph/relalg", "PropertyList")));
      		new TypeConstraint(body, new FlatTuple(var_entry), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://ingraph/relalg", "PropertyListEntry")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_list, parameter_pList),
      		   new ExportedParameter(body, var_entry, parameter_pEntry)
      		));
      		//   PropertyList.entries(list, entry)
      		new TypeConstraint(body, new FlatTuple(var_list), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://ingraph/relalg", "PropertyList")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_list, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://ingraph/relalg", "PropertyList", "entries")));
      		new Equality(body, var__virtual_0_, var_entry);
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
}
