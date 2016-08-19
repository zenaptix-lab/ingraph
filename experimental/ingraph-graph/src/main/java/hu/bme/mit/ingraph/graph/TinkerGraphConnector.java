package hu.bme.mit.ingraph.graph;

import java.util.Collection;

import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerGraph;
import org.eclipse.collections.api.multimap.Multimap;
import org.eclipse.collections.api.multimap.MutableMultimap;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.Multimaps;

public class TinkerGraphConnector {
	
	protected TinkerGraph graph;
	
	protected TinkerGraphConnector(TinkerGraph graph) {
		this.graph = graph;
	}
	
	public static TinkerGraphConnector on(TinkerGraph graph) {
		return new TinkerGraphConnector(graph);
	}
	
	public Collection<Vertex> collectVertices(final String vertexType) {
		final Collection<Vertex> vertices = Lists.mutable.of();

		final Iterable<Vertex> graphVertices = () -> graph.vertices();
		for (final Vertex vertex : graphVertices) {
			if (vertex.label().equals(vertexType)) {
				vertices.add(vertex);
			}
		}
		
		return vertices;
	}
	
	public Multimap<Vertex, Vertex> collectEdges(final String edgeType) {
		final MutableMultimap<Vertex, Vertex> edges = Multimaps.mutable.set.with();

		final Iterable<Edge> graphEdges = () -> graph.edges();
		for (final Edge edge : graphEdges) {
			if (edge.label().equals(edgeType)) {
				edges.put(edge.outVertex(), edge.inVertex());
			}
		}

		return edges;
		
	}
	
//	public Collection<Property<?>> collectProperties(final String propertyType) {
//		final Collection<Property<?>> properties = Lists.mutable.of();
//
//		final Iterable<Vertex> vertices = () -> graph.vertices();
//		for (Vertex vertex : vertices) {
//			VertexProperty<Object> propertyValue = vertex.property(propertyType);
//			if (propertyValue != null) {
//				
//			}
//		}
//		
//		return properties;		
//	}
	
}