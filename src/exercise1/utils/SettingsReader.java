package exercise1.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import exercise1.data.Settings;

public class SettingsReader {
	public static final String INPUT_FILE_PATH = "./Resources/settings";
	
	private static SettingsReader instance = new SettingsReader();

	private SettingsReader() {};
	
	public static SettingsReader getInstance() { // synchronized?
		return instance;
	}
	
	public Settings readSettings() {
		Settings settings = new Settings();
		try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_PATH))) {
			String newLine = null;
			while((newLine = br.readLine()) != null) {
				String[] setting = newLine.split("=");
				settings.addSetting(setting[0], setting[1]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return settings;
	}
	
}
