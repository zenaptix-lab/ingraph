/**
 * Generated from platform:/resource/ingraph-patterns/src/ingraph/optimization/patterns/RelalgSimplifier.vql
 */
package ingraph.optimization.patterns;

import ingraph.optimization.patterns.util.PropertyListQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import relalg.PropertyList;
import relalg.PropertyListEntry;

/**
 * Pattern-specific match representation of the ingraph.optimization.patterns.propertyList pattern,
 * to be used in conjunction with {@link PropertyListMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see PropertyListMatcher
 * @see PropertyListProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class PropertyListMatch extends BasePatternMatch {
  private PropertyList fList;
  
  private PropertyListEntry fEntry;
  
  private static List<String> parameterNames = makeImmutableList("list", "entry");
  
  private PropertyListMatch(final PropertyList pList, final PropertyListEntry pEntry) {
    this.fList = pList;
    this.fEntry = pEntry;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("list".equals(parameterName)) return this.fList;
    if ("entry".equals(parameterName)) return this.fEntry;
    return null;
  }
  
  public PropertyList getList() {
    return this.fList;
  }
  
  public PropertyListEntry getEntry() {
    return this.fEntry;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("list".equals(parameterName) ) {
    	this.fList = (PropertyList) newValue;
    	return true;
    }
    if ("entry".equals(parameterName) ) {
    	this.fEntry = (PropertyListEntry) newValue;
    	return true;
    }
    return false;
  }
  
  public void setList(final PropertyList pList) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fList = pList;
  }
  
  public void setEntry(final PropertyListEntry pEntry) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEntry = pEntry;
  }
  
  @Override
  public String patternName() {
    return "ingraph.optimization.patterns.propertyList";
  }
  
  @Override
  public List<String> parameterNames() {
    return PropertyListMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fList, fEntry};
  }
  
  @Override
  public PropertyListMatch toImmutable() {
    return isMutable() ? newMatch(fList, fEntry) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"list\"=" + prettyPrintValue(fList) + ", ");
    
    result.append("\"entry\"=" + prettyPrintValue(fEntry)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fList == null) ? 0 : fList.hashCode());
    result = prime * result + ((fEntry == null) ? 0 : fEntry.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof PropertyListMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    PropertyListMatch other = (PropertyListMatch) obj;
    if (fList == null) {if (other.fList != null) return false;}
    else if (!fList.equals(other.fList)) return false;
    if (fEntry == null) {if (other.fEntry != null) return false;}
    else if (!fEntry.equals(other.fEntry)) return false;
    return true;
  }
  
  @Override
  public PropertyListQuerySpecification specification() {
    try {
    	return PropertyListQuerySpecification.instance();
    } catch (ViatraQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static PropertyListMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pList the fixed value of pattern parameter list, or null if not bound.
   * @param pEntry the fixed value of pattern parameter entry, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static PropertyListMatch newMutableMatch(final PropertyList pList, final PropertyListEntry pEntry) {
    return new Mutable(pList, pEntry);
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
  public static PropertyListMatch newMatch(final PropertyList pList, final PropertyListEntry pEntry) {
    return new Immutable(pList, pEntry);
  }
  
  private static final class Mutable extends PropertyListMatch {
    Mutable(final PropertyList pList, final PropertyListEntry pEntry) {
      super(pList, pEntry);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends PropertyListMatch {
    Immutable(final PropertyList pList, final PropertyListEntry pEntry) {
      super(pList, pEntry);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
