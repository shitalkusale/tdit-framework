package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


import constants.constants;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	
	
	@Test(groups= {"Sanity"})
	public void verifyTitle() {
		
		loginPage= welcomePage.clickOnLoginButton();
		String actualTitle= loginPage.getTitle();
		Assert.assertEquals(actualTitle, constants.LOGIN_PAGE_TITLE);
	}
	
@Test(groups= {"Regression"})
public void verifyIncorrectLogin()
{
	loginPage= welcomePage.clickOnLoginButton();
	
	//loginPage.doLogin("a", "a");
	loginPage.enterUserName("a");
	loginPage.enterPassword("a");
	loginPage.clickLoginButton();
	
	boolean isAlert = loginPage.isAlertPresent();
	
	Assert.assertEquals(isAlert, true);
	
	String actualText=loginPage.getMessageOnTheAlert();
	
	Assert.assertEquals(actualText, constants.INVALID_LOGIN_ALERT_MESSAGE);
	
}
@Test(groups= {"Sanity"})
public void verifyValidLogin()
{
	loginPage= welcomePage.clickOnLoginButton();
	
	HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");
	
	boolean welcomeMessage=homePage.isWelcomeMessagePresent();
	
	Assert.assertEquals(welcomeMessage, welcomeMessage);
		
}
 
}
