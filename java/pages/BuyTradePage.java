package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyTradePage {
	
	WebDriver driver;
	
    private By  AccountNumber= By.name("acc_number");
    
    private By SecurityNumber= By.name("snumber");
    
    private By NumberOfShares= By.name("n");
    
    private By PurchasePrice=By.name("pp");
    
    private By AddTrade=By.xpath("//button[@name='add_trade']");
    
    private By ClickHomeButton=By.xpath("//a[@href='homepage.php']");
    
    public BuyTradePage(WebDriver driver)
    {
    	this.driver=driver;
    }
    
    public void enterAccountNumber(String acc_number)
    {
    	driver.findElement(AccountNumber).sendKeys(acc_number);
    }
    
    public void enterSecurityNumber(String snumber)
    {
    	driver.findElement(SecurityNumber).sendKeys(snumber);
    }
    
    public void enterNumberOfShares(String n)
    {
    	driver.findElement(NumberOfShares).sendKeys(n);
    }
    
    public void enterPurchasePrice(String pp)
    	{
    	driver.findElement(PurchasePrice).sendKeys(pp);
    }
    
    public BuyTradePage clickAddTrade()
    {
    	driver.findElement(AddTrade).click();
    	return new BuyTradePage(driver);
    }
    
    public BuyTradePage doBuyTrade(String acc_number,String snumber,String n,String pp)
    {
    	enterAccountNumber(acc_number);
    	enterSecurityNumber(snumber);
    	enterNumberOfShares(n);
    	enterPurchasePrice(pp);
    	BuyTradePage BuyTradePage=clickAddTrade();
    	return new BuyTradePage(driver);
    	
    	}
    
    public HomePage BuyTradePageclickHomeButton()
    {
    	driver.findElement(ClickHomeButton).click();
    	return new HomePage(driver);
}
    public String getMessageOnTheAlert()
	 
	{
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String text = alert.getText();
		alert.accept();
		return text;
		}
    
}