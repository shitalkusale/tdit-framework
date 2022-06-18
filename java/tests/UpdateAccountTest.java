package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.constants;
import pages.HomePage;
import pages.LoginPage;
import pages.UpdateAccountPage;

public class UpdateAccountTest extends TestBase{
	LoginPage loginPage;
	@Test(groups= {"Regression"})
	public void test1VerifyUpdateAccount()
	{
		loginPage= welcomePage.clickOnLoginButton();
		
		HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");                                                                          
		
		UpdateAccountPage UpdateAccPage=homePage.clickonUpdateAccount();
	}
	
	@Test(groups= {"Sanity"})
	public void test2VerifyValidInput() {
		
	loginPage= welcomePage.clickOnLoginButton();
		
		HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");                                                                          
		
		UpdateAccountPage UpdateAccPage=homePage.clickonUpdateAccount();
		
		UpdateAccPage.clicksearchdoUpdateAccount("123456", "123456", "10000");
		
		Assert.assertEquals(UpdateAccPage.getMessageOnTheAlert(), constants.UPDATE_ACCOUNT);
		
		}
	@Test(groups= {"Regression"})
	public void test3VerifyInValidInput() {
		
	loginPage= welcomePage.clickOnLoginButton();
		
		HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");                                                                          
		
		UpdateAccountPage UpdateAccPage=homePage.clickonUpdateAccount();
		
		UpdateAccPage.clicksearchdoUpdateAccount("135456589", "135456589", "10000");
		
		Assert.assertEquals(UpdateAccPage.getMessageOnTheAlert(), constants.INVALID_UPDATE_ACCOUNT);

}
	
	@Test(groups= {"Sanity"})
	public void test4VerifyUpdateAccountTitle()
	{
         loginPage= welcomePage.clickOnLoginButton();
		
		HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");                                                                          
		
		UpdateAccountPage UpdateAccPage=homePage.clickonUpdateAccount();
		
	
		String actualTitle= UpdateAccPage.getTitle();
		
		Assert.assertEquals(actualTitle, constants.UPDATE_ACCOUNT_TITLE);
}
	@Test(groups= {"Regression"})
	public void test5VerifyUpdateAccountTitle1()
	{
         loginPage= welcomePage.clickOnLoginButton();
		
		HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");                                                                          
		
		UpdateAccountPage UpdateAccPage=homePage.clickonUpdateAccount();
		
	
		String actualTitle= UpdateAccPage.getTitle1();
		
		Assert.assertEquals(actualTitle, constants.UPDATE_ACCOUNT_TITLE1);
}
	@Test(groups= {"Regression"})
	public void test6ClickUpdateAccountPageHomeButton()
	{
         loginPage= welcomePage.clickOnLoginButton();
		
		HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");                                                                          
		
	UpdateAccountPage UpdateAccPage=homePage.clickonUpdateAccount();
	
	 HomePage Homepage=UpdateAccPage.UpdateAccountPageclickHomeButton();
	 
//	 Assert.assertEquals(UpdateAccPage.getMessageOnTheAlert(), constants.INVALID_UPDATE_ACCOUNT);
	    
	    
}}