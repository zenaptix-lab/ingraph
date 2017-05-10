/**
 * Generated from platform:/resource/ingraph-patterns/src/ingraph/optimization/patterns/RelalgSimplifier.vql
 */
package ingraph.optimization.patterns;

import ingraph.optimization.patterns.PropertyListMatch;
import ingraph.optimization.patterns.util.PropertyListQuerySpecification;
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
import relalg.PropertyList;
import relalg.PropertyListEntry;

/**
 * Generated pattern matcher API of the ingraph.optimization.patterns.propertyList pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link PropertyListMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern propertyList(list : PropertyList, entry : PropertyListEntry) {
 *   PropertyList.entries(list, entry);
 * }
 * </pre></code>
 * 
 * @see PropertyListMatch
 * @see PropertyListProcessor
 * @see PropertyListQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class PropertyListMatcher extends BaseMatcher<PropertyListMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static PropertyListMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    PropertyListMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (PropertyListMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static PropertyListMatcher create() throws ViatraQueryException {
    return new PropertyListMatcher();
  }
  
  private final static int POSITION_LIST = 0;
  
  private final static int POSITION_ENTRY = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PropertyListMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private PropertyListMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pList the fixed value of pattern parameter list, or null if not bound.
   * @param pEntry the fixed value of pattern parameter entry, or null if not bound.
   * @return matches represented as a PropertyListMatch object.
   * 
   */
  public Collection<PropertyListMatch> getAllMatches(final PropertyList pList, final PropertyListEntry pEntry) {
    return rawGetAllMatches(new Object[]{pList, pEntry});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pList the fixed value of pattern parameter list, or null if not bound.
   * @param pEntry the fixed value of pattern parameter entry, or null if not bound.
   * @return a match represented as a PropertyListMatch object, or null if no match is found.
   * 
   */
  public PropertyListMatch getOneArbitraryMatch(final PropertyList pList, final PropertyListEntry pEntry) {
    return rawGetOneArbitraryMatch(new Object[]{pList, pEntry});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pList the fixed value of pattern parameter list, or null if not bound.
   * @param pEntry the fixed value of pattern parameter entry, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final PropertyList pList, final PropertyListEntry pEntry) {
    return rawHasMatch(new Object[]{pList, pEntry});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pList the fixed value of pattern parameter list, or null if not bound.
   * @param pEntry the fixed value of pattern parameter entry, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final PropertyList pList, final PropertyListEntry pEntry) {
    return rawCountMatches(new Object[]{pList, pEntry});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pList the fixed value of pattern parameter list, or null if not bound.
   * @param pEntry the fixed value of pattern parameter entry, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final PropertyList pList, final PropertyListEntry pEntry, final IMatchProcessor<? super PropertyListMatch> processor) {
    rawForEachMatch(new Object[]{pList, pEntry}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pList the fixed value of pattern parameter list, or null if not bound.
   * @param pEntry the fixed value of pattern parameter entry, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final PropertyList pList, final PropertyListEntry pEntry, final IMatchProcessor<? super PropertyListMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pList, pEntry}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pList the fixed value of pattern parameter list, or null if not bound.
   * @param pEntry the fixed value of pattern parameter entry, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public PropertyListMatch newMatch(final PropertyList pList, final PropertyListEntry pEntry) {
    return PropertyListMatch.newMatch(pList, pEntry);
  }
  
  /**
   * Retrieve the set of values that occur in matches for list.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<PropertyList> rawAccumulateAllValuesOflist(final Object[] parameters) {
    Set<PropertyList> results = new HashSet<PropertyList>();
    rawAccumulateAllValues(POSITION_LIST, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for list.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PropertyList> getAllValuesOflist() {
    return rawAccumulateAllValuesOflist(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for list.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PropertyList> getAllValuesOflist(final PropertyListMatch partialMatch) {
    return rawAccumulateAllValuesOflist(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for list.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PropertyList> getAllValuesOflist(final PropertyListEntry pEntry) {
    return rawAccumulateAllValuesOflist(new Object[]{
    null, 
    pEntry
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for entry.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<PropertyListEntry> rawAccumulateAllValuesOfentry(final Object[] parameters) {
    Set<PropertyListEntry> results = new HashSet<PropertyListEntry>();
    rawAccumulateAllValues(POSITION_ENTRY, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for entry.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PropertyListEntry> getAllValuesOfentry() {
    return rawAccumulateAllValuesOfentry(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for entry.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PropertyListEntry> getAllValuesOfentry(final PropertyListMatch partialMatch) {
    return rawAccumulateAllValuesOfentry(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for entry.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PropertyListEntry> getAllValuesOfentry(final PropertyList pList) {
    return rawAccumulateAllValuesOfentry(new Object[]{
    pList, 
    null
    });
  }
  
  @Override
  protected PropertyListMatch tupleToMatch(final Tuple t) {
    try {
    	return PropertyListMatch.newMatch((PropertyList) t.get(POSITION_LIST), (PropertyListEntry) t.get(POSITION_ENTRY));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected PropertyListMatch arrayToMatch(final Object[] match) {
    try {
    	return PropertyListMatch.newMatch((PropertyList) match[POSITION_LIST], (PropertyListEntry) match[POSITION_ENTRY]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected PropertyListMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return PropertyListMatch.newMutableMatch((PropertyList) match[POSITION_LIST], (PropertyListEntry) match[POSITION_ENTRY]);
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
  public static IQuerySpecification<PropertyListMatcher> querySpecification() throws ViatraQueryException {
    return PropertyListQuerySpecification.instance();
  }
}
