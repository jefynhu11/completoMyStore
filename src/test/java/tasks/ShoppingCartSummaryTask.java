package tasks;

import static frameworks.ScreenshotFw.screenshotCapture;
import static frameworks.WaitElementFw.visibilityOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import appobjects.ShoppingCartSummaryAppObject;
import frameworks.ReportFw;
import frameworks.ScreenshotFw;
import frameworks.WaitElementFw;

public class ShoppingCartSummaryTask {

	private WebDriver driver;
	private ShoppingCartSummaryAppObject shoppingCartSummaryAppObject;
	
	public ShoppingCartSummaryTask (WebDriver driver) {
		this.driver = driver;
		this.shoppingCartSummaryAppObject = new ShoppingCartSummaryAppObject(driver);
	}
	
	public void shoppingSummary() {
		visibilityOf(driver, shoppingCartSummaryAppObject.getNamePageLabel());
		if(shoppingCartSummaryAppObject.getNamePageLabel().getText().equals("SHOPPING-CART SUMMARY"
					+ "\nYour shopping cart contains: 2 Products")) {
			ReportFw.log(Status.PASS, "Validacao - A pagina 'SHOPPING-CART SUMMARY' esta correto.");
		} else {
			ReportFw.log(Status.ERROR, "Validacao - A pagina 'SHOPPING-CART SUMMARY' esta incorreto.", screenshotCapture(driver));
		}
		
		if(shoppingCartSummaryAppObject.getValueSpan().getText().equals("$56.00")) {
			ReportFw.log(Status.PASS, "Validacao - O valor esta correto.");
		} else {
			ReportFw.log(Status.ERROR, "Validacao - O valor esta incorreto.", screenshotCapture(driver));
		}
		
		shoppingCartSummaryAppObject.getProceedToCheckoutButton().click();
	}
	
}
