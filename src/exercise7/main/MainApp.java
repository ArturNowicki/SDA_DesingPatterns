package exercise7.main;

public class MainApp {

	public static void main(String[] args) {
		TimersObserver peter = new TimersObserver("Peter");
		Timer t1 = new Timer("t1", 1000);
		Timer t2 = new Timer("t2", 3000);
		Timer t3 = new Timer("t3", 5000);
		t1.addObserver(peter);
		t2.addObserver(peter);
		t3.addObserver(peter);
		t1.run();
		t2.run();
		t3.run();
	}

}
