package com.ClearTrip.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class ConfigReader {

	private static HashMap<String, String> configMap = new HashMap<String, String>();

	public static HashMap<String, String> readConfigFile(String filepath) {
			File file = new File(filepath);
			Properties prop = new Properties();
			FileInputStream fileStream;
			try {
//				ClassLoader loader = ConfigReader.class.getClassLoader();
//				ClassLoader loader = Thread.currentThread().getContextClassLoader();
//				fileStream = loader.getResourceAsStream(filepath);
				fileStream =  new FileInputStream(file);
				
				//Using FileInputStream to read the file
				prop.load(fileStream);
				fileStream.close();
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

	public static HashMap<String, String> configFile(){
		if(configMap.isEmpty()){
			try {
				throw new Exception("Please read the Config file before accessing it.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return configMap;
	}

}
