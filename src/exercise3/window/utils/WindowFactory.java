package exercise3.window.utils;


import java.util.List;

import exercise3.window.objects.ErrorWindow;
import exercise3.window.objects.InfoWindow;
import exercise3.window.objects.InstallWindow;
import exercise3.window.objects.ListWindow;
import exercise3.window.objects.QuestionWindow;
import exercise3.window.objects.UberWindow;
import exercise3.window.objects.WarningWindow;

public class WindowFactory {

	public UberWindow createErrorWindow(String errorCause, Integer errorCode, String severity) {
		return new ErrorWindow(errorCause, errorCode, severity);
	}

	public UberWindow createInfoWindow(String info) {
		return new InfoWindow(info);
	}

	public UberWindow createInstallWindow(String packageName, Double packageSize) {
		return new InstallWindow(packageName, packageSize);
	}

	public UberWindow createListWindow(List<String> list) {
		return new ListWindow(list);
	}

	public UberWindow createWarningWindow(String warningCause, String warningMessage) {
		return new WarningWindow(warningCause, warningMessage);
	}
	
	public QuestionWindow createQuestionWindow(Integer questionCode) {
		return new QuestionWindow(questionCode);
	}

}
