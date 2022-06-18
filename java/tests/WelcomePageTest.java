package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.constants;

public class WelcomePageTest extends TestBase{
	
	@Test(groups= {"Regression"})
	public void verifyWelcomeMesage() {
		
		String actualMessage=welcomePage.getWelcomeMessage();
		
		Assert.assertEquals(actualMessage, constants.WELCOME_MESSAGE);
		}
	
	@Test(groups= {"Sanity"})
	public void verifyLoginButtonPresent()
	{
		Assert.assertEquals(welcomePage.presenceOfLoginButton(), true);
	}
	
	
		
//	@AfterMethod
//	public void afterMethod()
//	{
//		driver.close();
//	}
	}
			
	

