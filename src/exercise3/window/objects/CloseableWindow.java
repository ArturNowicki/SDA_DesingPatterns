package exercise3.window.objects;

public interface CloseableWindow {
	public default void close() {
		System.out.println("Closing window!");
	}
}
