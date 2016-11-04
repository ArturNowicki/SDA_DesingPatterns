package exercise7.main;

import java.util.Observable;

public class Timer extends Observable implements Runnable {

	private int delayTime;
	private String name;

	public Timer(String name, int delayTime) {
		this.name = name;
		this.delayTime = delayTime;
	}
	
	@Override
	public void run() {
		System.out.println(name + " is working for " + delayTime + "ms");
		try {
			Thread.sleep(delayTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " finished. Notifying observers.");
		setChanged();
		notifyObservers(name);
	}
}
