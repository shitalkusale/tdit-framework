package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateAccountPage {
	
	WebDriver driver;
	
	private By Accountnumber=By.name("accnumber");
	
	private By search=By.xpath("//button[@name='search']");
	
	private By Accnumber=By.name("anumber");
	
	private By Accountfund=By.name("afund");
	
	private By UpdateAccount=By.name("register");
	
	 private By UpdateAccountTitle=By.xpath("//h2[contains(text(),'Search')]");
	 
	 private By UpdateAccountTitle1=By.xpath("//h2[contains(text(),'Update Balance')]");
	 
	 private By ClickHomeButton=By.xpath("//a[@href=\"homepage.php\"]");
	//private By UpdateAccount=By.xpath("//a[text()='Update Account']");
	
	public UpdateAccountPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterAccountnumber(String accountnumber)
	{
		driver.findElement(Accountnumber).sendKeys(accountnumber);
	}
	
	public void clicksearchbutton()
	{
		driver.findElement(search).click();
	}
	public void enterAccnumber(String accnumber)
	{
		driver.findElement(Accnumber).sendKeys(accnumber);
	}

	public void enterAccountfund(String afund)
	{
		driver.findElement(Accountfund).sendKeys(afund);
	}
	

	public UpdateAccountPage clickonUpdateBalance()
	{
	 driver.findElement(UpdateAccount).click();
		 return new UpdateAccountPage(driver);}
	
	public UpdateAccountPage clicksearchdoUpdateAccount(String accountnumber, String accnumber,String  afund )
	{
		enterAccountnumber(accountnumber);
		clicksearchbutton();
		enterAccnumber(accnumber);
		enterAccountfund(afund);
		UpdateAccountPage UpdateAccPage=clickonUpdateBalance();
	      return new UpdateAccountPage(driver);
		
		}

		
		public String getTitle()
	{
		return driver.findElement(UpdateAccountTitle).getText();
	}
	public String getTitle1()
	{
		return driver.findElement(UpdateAccountTitle1).getText();
	}
	 public  HomePage UpdateAccountPageclickHomeButton()
	 {
		 driver.findElement(ClickHomeButton).click();
		 return new HomePage(driver);
	 }
	 
	 public String getMessageOnTheAlert1()
	 
 	{
 		Alert alert = driver.switchTo().alert();
 		return alert.getText();
}
	
		 public String getMessageOnTheAlert()
		 
	    	{
	    		Alert alert = driver.switchTo().alert();
	    		return alert.getText();
	}
}