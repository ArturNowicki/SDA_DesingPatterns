package exercise1.data;

import java.util.HashMap;
import java.util.Map;

public class Settings {
	
	private Map<String, String> setting;
	
	public Settings() {
		setting = new HashMap<>();
	}

	public void addSetting(String settingName, String settingValue) {
		setting.put(settingName, settingValue);
	}

	public void displaySettings() {
		setting.forEach((k, v) -> {System.out.println(k + ": " + v);});
	}
}
