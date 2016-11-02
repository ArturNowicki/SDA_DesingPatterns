package exercise3.main;

import exercise3.window.objects.QuestionWindow;
import exercise3.window.objects.UberWindow;
import exercise3.window.utils.WindowFactory;

public class MainApp {
	
	
	public static void main(String[] args) {
		WindowFactory factory = new WindowFactory();
		UberWindow warningWindow = factory.createErrorWindow("God hates you!", 123, "so-so");
		warningWindow.displayMessage();
		warningWindow.close();
		QuestionWindow questionWindow = factory.createQuestionWindow(2141);		
		questionWindow.displayMessage();
	}
}
