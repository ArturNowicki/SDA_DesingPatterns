package exercise3.main;

import exercise3.window.WindowFactory;
import exercise3.window.objects.CloseableWindow;

public class MainApp {
	
	
	public static void main(String[] args) {
		WindowFactory factory = new WindowFactory();
		CloseableWindow errorWindow = factory.createErrorWindow("because god hates you!", 313, "severe");

	}
}
