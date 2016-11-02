package exercise3.window.objects;

import java.util.List;

public class ListWindow  extends CloseableWindow implements MessageWindow {

	private List<String> list;

	public ListWindow(List<String> list) {
		this.list = list;
	}

	@Override
	public void displayMessage() {
		System.out.println("List:");
		printList();
	}

	private void printList() {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
