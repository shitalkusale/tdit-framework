package pages;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewTradePage {

	WebDriver driver;
	
	private By AccountNumber=By.name("accnumber");
	
	private By search=By.xpath("//button[@name='search']");
	
	private By viewTrade = By.xpath("//h2[text()='View Trades']");
	
//	private By AccName=By.name("snumber");
	
	 private By NoOfShares=By.xpath("//th[text()='Number of Shares']");
	 
	 private By viewTradeAccountNo = By.id("myInput");
	
	 
	 private By ClickHomeButton=By.xpath("//a[@href='homepage.php']");
	 
	 WebDriverWait wait;
	 
	 public ViewTradePage(WebDriver driver)
	 {
		 this.driver=driver;
		 wait = new WebDriverWait(driver, 10);
	 }
	 public void enterAccountnumber(String AccNumber)
	 {
		 driver.findElement(AccountNumber).sendKeys(AccNumber);
	 }
	 public void clicksearchButton(String Search)
	 {
		 driver.findElement(search).click();
	 }
	 public ViewTradePage clickonViewTrade()
	 {
	 	 driver.findElement(search).click();
	 	 return new ViewTradePage(driver);
	 	 
	 }
	 
	 public boolean isViewTradeDisplayed()
	 {
		 try {
			 wait.until(ExpectedConditions.visibilityOf(driver.findElement(viewTrade)) );
			 return true;
		 }
		catch(Exception e)
		 {
			return false;
		 }
	 }
	 
	 public ViewTradePage doViewTrade(String AccNumber)
	 {
		 enterAccountnumber(AccNumber);
		 ViewTradePage ViewTradePage = clickonViewTrade();
			return new ViewTradePage(driver);
	 }
	
	 public boolean ifAccountPresent(String accountNo)
	 {
		 driver.findElement(viewTradeAccountNo).sendKeys(accountNo);
		 String xpath1 = "//td[text()='";
		 String xpath2 = "']";
		 
		 String accountXpath = xpath1 + accountNo+ xpath2;
		 return driver.findElement(By.xpath(accountXpath)).isDisplayed();
	 }
	 
	 public boolean ifAccountIsNotPresent(String accountNo)
	 {
		 driver.findElement(viewTradeAccountNo).sendKeys(accountNo);
		 String xpath1 = "//td[text()='";
		 String xpath2 = "']";
		 
		 String accountXpath = xpath1 + accountNo+ xpath2;
		 return driver.findElement(By.xpath(accountXpath)).isDisplayed();
	 }
	 
	 
	 public List<String> getAccountData(String accountNo)
	 {
		 driver.findElement(viewTradeAccountNo).sendKeys(accountNo);
		 String xpath1 = "//td[text()='";
		 String xpath2 = "']";
		 
		 String accountXpath = xpath1 + accountNo+ xpath2;
		 String otherElements = accountXpath + "//following-sibling::td";
		 
		 List<String> data = new LinkedList<>();
		 
		 String account = driver.findElement(By.xpath(accountXpath)).getText();
		 
		data.add(account);
		
		List<WebElement> list = driver.findElements(By.xpath(otherElements));
		
		
		for(WebElement e : list)
		{
			data.add(e.getText());
		}
	
		return data;
		 
	 }
	 public List<String> getAccountData1(String accountNo)
	 {
		 driver.findElement(viewTradeAccountNo).sendKeys(accountNo);
		 String xpath1 = "//td[text()='";
		 String xpath2 = "']";
		 
		 String accountXpath = xpath1 + accountNo+ xpath2;
		 String otherElements = accountXpath + "//following-sibling::td";
		 
		 List<String> data = new LinkedList<>();
		 
		 String account = driver.findElement(By.xpath(accountXpath)).getText();
		 
		data.add(account);
		
		List<WebElement> list = driver.findElements(By.xpath(otherElements));
		
		
		for(WebElement e : list)
		{
			data.add(e.getText());
		}
	
		return data;
		 
	 }
	 
//	public  int getNoOfShares(int number ){
//		
//	driver.findElement(NoOfShares).getText();
//	return 10;
//		
//	for(WebElement e : listgetof3)
//	{
//		data.add(e.getText());
//	}
//
//	return data;
	
		
	}

