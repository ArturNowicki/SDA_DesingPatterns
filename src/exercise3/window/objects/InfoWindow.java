package exercise3.window.objects;

public class InfoWindow extends CloseableWindow implements MessageWindow {

	private String info;

	public InfoWindow(String info) {
		this.info = info;
	}
	
	@Override
	public void displayMessage() {
		System.out.println(info);
	}

}
