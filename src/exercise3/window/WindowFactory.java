package exercise3.window;

import exercise3.window.objects.ErrorWindow;

public class WindowFactory {

	public ErrorWindow createErrorWindow(String errorCause, Integer errorCode, String severity) {
		return new ErrorWindow(errorCause, errorCode, severity);
	}
	
}
