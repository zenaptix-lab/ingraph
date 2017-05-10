/**
 * Generated from platform:/resource/ingraph-patterns/src/ingraph/optimization/patterns/RelalgSimplifier.vql
 */
package ingraph.optimization.patterns.util;

import ingraph.optimization.patterns.PropertyListMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import relalg.PropertyList;
import relalg.PropertyListEntry;

/**
 * A match processor tailored for the ingraph.optimization.patterns.propertyList pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PropertyListProcessor implements IMatchProcessor<PropertyListMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pList the value of pattern parameter list in the currently processed match
   * @param pEntry the value of pattern parameter entry in the currently processed match
   * 
   */
  public abstract void process(final PropertyList pList, final PropertyListEntry pEntry);
  
  @Override
  public void process(final PropertyListMatch match) {
    process(match.getList(), match.getEntry());
  }
}
