/**
 * Generated from platform:/resource/ingraph-patterns/src/ingraph/optimization/patterns/RelalgSimplifier.vql
 */
package ingraph.optimization.patterns;

import ingraph.optimization.patterns.util.GetVerticesWithPropertiesQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import relalg.GetVerticesOperator;
import relalg.Operator;
import relalg.PropertyList;
import relalg.VertexVariable;

/**
 * Pattern-specific match representation of the ingraph.optimization.patterns.getVerticesWithProperties pattern,
 * to be used in conjunction with {@link GetVerticesWithPropertiesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see GetVerticesWithPropertiesMatcher
 * @see GetVerticesWithPropertiesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class GetVerticesWithPropertiesMatch extends BasePatternMatch {
  private GetVerticesOperator fGetVerticesOperator;
  
  private VertexVariable fVertexVariable;
  
  private Operator fParentOperator;
  
  private PropertyList fPropertyList;
  
  private static List<String> parameterNames = makeImmutableList("getVerticesOperator", "vertexVariable", "parentOperator", "propertyList");
  
  private GetVerticesWithPropertiesMatch(final GetVerticesOperator pGetVerticesOperator, final VertexVariable pVertexVariable, final Operator pParentOperator, final PropertyList pPropertyList) {
    this.fGetVerticesOperator = pGetVerticesOperator;
    this.fVertexVariable = pVertexVariable;
    this.fParentOperator = pParentOperator;
    this.fPropertyList = pPropertyList;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("getVerticesOperator".equals(parameterName)) return this.fGetVerticesOperator;
    if ("vertexVariable".equals(parameterName)) return this.fVertexVariable;
    if ("parentOperator".equals(parameterName)) return this.fParentOperator;
    if ("propertyList".equals(parameterName)) return this.fPropertyList;
    return null;
  }
  
  public GetVerticesOperator getGetVerticesOperator() {
    return this.fGetVerticesOperator;
  }
  
  public VertexVariable getVertexVariable() {
    return this.fVertexVariable;
  }
  
  public Operator getParentOperator() {
    return this.fParentOperator;
  }
  
  public PropertyList getPropertyList() {
    return this.fPropertyList;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("getVerticesOperator".equals(parameterName) ) {
    	this.fGetVerticesOperator = (GetVerticesOperator) newValue;
    	return true;
    }
    if ("vertexVariable".equals(parameterName) ) {
    	this.fVertexVariable = (VertexVariable) newValue;
    	return true;
    }
    if ("parentOperator".equals(parameterName) ) {
    	this.fParentOperator = (Operator) newValue;
    	return true;
    }
    if ("propertyList".equals(parameterName) ) {
    	this.fPropertyList = (PropertyList) newValue;
    	return true;
    }
    return false;
  }
  
  public void setGetVerticesOperator(final GetVerticesOperator pGetVerticesOperator) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fGetVerticesOperator = pGetVerticesOperator;
  }
  
  public void setVertexVariable(final VertexVariable pVertexVariable) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fVertexVariable = pVertexVariable;
  }
  
  public void setParentOperator(final Operator pParentOperator) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fParentOperator = pParentOperator;
  }
  
  public void setPropertyList(final PropertyList pPropertyList) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPropertyList = pPropertyList;
  }
  
  @Override
  public String patternName() {
    return "ingraph.optimization.patterns.getVerticesWithProperties";
  }
  
  @Override
  public List<String> parameterNames() {
    return GetVerticesWithPropertiesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fGetVerticesOperator, fVertexVariable, fParentOperator, fPropertyList};
  }
  
  @Override
  public GetVerticesWithPropertiesMatch toImmutable() {
    return isMutable() ? newMatch(fGetVerticesOperator, fVertexVariable, fParentOperator, fPropertyList) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"getVerticesOperator\"=" + prettyPrintValue(fGetVerticesOperator) + ", ");
    
    result.append("\"vertexVariable\"=" + prettyPrintValue(fVertexVariable) + ", ");
    
    result.append("\"parentOperator\"=" + prettyPrintValue(fParentOperator) + ", ");
    
    result.append("\"propertyList\"=" + prettyPrintValue(fPropertyList)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fGetVerticesOperator == null) ? 0 : fGetVerticesOperator.hashCode());
    result = prime * result + ((fVertexVariable == null) ? 0 : fVertexVariable.hashCode());
    result = prime * result + ((fParentOperator == null) ? 0 : fParentOperator.hashCode());
    result = prime * result + ((fPropertyList == null) ? 0 : fPropertyList.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof GetVerticesWithPropertiesMatch)) { // this should be infrequent
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
    GetVerticesWithPropertiesMatch other = (GetVerticesWithPropertiesMatch) obj;
    if (fGetVerticesOperator == null) {if (other.fGetVerticesOperator != null) return false;}
    else if (!fGetVerticesOperator.equals(other.fGetVerticesOperator)) return false;
    if (fVertexVariable == null) {if (other.fVertexVariable != null) return false;}
    else if (!fVertexVariable.equals(other.fVertexVariable)) return false;
    if (fParentOperator == null) {if (other.fParentOperator != null) return false;}
    else if (!fParentOperator.equals(other.fParentOperator)) return false;
    if (fPropertyList == null) {if (other.fPropertyList != null) return false;}
    else if (!fPropertyList.equals(other.fPropertyList)) return false;
    return true;
  }
  
  @Override
  public GetVerticesWithPropertiesQuerySpecification specification() {
    try {
    	return GetVerticesWithPropertiesQuerySpecification.instance();
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
  public static GetVerticesWithPropertiesMatch newEmptyMatch() {
    return new Mutable(null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pGetVerticesOperator the fixed value of pattern parameter getVerticesOperator, or null if not bound.
   * @param pVertexVariable the fixed value of pattern parameter vertexVariable, or null if not bound.
   * @param pParentOperator the fixed value of pattern parameter parentOperator, or null if not bound.
   * @param pPropertyList the fixed value of pattern parameter propertyList, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static GetVerticesWithPropertiesMatch newMutableMatch(final GetVerticesOperator pGetVerticesOperator, final VertexVariable pVertexVariable, final Operator pParentOperator, final PropertyList pPropertyList) {
    return new Mutable(pGetVerticesOperator, pVertexVariable, pParentOperator, pPropertyList);
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
  public static GetVerticesWithPropertiesMatch newMatch(final GetVerticesOperator pGetVerticesOperator, final VertexVariable pVertexVariable, final Operator pParentOperator, final PropertyList pPropertyList) {
    return new Immutable(pGetVerticesOperator, pVertexVariable, pParentOperator, pPropertyList);
  }
  
  private static final class Mutable extends GetVerticesWithPropertiesMatch {
    Mutable(final GetVerticesOperator pGetVerticesOperator, final VertexVariable pVertexVariable, final Operator pParentOperator, final PropertyList pPropertyList) {
      super(pGetVerticesOperator, pVertexVariable, pParentOperator, pPropertyList);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends GetVerticesWithPropertiesMatch {
    Immutable(final GetVerticesOperator pGetVerticesOperator, final VertexVariable pVertexVariable, final Operator pParentOperator, final PropertyList pPropertyList) {
      super(pGetVerticesOperator, pVertexVariable, pParentOperator, pPropertyList);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
