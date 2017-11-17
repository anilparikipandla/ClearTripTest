package com.ClearTrip.Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class CaptureScreen {
	static File scrFile;
	static String destpath = ConfigReader.configFile().get("ScreenshotsPath");
	static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	static File destFile = new File(destpath+timeStamp+".png");
	
	public static void getScreenshot(WebDriver driver){
		
		try{
		scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,destFile);
		System.out.println("Screenshot Captured...");
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}