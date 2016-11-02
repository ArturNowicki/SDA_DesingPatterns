package exercise2.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import exercise2.utils.IStrategy;

public class Graph {
	private List<Node> graph;
	private IStrategy strategy;
		
	public Graph(IStrategy strategy) {
		graph = new ArrayList<Node>();
		this.strategy = strategy;
	}
	
	public Optional<Node> getNode(int nodeNumber) {
		Optional<Node> node = graph.stream().filter(v -> v.getNodeNumber() == nodeNumber).findFirst();
		return node;
	}
	
	public void addNode(Node node) {
		graph.add(node);
	}
	
	public void removeNode(int nodeNumber) {
		graph = graph.stream().filter(v -> v.getNodeNumber() != nodeNumber).collect(Collectors.toList());
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
