package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.constants;
import pages.DeleteAccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.UpdateAccountPage;


public class DeleteAccountTest extends TestBase {
	
	LoginPage loginPage;
	
	@Test(groups= {"Regression"})
	public void test1VerifyDeleteAccount()
	{
         loginPage= welcomePage.clickOnLoginButton();
		
		HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");                                                                          
		
		DeleteAccountPage DeleteAccPage=homePage.clickonDeleteAccount();
		
	}
	
	@Test(groups= {"Sanity"})
	public void test2VerifyValidInput() throws InterruptedException {
		
		loginPage= welcomePage.clickOnLoginButton();
			
			HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");                                                                          
			
			DeleteAccountPage DeleteAccPage=homePage.clickonDeleteAccount();
			
			
			Thread.sleep(3000);
			DeleteAccPage.clicksearchdoDeleteAccount("89774", "89774");
			Thread.sleep(3000);
			
			Assert.assertEquals(DeleteAccPage.getMessageOnTheAlert(), constants.VALID_DELETE_ACCOUNT);
	}
	
	@Test(groups= {"Regression"})
	public void test3VerifyInValidInput() {
		
		loginPage= welcomePage.clickOnLoginButton();
			
			HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");                                                                          
			
			DeleteAccountPage DeleteAccPage=homePage.clickonDeleteAccount();
			
			DeleteAccPage.clicksearchdoDeleteAccount("", "");
			
			Assert.assertEquals(DeleteAccPage.getMessageOnTheAlert(), constants.INVALID_DELETE_ACCOUNT);
	}
	@Test(groups= {"Sanity"})
	public void test4VerifyDeleteAccountTitle()
	{
         loginPage= welcomePage.clickOnLoginButton();
		
		HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");                                                                          
		
		DeleteAccountPage DeleteAccPage=homePage.clickonDeleteAccount();
		
	
		String actualTitle= DeleteAccPage.getTitle();
		
		Assert.assertEquals(actualTitle, constants.DELETE_ACCOUNT_TITLE);
	}
	
	@Test(groups= {"Regression"})
	public void test5VerifyDeleteAccountTitle1()
	{
         loginPage= welcomePage.clickOnLoginButton();
		
		HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");                                                                          
		
		DeleteAccountPage DeleteAccPage=homePage.clickonDeleteAccount();
		
	
		String actualTitle= DeleteAccPage.getTitle1();
		
		Assert.assertEquals(actualTitle, constants.DELETE_ACCOUNT_TITLE1);
	}
	
	@Test(groups= {"Sanity"})
	public void test6ClickDeleteAccountPageHomeButton()
	{
         loginPage= welcomePage.clickOnLoginButton();
		
		HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");                                                                          
		
		DeleteAccountPage DeleteAccPage=homePage.clickonDeleteAccount();
	
	 HomePage Homepage=DeleteAccPage.DeleteAccountPageclickHomeButton();
	
	}	
}
	
	
	
	