package exercise2.data;

import exercise2.utils.GraphCreator;

public class MainApp {

	public static void main(String[] args) {
		GraphCreator creator = GraphCreator.getInstance();
		creator.createEmptyGraph(10);
	}

}
