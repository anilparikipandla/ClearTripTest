package com.ClearTrip.Utils;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class ConfigReader {

	public static HashMap<String, String> configMap = new HashMap<String, String>();

	public static HashMap<String, String> readConfigFile(String filepath) {
		Properties prop = new Properties();
		InputStream fileStream;

		try {
			ClassLoader loader = ConfigReader.class.getClassLoader();
//			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			fileStream = loader.getResourceAsStream(filepath);

			//Using FileInputStream to read the file
			prop.load(fileStream);

			for (String key : prop.stringPropertyNames()) {
				String value = prop.getProperty(key);
				configMap.put(key, value);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception is " + e.getMessage());
		}
		return configMap;

	}
}
