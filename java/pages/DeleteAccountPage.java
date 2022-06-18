package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAccountPage {
	
	WebDriver driver;
	
	private By Accountnumber=By.name("accnumber");
	
	private By search=By.xpath("//button[@name='search']");
	
	private By Accnumber=By.name("anumber");
	
	private By Delete=By.name("delete");
	private By DeleteAccountTitle=By.xpath("//h2[contains(text(),'Search Account')]");
	 
	 private By DeleteAccountTitle1=By.xpath("//h2[contains(text(),'Delete Account')]");
	 
	
	
	private By ClickHomeButton=By.xpath("//a[@href='homepage.php']");
	
	public DeleteAccountPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterAccountnumber(String accountnumber)
	{
		driver.findElement(Accountnumber).sendKeys(accountnumber);
	}
	
	public void clickSearchbutton()
	{
		driver.findElement(search).click();
	}
	
	public void enterAccnumber(String accnumber)
	{
		driver.findElement(Accnumber).sendKeys(accnumber);
	}

	 public  DeleteAccountPage clickdeletebutton()
	 {
		 driver.findElement(Delete).click();
		 return new DeleteAccountPage(driver);
	 }
	 
	 public DeleteAccountPage clicksearchdoDeleteAccount(String accountnumber, String accnumber)
		{
		    enterAccountnumber(accountnumber);
			clickSearchbutton();
			enterAccnumber(accnumber);
			
			DeleteAccountPage DeleteAccPage=clickdeletebutton();
			return new DeleteAccountPage(driver);
	
			}
	 
		public String getTitle()
		{
			return driver.findElement(DeleteAccountTitle).getText();
		}
		public String getTitle1()
		{
			return driver.findElement(DeleteAccountTitle1).getText();
		}
		 public  HomePage DeleteAccountPageclickHomeButton()
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
		    		System.out.println(alert.getText());
		    		String text=alert.getText();
		    		alert.accept();
		    		return alert.getText();
		}
	}


