package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddAccountPage {
	
	WebDriver driver;
	//Page Elements
	private By Accountname=By.name("aname");
	
	private By Accountnumber=By.name("anumber");
	
	private By Accountfund=By.name("afund");
	
	private By AddAccount=By.xpath("//button[@type='submit']");
	
  private By AddAccountTitle=By.tagName("//h2");
  
  private By ClickHomeButton=By.xpath("//a[@href=\"homepage.php\"]");


//Constructor
public AddAccountPage(WebDriver driver)
{
	this.driver=driver;
}
public void enterAccountname(String accountname)
{
	 
	driver.findElement(Accountname).sendKeys(accountname);
}

public void enterAccountnumber(String accountnumber)
{
	 driver.findElement(Accountnumber).sendKeys(accountnumber);
	 
	}
public void enterAccountfund(String accountfund)
{
	 driver.findElement(Accountfund).sendKeys(accountfund);
	}
public AddAccountPage clickonAddAccount()
{
	 driver.findElement(AddAccount).click();
	 return new AddAccountPage(driver);
	 
}
	 public AddAccountPage doAddAccount(String accountname, String accountnumber,String accountfund)
	 {
		 enterAccountname(accountname);
		 enterAccountnumber(accountnumber);
		 enterAccountfund(accountfund);
		 AddAccountPage AddAccountPage = clickonAddAccount();
		return new AddAccountPage(driver);

	 }
	 
	 public String getTitle()
	 {
		 return driver.getTitle();
	 }
	 
//	 public boolean isAlertPresent() 
// 	{
// 		try {
// 			Alert alert= driver.switchTo().alert();
// 			return true;
// 		}
// 		catch(Exception e)
// 		{
// 			return false;
// 		}
// 	}0
// 		
	 public String getMessageOnTheAlert()
	 
    	{
    		Alert alert = driver.switchTo().alert();
    		System.out.println(alert.getText());
    		String text = alert.getText();
    		alert.accept();
    		return text;
    		}
	
	 public String getTitle1()
		{
			return driver.findElement(AddAccount).getText();
		}

	 public  HomePage AddAccountPageclickHomeButton()
	 {
		 driver.findElement(ClickHomeButton).click();
		 return new HomePage(driver);
	 }
	
	}

