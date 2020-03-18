package tasks;

import static frameworks.ReportFw.log;
import static frameworks.ScreenshotFw.screenshotCapture;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import appobjects.AuthenticationAppObject;

public class AuthenticationTask {
	
	private WebDriver driver;
	private AuthenticationAppObject authenticationAppObject;
	
	public AuthenticationTask(WebDriver driver) {
		this.driver = driver;
		this.authenticationAppObject = new AuthenticationAppObject(driver);
	}
	
	public void account(String email, String password) {
		log(Status.INFO, "Validacao titulo");
		if(driver.getTitle().equals("Login - My Store")) {
			log(Status.PASS, "Validacao - O titulo Login correto.");
		} else {
			log(Status.FAIL, "Validacao - O titulo incorreto.", screenshotCapture(driver));
		}
		authenticationAppObject.getEmailTextFiled().sendKeys(email);
		authenticationAppObject.getPasswordTextFiled().sendKeys(password);
		authenticationAppObject.getSignInButton().click();
		if(driver.getTitle().equals("My account - My Store")) {
			log(Status.PASS, "Validacao - O titulo My account correto.");
		} else {
			log(Status.FAIL, "Validacao - O titulo incorreto.", screenshotCapture(driver));
		}
	}

}
