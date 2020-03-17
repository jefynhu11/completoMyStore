package tasks;

import static frameworks.ReportFw.log;
import static frameworks.ScreenshotFw.screenshotCapture;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import appobjects.PaymentAppObject;


public class PaymentTask {
	
	private WebDriver driver;
	private PaymentAppObject paymentAppObject;
	
	public PaymentTask(WebDriver driver) {
		this.driver = driver;
		this.paymentAppObject = new PaymentAppObject(driver); 
	}
	
	public void payment() {
		if(paymentAppObject.getNamePageLabel().getText().equals("PLEASE CHOOSE YOUR PAYMENT METHOD")) {
			log(Status.PASS, "Validacao - A pagina 'PLEASE CHOOSE YOUR PAYMENT METHOD' esta correto");
		} else {
			log(Status.FAIL, "Validacao - A pagina 'PLEASE CHOOSE YOUR PAYMENT METHOD' nao esta correto", screenshotCapture(driver));
		}
		paymentAppObject.getChequeButton().click();
	}

}
