package tasks;

import static frameworks.ReportFw.log;
import static frameworks.ScreenshotFw.screenshotCapture;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import appobjects.MyAccountAppObject;

public class MyAccountTask {

	private WebDriver driver;
	private MyAccountAppObject myAccountAppObject;
	
	public MyAccountTask(WebDriver driver) {
		this.driver = driver;
		this.myAccountAppObject = new MyAccountAppObject(driver);
	}
	
	public void search(String word) {
		myAccountAppObject.getSearchTextField().sendKeys(word);
		myAccountAppObject.getSearchButton().click();
		if(driver.getTitle().equals("Search - My Store")) {
			log(Status.PASS, "Validacao - O titulo Search correto.");
		} else {
			log(Status.FAIL, "Validacao - O titulo incorreto.", screenshotCapture(driver));
		}
	}
}
