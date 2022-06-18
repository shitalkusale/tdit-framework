package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public static void captureScreenshot(WebDriver driver, String screenshotName)
	{
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		 
	     FileUtils.copyFile(file, new File("C:\\Selenium\\Screens\\"+ screenshotName+ ".jpg"));
	
	} catch(IOException e) {
	e.printStackTrace();
//		System.out.println("Exception while taking screenshot"+e.getMessage());
	}
}}
