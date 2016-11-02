package exercise2.main;

import java.util.Optional;

import exercise2.data.Graph;
import exercise2.data.Node;
import exercise2.utils.GraphCreator;
import exercise2.utils.Strategy1;
import exercise2.utils.Strategy2;

public class MainApp {

	public static void main(String[] args) {
		GraphCreator creator = GraphCreator.getInstance();
		Graph graph = creator.createEmptyGraph(10, new Strategy1());
		graph.executeOperation();
		graph.setStrategy(new Strategy2());
		graph.executeOperation();
		graph.listNodes();
		graph.removeNode(4);
		graph.listNodes();
		Node node10 = new Node(10);
		node10.addNeighbour(4);
		node10.addNeighbour(3);
		graph.addNode(node10);
		Optional<Node> node4 = graph.getNode(4);
		if(node4.isPresent()) {
			System.out.println("Neighbours of node" + node4.get().getNodeNumber());
			node4.get().listNeighbours();
		}
		Optional<Node> node = graph.getNode(10);
		if(node.isPresent()) {
			System.out.println("Neighbours of node" + node.get().getNodeNumber());
			node.get().listNeighbours();
		}
	}

}
