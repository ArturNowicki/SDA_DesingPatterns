package exercise7.main;

import java.util.Observable;
import java.util.Observer;

public class TimersObserver implements Observer {

	private String name;

	public TimersObserver(String name) {
		this.name = name;
	}

	
	@Override
	public void update(Observable o, Object message) {
		System.out.println(name + ": I was notified by " + o + ", " + message);
	}
}
