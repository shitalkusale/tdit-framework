package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	private By welcomeMessage=By.xpath("//h3[contains(text(),'Welcome')]");
	
    private By addAccountLink= By.xpath("//a[text()='Add Account']");
    
    private By UpdateAccountLink=By.xpath("//a[text()='Update Account']");
    
    private By DeleteAccountLink=By.xpath("//a[text()='Delete Account']");
    
    private By ViewTradeLink=By.xpath("//a[text()='View Trade']");
    
    private By BuyTradeLink=By.xpath("//a[text()='Buy Trade']");
    
    private By SellTradeLink=By.xpath("//a[text()='Sell Trade']");
 

	public HomePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public boolean isWelcomeMessagePresent() {
		return driver.findElement(welcomeMessage).isDisplayed();
	}
	
	public AddAccountPage clickonAddAccount() {
		// TODO Auto-generated method stub
		driver.findElement(addAccountLink).click();
		return new AddAccountPage(driver);
	}
	
     public UpdateAccountPage clickonUpdateAccount() 
	{
		driver.findElement(UpdateAccountLink).click();
		return new UpdateAccountPage(driver);
	}
     
     public DeleteAccountPage clickonDeleteAccount() 
 	{
 		driver.findElement(DeleteAccountLink).click();
 		return new DeleteAccountPage(driver);
 	}
     
     public ViewTradePage clickOnViewTrade() 
     {
       driver.findElement(ViewTradeLink).click();
       return new ViewTradePage(driver);
     }
     
     public BuyTradePage clickOnBuyTrade() 
     {
       driver.findElement(BuyTradeLink).click();
       return new BuyTradePage(driver);
     }
     
     public SellTradePage clickOnSellTrade() 
     {
       driver.findElement(SellTradeLink).click();
       return new SellTradePage(driver);
     }
}





	

