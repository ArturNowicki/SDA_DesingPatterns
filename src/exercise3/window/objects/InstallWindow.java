package exercise3.window.objects;

public class InstallWindow implements UberWindow {

	private String packageName;
	private Double packageSize;

	public InstallWindow(String packageName, Double packageSize) {
		this.packageName = packageName;
		this.packageSize = packageSize;
	}
	
	@Override
	public void displayMessage() {
		System.out.println("Installing package: " + packageName + ", size: " + packageSize);
	}

}
