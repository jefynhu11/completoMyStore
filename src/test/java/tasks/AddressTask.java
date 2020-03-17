package tasks;

import static frameworks.ScreenshotFw.screenshotCapture;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import appobjects.AddressAppObject;
import frameworks.ReportFw;
import frameworks.ScreenshotFw;

public class AddressTask {

	private WebDriver driver;
	private AddressAppObject addressAppObject;
	
	public AddressTask(WebDriver driver) {
		this.driver = driver;
		this.addressAppObject = new AddressAppObject(driver);
	}
	
	public void address() {
		if(addressAppObject.getNamePageLabel().getText().equals("ADDRESSES")) {
			ReportFw.log(Status.PASS, "Validacao -  A pagina 'ADDRESS' esta correto");
		} else {
			ReportFw.log(Status.FAIL, "Validacao -  A pagina 'ADDRESS' nao esta correto", screenshotCapture(driver));
		}
		
		if(addressAppObject.getFirstNameLastNameLabel().getText().equals("jefy lopez")) {
			ReportFw.log(Status.PASS, "Validacao -  O nome e sobrenome 'jefy lopez' esta correto");
		} else {
			ReportFw.log(Status.FAIL, "Validacao -  O nome e sobrenome nao esta correto", screenshotCapture(driver));
		}
		
		if(addressAppObject.getAddressAdressLabel().getText().equals("Assis Brasil Apartament")) {
			ReportFw.log(Status.PASS, "Validacao -  O endereco 'Assis Brasil Apartament' esta correto");
		} else {
			ReportFw.log(Status.FAIL, "Validacao -  O endereco nao esta correto", screenshotCapture(driver));
		}
		
		if(addressAppObject.getAddressCityCodeLabel().getText().equals("Porto Alegre, Florida 00000")) {
			ReportFw.log(Status.PASS, "Validacao -  O nome de cidade e o numero codigo de postal 'Porto Alegre, Florida 00000' esta correto");
		} else {
			ReportFw.log(Status.FAIL, "Validacao -  O nome de cidade e o numero codigo de postal nao esta correto", screenshotCapture(driver));
		}
		
		if(addressAppObject.getAddressCountryLabel().getText().equals("United States")) {
			ReportFw.log(Status.PASS, "Validacao -  O nome do pais 'United States' esta correto");
		} else {
			ReportFw.log(Status.FAIL, "Validacao -  O nome do pais nao esta correto", screenshotCapture(driver));
		}
		
		if(addressAppObject.getAddressPhoneLabel().getText().equals("98765432")) {
			ReportFw.log(Status.PASS, "Validacao -  O numero telefone de celular '98765432' esta correto");
		} else {
			ReportFw.log(Status.FAIL, "Validacao -  O numero telefone de celular nao esta correto", screenshotCapture(driver));
		}
		
		addressAppObject.getMessagemTextArea().sendKeys("teste de mensagem");
		addressAppObject.getProceedToCheckoutButton().click();
	}
}
