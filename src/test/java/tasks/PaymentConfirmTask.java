package tasks;

import static frameworks.ReportFw.log;
import static frameworks.ScreenshotFw.screenshotCapture;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import appobjects.PaymentConfirmAppObject;

public class PaymentConfirmTask {

	private WebDriver driver;
	private PaymentConfirmAppObject paymentConfirmAppObject;
	
	public PaymentConfirmTask(WebDriver driver) {
		this.driver = driver;
		this.paymentConfirmAppObject = new PaymentConfirmAppObject(driver);
	}
	
	public void paymentConfirm() {
		if(paymentConfirmAppObject.getNamePageLabel().getText().equals("ORDER SUMMARY")) {
			log(Status.PASS, "Validacao - A pagina 'ORDER SUMMARY' esta correto");
		} else {
			log(Status.FAIL, "Validacao - A pagina 'ORDER SUMMARY' nao esta correto", screenshotCapture(driver));
		}
		
		if(paymentConfirmAppObject.getNamePaymentLabel().getText().equals("CHECK PAYMENT")) {
			log(Status.PASS, "Validacao - A pagina 'CHECK PAYMENT' esta correto");
		} else {
			log(Status.FAIL, "Validacao - A pagina 'CHECK PAYMENT' nao esta correto", screenshotCapture(driver));
		}
		
		paymentConfirmAppObject.getIConfirmMyOrderButton().click();
	}
}
