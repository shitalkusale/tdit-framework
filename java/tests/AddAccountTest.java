package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants.constants;
import pages.AddAccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.UpdateAccountPage;

public class AddAccountTest extends TestBase {
	LoginPage loginPage;
		@Test(groups= {"Smoke"})
	public void test1VerifyAddAccount()
	{
		loginPage= welcomePage.clickOnLoginButton();
		
		HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");                                                                          
		
		AddAccountPage accPage=homePage.clickonAddAccount();
		
		}

	 @Test(groups= {"Smoke"})
	 public void test2verifyValidInput()
	 {
		 
		 loginPage= welcomePage.clickOnLoginButton();
			
			HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");                                                                          
			
			AddAccountPage accPage=homePage.clickonAddAccount();
			
			accPage.doAddAccount("6890040", "9807550", "800000");

	   Assert.assertEquals(accPage.getMessageOnTheAlert(), constants.VALID_ADD_ACCOUNT);
	 }
		 
		 @Test(groups= {"Sanity"})
		 public void test3verifyInvalidInput()
		 {
			 
			 loginPage= welcomePage.clickOnLoginButton();
				
				HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");                                                                          
				
				AddAccountPage accPage=homePage.clickonAddAccount();
				
				accPage.doAddAccount("-%%%1009$@!l", "98072002", "8979823");

	            Assert.assertEquals(accPage.getMessageOnTheAlert(), constants.INVALID_ADD_ACCOUNT);
	            
	            
       
	 }
	 @Test(groups= {"Sanity"})
		public void test4VerifyAddAccountTitle()
		{
			loginPage= welcomePage.clickOnLoginButton();
			
			HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");                                                                          
			
			AddAccountPage accPage=homePage.clickonAddAccount();
			
	        String actualTitle= accPage.getTitle1();
			
			Assert.assertEquals(actualTitle, constants.ADD_ACCOUNT_TITLE);
			
     
		}
	 
	 @Test(groups= {"Smoke"})
		public void test5ClickAddAccountPageHomeButton()
		{
	         loginPage= welcomePage.clickOnLoginButton();
			
			HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");                                                                          
			
			AddAccountPage accPage=homePage.clickonAddAccount();
		
		    HomePage Hpage=accPage.AddAccountPageclickHomeButton();
		}
	 }

