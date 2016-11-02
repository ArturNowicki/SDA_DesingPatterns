package exercise2.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import exercise2.utils.IStrategy;

public class Graph {
	private List<Node> graph;
	private IStrategy strategy;
		
	public Graph(IStrategy strategy) {
		graph = new ArrayList<Node>();
		this.strategy = strategy;
	}
	
	public void addNode(Node node) {
		graph.add(node);
	}
	
	public void removeNode(int index) {
		graph.stream().filter(v -> v.getNodeNumber() != index).collect(Collectors.toList());
	}
	
	public void listNodes() {
		graph.forEach(v -> {
			System.out.println(v.getNodeNumber());
			}
		);
	}
	
	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void executeOperation() {
		strategy.executeOperation();
	}
}
