package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SellTradePage {
	WebDriver driver;
	
	private By AccountNumber= By.name("acc_number");
	
	private By SecurityNumber= By.name("snumber");
	
	private By NumberOfShares= By.name("n");
	
	private By Sellprice= By.name("sp");
	
	private By SellTrade=By.xpath("//button[text()='Sell Trade']");
			
	private By ClickHomeButton=By.xpath("//a[@href='homepage.php']");
	
	public SellTradePage(WebDriver driver)
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
	
	public void enterSellPrice(String sp)
	{
		driver.findElement(Sellprice).sendKeys(sp);
	}
	
	public SellTradePage clicksellTrade()
	{
		driver.findElement(SellTrade).click();
		return new SellTradePage(driver);
	}
	
	public SellTradePage doSellTrade(String acc_number,String snumber,String n,String sp)
	{
		enterAccountNumber(acc_number);
    	enterSecurityNumber(snumber);
    	enterNumberOfShares(n);
    	enterSellPrice(sp);
    	SellTradePage SellTradePage=clicksellTrade();
    	return new SellTradePage(driver);
	}
	
	  public HomePage SellTradePageclickHomeButton()
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