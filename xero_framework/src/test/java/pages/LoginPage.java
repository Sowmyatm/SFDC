package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="Username")
	public WebElement username; 
	
	@FindBy(name="Password")
	public WebElement password;
	
	@FindBy(name="button")
	public WebElement loginButton;
	
	@FindBy(partialLinkText = "Forgot")
	public WebElement forgotPassword;
	
	public Boolean enterUsername(String userName, WebDriver driver){
		if(username.isDisplayed())
		{
			username.sendKeys(userName);
			return true;
		}
		else
			return false;
		
	}
	
	public Boolean enterPassword(String pass, WebDriver driver) {
		
		if(password.isDisplayed()) {
			
			password.sendKeys(pass);
			return true;
		}
		else
			return false;
		
	}
	
	public Boolean clickLogin(WebDriver driver) {
		
		if(loginButton.isDisplayed()) {
			
			loginButton.click();
			return true;
		}
		else
			return false;
		
	}
	
	public Boolean clickForgotPassword(WebDriver driver) {
		
		if(forgotPassword.isDisplayed()) {
			
			forgotPassword.click();
			return true;
		}
		else
			return false;
	
	}

}
