package tasks;

import static frameworks.ScreenshotFw.screenshotCapture;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import appobjects.ShippingAppObject;
import frameworks.ReportFw;

public class ShippingTask {
	
	private WebDriver driver;
	private ShippingAppObject shippingAppObject;
	
	public ShippingTask(WebDriver driver) {
		this.driver = driver;
		this.shippingAppObject = new ShippingAppObject(driver);
	}
	
	public void shipping() {
		if(shippingAppObject.getNamePageLabel().getText().equals("SHIPPING")) {
			ReportFw.log(Status.PASS, "Validacao -  A pagina 'SHIPPING' esta correto");
		} else {
			ReportFw.log(Status.FAIL, "Validacao -  A pagina 'SHIPPING' nao esta correto", screenshotCapture(driver));
		}
		
		shippingAppObject.getCheckBox().click();
		shippingAppObject.getProceedToCheckoutButton().click();
	}

}
