package exercise3.window.objects;

public class WarningWindow implements UberWindow {

	private String warningCause;
	private String warningMessage;
	
	public WarningWindow(String warningCause, String warningMessage) {
		this.warningCause = warningCause;
		this.warningMessage = warningMessage;
	}
	
	@Override
	public void displayMessage() {
		System.out.println("Warning: " + warningMessage + ", caused by: " + warningCause);
	}

}
