package exercise3.window.objects;

public class InfoWindow implements UberWindow {

	private String info;

	public InfoWindow(String info) {
		this.info = info;
	}
	
	@Override
	public void displayMessage() {
		System.out.println(info);
	}

}
