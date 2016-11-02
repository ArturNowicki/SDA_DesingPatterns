package exercise3.main;

import exercise3.window.WindowFactory;
import exercise3.window.objects.MessageWindow;

public class MainApp {
	
	
	public static void main(String[] args) {
		WindowFactory factory = new WindowFactory();
		MessageWindow warningWindow = factory.createWarningWindow("God hates you!", "random bullshit");
		warningWindow.displayMessage();
	}
}
