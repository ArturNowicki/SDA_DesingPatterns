package exercise1.main;

import exercise1.data.Settings;
import exercise1.utils.SettingsReader;

public class MainApp {

	public static void main(String[] args) {
		Settings settings = new Settings();
		SettingsReader reader = SettingsReader.getInstance();
		settings = reader.readSettings();
		settings.displaySettings();
	}
}
