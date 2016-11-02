package exercise3.window.objects;

public class ErrorWindow implements UberWindow {

	private String errorCause;
	private Integer errorCode;
	private String severity;
	
	public ErrorWindow(String errorCause, Integer errorCode, String severity) {
		this.errorCause = errorCause;
		this.errorCode = errorCode;
		this.severity = severity;
	}
	
	@Override
	public void displayMessage() {
		System.out.println("ERROR: " + errorCode + ": " + errorCause + ". Severity: " + severity);
	}
	
}
