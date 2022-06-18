package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.internal.annotations.ITest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.WelcomePage;
import utils.Screenshot;


public class TestBase {
	
	public static int i=0;
	WebDriver driver;
	
	WelcomePage welcomePage;
	@BeforeMethod
//  @Parameters({"browser"})
	public void beforeMethod() 
	{
	//	if (browser.equals("Chrome"))
	{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
//	else if(browser.equals("FF"))
	
//		{
//		WebDriverManager.firefoxdriver().setup();
//		driver= new FirefoxDriver();
//	}
		driver.get("http://tool2.tditsolutions.com/");
		
		
		welcomePage= new WelcomePage(driver);
	}

	@AfterMethod
	public void  tearDown(ITestResult result) 
	{
		if (result.getStatus() == ITestResult.FAILURE) 
		{
		//	i=i+1;
		//	String screenshotName = "Screenshot" + i;
			String screenshotName=result.getMethod().getMethodName();
		Screenshot.captureScreenshot(driver, screenshotName);	
		}
		driver.quit();
	}
	}


