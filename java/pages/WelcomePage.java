package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage{
	
	WebDriver driver1;
	//Page Elements
	private By loginButton =By.linkText("Login");
	private By welcomeMessage= By.tagName("h1");
	
	public WelcomePage(WebDriver driver)
	{
		this.driver1= driver;
	}
	
//Page Action
	
	public LoginPage clickOnLoginButton()
	{
		driver1.findElement(loginButton).click();
		return new LoginPage(driver1);
	}
	
	public String getWelcomeMessage()
	{
		return driver1.findElement(welcomeMessage).getText();
	//System.out.println(driver.findElement(welcomeMessage).getText());
				
				
	}
	public boolean presenceOfLoginButton() {
		return driver1.findElement(loginButton).isDisplayed();
}
}