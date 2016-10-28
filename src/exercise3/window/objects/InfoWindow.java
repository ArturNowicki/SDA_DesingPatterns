package exercise3.window.objects;

public class InfoWindow implements Window, CloseableWindow {

	private String info;

	public InfoWindow(String info) {
		this.info = info;
	}
	
	@Override
	public void displayMessage() {
		System.out.println(info);
	}

	@Override
	public void close() {
		System.out.println("ClosingInfoWindow!");
	}
}
