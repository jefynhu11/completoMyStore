package tasks;

import org.openqa.selenium.WebDriver;

import appobjects.AuthenticationAppObject;

public class AuthenticationTask {
	
	private WebDriver driver;
	private AuthenticationAppObject authenticationAppObject;
	
	public AuthenticationTask(WebDriver driver) {
		this.driver = driver;
		this.authenticationAppObject = new AuthenticationAppObject(driver);
	}
	
	public void account(String email, String password) {
		authenticationAppObject.getEmailTextFiled().sendKeys(email);
		authenticationAppObject.getPasswordTextFiled().sendKeys(password);
		authenticationAppObject.getSignInButton().click();
	}
	

}
