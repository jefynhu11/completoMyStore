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
	
	public void account() {
		authenticationAppObject.getEmailTextFiled().sendKeys("testes@testes.com");
		authenticationAppObject.getPasswordTextFiled().sendKeys("2020testes");
		authenticationAppObject.getSignInButton().click();
	}
	

}
