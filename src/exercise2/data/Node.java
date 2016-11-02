package exercise2.data;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private int nodeNumber;
	private List<Integer> neighbours;
	
	public Node(int nodeNumber) {
		this.neighbours = new ArrayList<Integer>();
		this.nodeNumber = nodeNumber;
	}
	
	public int getNodeNumber() {
		return nodeNumber;
	}
	public void addNeighbour(int number) {
		neighbours.add(number);
	}
	public List<Integer> getNeighbours() {
		return neighbours;
	}

	public void listNeighbours() {
		neighbours.forEach(v -> {System.out.println(v);});
	}
}
