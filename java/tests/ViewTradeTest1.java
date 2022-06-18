package tests;

import java.util.LinkedList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import constants.constants;
import pages.AddAccountPage;
import pages.BuyTradePage;
import pages.HomePage;
import pages.LoginPage;
import pages.SellTradePage;
import pages.ViewTradePage;

public class ViewTradeTest extends TestBase{
	LoginPage loginPage;
	
	@Test(priority = 1)
	public void verifyViewTrade()
	{
     loginPage= welcomePage.clickOnLoginButton();
		
		HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");  
		
		ViewTradePage viewPage=homePage.clickOnViewTrade();
		
		Assert.assertEquals(viewPage.isViewTradeDisplayed(), true);
		
	}
	
	@Test(priority = 2)
	public void verifyAccountIsPresent() {
		 loginPage= welcomePage.clickOnLoginButton();
			
			HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");  
			
			ViewTradePage viewPage=homePage.clickOnViewTrade();
			
			boolean actual = viewPage.ifAccountPresent("12556");
			
			Assert.assertEquals(actual, true);
		
	}

	
	@Test(priority = 3, dependsOnMethods  = {"verifyAccountIsPresent"})
	public void verifyAccountData()
	{
		 	loginPage= welcomePage.clickOnLoginButton();
			
			HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");  
			
			ViewTradePage viewPage=homePage.clickOnViewTrade();
			
			List<String> actualData = viewPage.getAccountData("12556");
			
           SoftAssert softAssert = new SoftAssert();
			
			softAssert.assertEquals(actualData.get(1), "1");
			softAssert.assertEquals(actualData.get(2), "12");
			softAssert.assertEquals(actualData.get(3), "10");
			softAssert.assertEquals(actualData.get(4), "10");
			softAssert.assertEquals(actualData.get(5), "2019-11-12");
			softAssert.assertEquals(actualData.get(6), "20");
			softAssert.assertEquals(actualData.get(7), "100");
			softAssert.assertEquals(actualData.get(8), "11900");
			softAssert.assertAll();
			
	}
	
	@Test(priority = 4)
	public void verifyAccountIsNotPresent() 
	{
		 loginPage= welcomePage.clickOnLoginButton();
			
			HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");  
			
			ViewTradePage viewPage=homePage.clickOnViewTrade();
			
			boolean actual = viewPage.ifAccountIsNotPresent("-123%00");
			
			Assert.assertEquals(actual, true);
	}
	
         @Test(priority =5)
       public void verifyNumberOfShares() throws InterruptedException 
         {
        	 loginPage= welcomePage.clickOnLoginButton();
 			
 			HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");  
 			
 			BuyTradePage BuyTrade=homePage.clickOnBuyTrade();
            BuyTrade.doBuyTrade("12556", "triveni", "10", "0");
            
            Assert.assertEquals(BuyTrade.getMessageOnTheAlert(),constants.ADD_BUY_TRADE);
         
    		HomePage Hpage=BuyTrade.BuyTradePageclickHomeButton();
            
            Thread.sleep(3000);
            ViewTradePage viewPage=homePage.clickOnViewTrade();
          
            List<String> actualData =viewPage.getAccountData("12345");
      
             SoftAssert softAssert = new SoftAssert();
             softAssert.assertEquals(actualData.get(1),"triveni","Security Number");
             softAssert.assertEquals(actualData.get(2),"0","End of the price is");
             softAssert.assertEquals(actualData.get(3),"10","Number of shares");
             softAssert.assertEquals(actualData.get(4),"0","Purchased price/sell price");
             softAssert.assertAll();
}
         
         @Test(priority =6)
         public void verifyNumberOfSharesAfterSoldTrade() throws InterruptedException 
           {
          	 loginPage= welcomePage.clickOnLoginButton();
   			
   			HomePage homePage=loginPage.doLogin("sshi1", "Welcome@22");  
   			
   			SellTradePage SellTrade=homePage.clickOnSellTrade();
              SellTrade.doSellTrade("12345", "triveni", "10", "100");
              
              Assert.assertEquals(SellTrade.getMessageOnTheAlert(),constants.ADD_SELL_TRADE);
           
      		HomePage Hpage=SellTrade.SellTradePageclickHomeButton();
              
              Thread.sleep(3000);
              ViewTradePage viewPage=homePage.clickOnViewTrade();
            
              List<String> actualData =viewPage.getAccountData("12345");
        
               SoftAssert softAssert = new SoftAssert();
               softAssert.assertEquals(actualData.get(1),"triveni","Security Number");
               softAssert.assertEquals(actualData.get(2),"0","End of the price is");
               softAssert.assertEquals(actualData.get(3),"10","Number of shares");
               softAssert.assertEquals(actualData.get(4),"100","Purchased price/sell price");
               softAssert.assertAll();
         
         
   }
}













