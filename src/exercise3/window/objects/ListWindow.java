package exercise3.window.objects;

public class ListWindow implements Window, CloseableWindow {

	
	@Override
	public void displayMessage() {
		System.out.println("Listing...");
	}

	@Override
	public void close() {
		System.out.println("ClosingListWindow!");
	}

}
