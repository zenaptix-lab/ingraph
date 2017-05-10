/**
 * Generated from platform:/resource/ingraph-patterns/src/ingraph/optimization/patterns/RelalgSimplifier.vql
 */
package ingraph.optimization.patterns;

import ingraph.optimization.patterns.GetVerticesWithPropertiesMatch;
import ingraph.optimization.patterns.util.GetVerticesWithPropertiesQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import relalg.GetVerticesOperator;
import relalg.Operator;
import relalg.PropertyList;
import relalg.VertexVariable;

/**
 * Generated pattern matcher API of the ingraph.optimization.patterns.getVerticesWithProperties pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link GetVerticesWithPropertiesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern getVerticesWithProperties(getVerticesOperator : GetVerticesOperator, vertexVariable : VertexVariable, 
 *   parentOperator : Operator, propertyList : PropertyList
 * ) {
 *   GetVerticesOperator.vertexVariable(getVerticesOperator, vertexVariable);
 *   VertexVariable.properties(vertexVariable, propertyList);
 *   count find propertyList(propertyList, _) != 0;
 *   find parentOperator(getVerticesOperator, parentOperator);
 * }
 * </pre></code>
 * 
 * @see GetVerticesWithPropertiesMatch
 * @see GetVerticesWithPropertiesProcessor
 * @see GetVerticesWithPropertiesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class GetVerticesWithPropertiesMatcher extends BaseMatcher<GetVerticesWithPropertiesMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static GetVerticesWithPropertiesMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    GetVerticesWithPropertiesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (GetVerticesWithPropertiesMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static GetVerticesWithPropertiesMatcher create() throws ViatraQueryException {
    return new GetVerticesWithPropertiesMatcher();
  }
  
  private final static int POSITION_GETVERTICESOPERATOR = 0;
  
  private final static int POSITION_VERTEXVARIABLE = 1;
  
  private final static int POSITION_PARENTOPERATOR = 2;
  
  private final static int POSITION_PROPERTYLIST = 3;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(GetVerticesWithPropertiesMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private GetVerticesWithPropertiesMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pGetVerticesOperator the fixed value of pattern parameter getVerticesOperator, or null if not bound.
   * @param pVertexVariable the fixed value of pattern parameter vertexVariable, or null if not bound.
   * @param pParentOperator the fixed value of pattern parameter parentOperator, or null if not bound.
   * @param pPropertyList the fixed value of pattern parameter propertyList, or null if not bound.
   * @return matches represented as a GetVerticesWithPropertiesMatch object.
   * 
   */
  public Collection<GetVerticesWithPropertiesMatch> getAllMatches(final GetVerticesOperator pGetVerticesOperator, final VertexVariable pVertexVariable, final Operator pParentOperator, final PropertyList pPropertyList) {
    return rawGetAllMatches(new Object[]{pGetVerticesOperator, pVertexVariable, pParentOperator, pPropertyList});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pGetVerticesOperator the fixed value of pattern parameter getVerticesOperator, or null if not bound.
   * @param pVertexVariable the fixed value of pattern parameter vertexVariable, or null if not bound.
   * @param pParentOperator the fixed value of pattern parameter parentOperator, or null if not bound.
   * @param pPropertyList the fixed value of pattern parameter propertyList, or null if not bound.
   * @return a match represented as a GetVerticesWithPropertiesMatch object, or null if no match is found.
   * 
   */
  public GetVerticesWithPropertiesMatch getOneArbitraryMatch(final GetVerticesOperator pGetVerticesOperator, final VertexVariable pVertexVariable, final Operator pParentOperator, final PropertyList pPropertyList) {
    return rawGetOneArbitraryMatch(new Object[]{pGetVerticesOperator, pVertexVariable, pParentOperator, pPropertyList});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pGetVerticesOperator the fixed value of pattern parameter getVerticesOperator, or null if not bound.
   * @param pVertexVariable the fixed value of pattern parameter vertexVariable, or null if not bound.
   * @param pParentOperator the fixed value of pattern parameter parentOperator, or null if not bound.
   * @param pPropertyList the fixed value of pattern parameter propertyList, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final GetVerticesOperator pGetVerticesOperator, final VertexVariable pVertexVariable, final Operator pParentOperator, final PropertyList pPropertyList) {
    return rawHasMatch(new Object[]{pGetVerticesOperator, pVertexVariable, pParentOperator, pPropertyList});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pGetVerticesOperator the fixed value of pattern parameter getVerticesOperator, or null if not bound.
   * @param pVertexVariable the fixed value of pattern parameter vertexVariable, or null if not bound.
   * @param pParentOperator the fixed value of pattern parameter parentOperator, or null if not bound.
   * @param pPropertyList the fixed value of pattern parameter propertyList, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final GetVerticesOperator pGetVerticesOperator, final VertexVariable pVertexVariable, final Operator pParentOperator, final PropertyList pPropertyList) {
    return rawCountMatches(new Object[]{pGetVerticesOperator, pVertexVariable, pParentOperator, pPropertyList});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pGetVerticesOperator the fixed value of pattern parameter getVerticesOperator, or null if not bound.
   * @param pVertexVariable the fixed value of pattern parameter vertexVariable, or null if not bound.
   * @param pParentOperator the fixed value of pattern parameter parentOperator, or null if not bound.
   * @param pPropertyList the fixed value of pattern parameter propertyList, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final GetVerticesOperator pGetVerticesOperator, final VertexVariable pVertexVariable, final Operator pParentOperator, final PropertyList pPropertyList, final IMatchProcessor<? super GetVerticesWithPropertiesMatch> processor) {
    rawForEachMatch(new Object[]{pGetVerticesOperator, pVertexVariable, pParentOperator, pPropertyList}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pGetVerticesOperator the fixed value of pattern parameter getVerticesOperator, or null if not bound.
   * @param pVertexVariable the fixed value of pattern parameter vertexVariable, or null if not bound.
   * @param pParentOperator the fixed value of pattern parameter parentOperator, or null if not bound.
   * @param pPropertyList the fixed value of pattern parameter propertyList, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final GetVerticesOperator pGetVerticesOperator, final VertexVariable pVertexVariable, final Operator pParentOperator, final PropertyList pPropertyList, final IMatchProcessor<? super GetVerticesWithPropertiesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pGetVerticesOperator, pVertexVariable, pParentOperator, pPropertyList}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pGetVerticesOperator the fixed value of pattern parameter getVerticesOperator, or null if not bound.
   * @param pVertexVariable the fixed value of pattern parameter vertexVariable, or null if not bound.
   * @param pParentOperator the fixed value of pattern parameter parentOperator, or null if not bound.
   * @param pPropertyList the fixed value of pattern parameter propertyList, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public GetVerticesWithPropertiesMatch newMatch(final GetVerticesOperator pGetVerticesOperator, final VertexVariable pVertexVariable, final Operator pParentOperator, final PropertyList pPropertyList) {
    return GetVerticesWithPropertiesMatch.newMatch(pGetVerticesOperator, pVertexVariable, pParentOperator, pPropertyList);
  }
  
  /**
   * Retrieve the set of values that occur in matches for getVerticesOperator.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<GetVerticesOperator> rawAccumulateAllValuesOfgetVerticesOperator(final Object[] parameters) {
    Set<GetVerticesOperator> results = new HashSet<GetVerticesOperator>();
    rawAccumulateAllValues(POSITION_GETVERTICESOPERATOR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for getVerticesOperator.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<GetVerticesOperator> getAllValuesOfgetVerticesOperator() {
    return rawAccumulateAllValuesOfgetVerticesOperator(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for getVerticesOperator.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<GetVerticesOperator> getAllValuesOfgetVerticesOperator(final GetVerticesWithPropertiesMatch partialMatch) {
    return rawAccumulateAllValuesOfgetVerticesOperator(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for getVerticesOperator.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<GetVerticesOperator> getAllValuesOfgetVerticesOperator(final VertexVariable pVertexVariable, final Operator pParentOperator, final PropertyList pPropertyList) {
    return rawAccumulateAllValuesOfgetVerticesOperator(new Object[]{
    null, 
    pVertexVariable, 
    pParentOperator, 
    pPropertyList
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for vertexVariable.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<VertexVariable> rawAccumulateAllValuesOfvertexVariable(final Object[] parameters) {
    Set<VertexVariable> results = new HashSet<VertexVariable>();
    rawAccumulateAllValues(POSITION_VERTEXVARIABLE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for vertexVariable.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<VertexVariable> getAllValuesOfvertexVariable() {
    return rawAccumulateAllValuesOfvertexVariable(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for vertexVariable.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<VertexVariable> getAllValuesOfvertexVariable(final GetVerticesWithPropertiesMatch partialMatch) {
    return rawAccumulateAllValuesOfvertexVariable(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for vertexVariable.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<VertexVariable> getAllValuesOfvertexVariable(final GetVerticesOperator pGetVerticesOperator, final Operator pParentOperator, final PropertyList pPropertyList) {
    return rawAccumulateAllValuesOfvertexVariable(new Object[]{
    pGetVerticesOperator, 
    null, 
    pParentOperator, 
    pPropertyList
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for parentOperator.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Operator> rawAccumulateAllValuesOfparentOperator(final Object[] parameters) {
    Set<Operator> results = new HashSet<Operator>();
    rawAccumulateAllValues(POSITION_PARENTOPERATOR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for parentOperator.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Operator> getAllValuesOfparentOperator() {
    return rawAccumulateAllValuesOfparentOperator(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for parentOperator.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Operator> getAllValuesOfparentOperator(final GetVerticesWithPropertiesMatch partialMatch) {
    return rawAccumulateAllValuesOfparentOperator(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for parentOperator.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Operator> getAllValuesOfparentOperator(final GetVerticesOperator pGetVerticesOperator, final VertexVariable pVertexVariable, final PropertyList pPropertyList) {
    return rawAccumulateAllValuesOfparentOperator(new Object[]{
    pGetVerticesOperator, 
    pVertexVariable, 
    null, 
    pPropertyList
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for propertyList.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<PropertyList> rawAccumulateAllValuesOfpropertyList(final Object[] parameters) {
    Set<PropertyList> results = new HashSet<PropertyList>();
    rawAccumulateAllValues(POSITION_PROPERTYLIST, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for propertyList.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PropertyList> getAllValuesOfpropertyList() {
    return rawAccumulateAllValuesOfpropertyList(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for propertyList.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PropertyList> getAllValuesOfpropertyList(final GetVerticesWithPropertiesMatch partialMatch) {
    return rawAccumulateAllValuesOfpropertyList(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for propertyList.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PropertyList> getAllValuesOfpropertyList(final GetVerticesOperator pGetVerticesOperator, final VertexVariable pVertexVariable, final Operator pParentOperator) {
    return rawAccumulateAllValuesOfpropertyList(new Object[]{
    pGetVerticesOperator, 
    pVertexVariable, 
    pParentOperator, 
    null
    });
  }
  
  @Override
  protected GetVerticesWithPropertiesMatch tupleToMatch(final Tuple t) {
    try {
    	return GetVerticesWithPropertiesMatch.newMatch((GetVerticesOperator) t.get(POSITION_GETVERTICESOPERATOR), (VertexVariable) t.get(POSITION_VERTEXVARIABLE), (Operator) t.get(POSITION_PARENTOPERATOR), (PropertyList) t.get(POSITION_PROPERTYLIST));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected GetVerticesWithPropertiesMatch arrayToMatch(final Object[] match) {
    try {
    	return GetVerticesWithPropertiesMatch.newMatch((GetVerticesOperator) match[POSITION_GETVERTICESOPERATOR], (VertexVariable) match[POSITION_VERTEXVARIABLE], (Operator) match[POSITION_PARENTOPERATOR], (PropertyList) match[POSITION_PROPERTYLIST]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected GetVerticesWithPropertiesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return GetVerticesWithPropertiesMatch.newMutableMatch((GetVerticesOperator) match[POSITION_GETVERTICESOPERATOR], (VertexVariable) match[POSITION_VERTEXVARIABLE], (Operator) match[POSITION_PARENTOPERATOR], (PropertyList) match[POSITION_PROPERTYLIST]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<GetVerticesWithPropertiesMatcher> querySpecification() throws ViatraQueryException {
    return GetVerticesWithPropertiesQuerySpecification.instance();
  }
}
