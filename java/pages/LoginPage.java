package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	//WebElemnts
	WebDriver driver;
	private By username=By.name("username");
	
	private By password=By.name("password");
	
	private By loginButton=By.name("login");
	//Constructor
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	//Page Actions
     public void enterUserName(String user)
     {
    	 driver.findElement(username).sendKeys(user);
     }
     
     public void enterPassword(String pass)
     {
    	 driver.findElement(password).sendKeys(pass);
    	 
     }
     public HomePage clickLoginButton() 
     {
    	 driver.findElement(loginButton).click();
    	 
    	 return new HomePage(driver);
    	 
     }
    	public HomePage doLogin(String user,String pass) 
    	{
    		enterUserName(user);
    		enterPassword(pass);
    		HomePage homePage=clickLoginButton();
    		return homePage;
     }
    	public String getTitle() {
    		return driver.getTitle();
    	}
    	public boolean isAlertPresent() 
    	{
    		try {
    			return true;
    		}
    		catch(Exception e)
    		{
    			return false;
    		}
    	}
    	
    	public String getMessageOnTheAlert()
    	{
    		Alert alert = driver.switchTo().alert();
    		return alert.getText();
    	}
}
