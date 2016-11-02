package exercise2.utils;

import exercise2.data.Graph;
import exercise2.data.Node;

public class GraphCreator {
	private static GraphCreator instance = new GraphCreator();
	
	private GraphCreator() {}
	
	public static GraphCreator getInstance() {
		return instance;
	}
	
	public Graph createEmptyGraph(int size, IStrategy strategy) {
		Graph graph = new Graph(strategy);
		for (int i = 0; i < size; i++) {
			graph.addNode(new Node(i));
		}
		return graph;
	}
	
}
