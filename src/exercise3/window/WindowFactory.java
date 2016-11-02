package exercise3.window;


import java.util.List;

import exercise3.window.objects.ErrorWindow;
import exercise3.window.objects.InfoWindow;
import exercise3.window.objects.InstallWindow;
import exercise3.window.objects.ListWindow;
import exercise3.window.objects.QuestionWindow;
import exercise3.window.objects.WarningWindow;

public class WindowFactory {

	public ErrorWindow createErrorWindow(String errorCause, Integer errorCode, String severity) {
		return new ErrorWindow(errorCause, errorCode, severity);
	}

	public InfoWindow createInfoWindow(String info) {
		return new InfoWindow(info);
	}

	public InstallWindow createInstallWindow(String packageName, Double packageSize) {
		return new InstallWindow(packageName, packageSize);
	}

	public ListWindow createListWindow(List<String> list) {
		return new ListWindow(list);
	}

	public QuestionWindow createQuestionWindow(Integer questionCode) {
		return new QuestionWindow(questionCode);
	}

	public WarningWindow createWarningWindow(String warningCause, String warningMessage) {
		return new WarningWindow(warningCause, warningMessage);
	}
	
}
