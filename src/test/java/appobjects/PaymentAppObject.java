package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentAppObject {
	
	private WebDriver driver;
	
	public PaymentAppObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getNamePageLabel() {
		return driver.findElement(By.cssSelector("h1.page-heading"));
	}
	
	public WebElement getChequeButton() {
		return driver.findElement(By.cssSelector("a.cheque"));
	}
}