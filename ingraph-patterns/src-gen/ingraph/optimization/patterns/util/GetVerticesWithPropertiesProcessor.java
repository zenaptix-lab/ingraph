/**
 * Generated from platform:/resource/ingraph-patterns/src/ingraph/optimization/patterns/RelalgSimplifier.vql
 */
package ingraph.optimization.patterns.util;

import ingraph.optimization.patterns.GetVerticesWithPropertiesMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import relalg.GetVerticesOperator;
import relalg.Operator;
import relalg.PropertyList;
import relalg.VertexVariable;

/**
 * A match processor tailored for the ingraph.optimization.patterns.getVerticesWithProperties pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class GetVerticesWithPropertiesProcessor implements IMatchProcessor<GetVerticesWithPropertiesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pGetVerticesOperator the value of pattern parameter getVerticesOperator in the currently processed match
   * @param pVertexVariable the value of pattern parameter vertexVariable in the currently processed match
   * @param pParentOperator the value of pattern parameter parentOperator in the currently processed match
   * @param pPropertyList the value of pattern parameter propertyList in the currently processed match
   * 
   */
  public abstract void process(final GetVerticesOperator pGetVerticesOperator, final VertexVariable pVertexVariable, final Operator pParentOperator, final PropertyList pPropertyList);
  
  @Override
  public void process(final GetVerticesWithPropertiesMatch match) {
    process(match.getGetVerticesOperator(), match.getVertexVariable(), match.getParentOperator(), match.getPropertyList());
  }
}
