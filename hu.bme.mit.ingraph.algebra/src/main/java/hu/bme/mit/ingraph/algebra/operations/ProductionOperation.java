package hu.bme.mit.ingraph.algebra.operations;

import hu.bme.mit.ingraph.algebra.operations.visitors.TreeVisitor;
import lombok.Builder;
import lombok.Getter;

@Builder
public class ProductionOperation extends AbstractOperation {

	@Getter protected WorkerOperation parent;

	public <R> R accept(TreeVisitor<? extends R> visitor) {
		return visitor.visit(this);
	}
	
}
