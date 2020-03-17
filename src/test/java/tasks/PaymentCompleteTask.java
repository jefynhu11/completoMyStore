package tasks;

import static frameworks.ReportFw.log;
import static frameworks.ScreenshotFw.screenshotCapture;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import appobjects.PaymentCompleteAppObject;

public class PaymentCompleteTask {
	private WebDriver driver;
	private PaymentCompleteAppObject paymentCompleteAppObject;
	
	public PaymentCompleteTask(WebDriver driver) {
		this.driver = driver;
		this.paymentCompleteAppObject = new PaymentCompleteAppObject(driver);
	}
	
	public void paymentComplete() {
		if(paymentCompleteAppObject.getNamePageLabel().getText().equals("ORDER CONFIRMATION")) {
			log(Status.PASS, "Validacao - A pagina 'ORDER CONFIRMATION' esta correto");
		} else {
			log(Status.FAIL, "Validacao - A pagina 'ORDER CONFIRMATION' nao esta correto", screenshotCapture(driver));
		}
		
		if(paymentCompleteAppObject.getMessageSuccessLabel().getText().equals("Your order on My Store is complete.")) {
			log(Status.PASS, "Validacao - A pagina 'Your order on My Store is complete.' esta correto");
		} else {
			log(Status.FAIL, "Validacao - A pagina 'Your order on My Store is complete.' nao esta correto", screenshotCapture(driver));
		}
	}
}
