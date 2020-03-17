package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentConfirmAppObject {
	
	private WebDriver driver;
	
	public PaymentConfirmAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getNamePageLabel() {
		return driver.findElement(By.cssSelector("h1.page-heading"));
	}
	
	public WebElement getNamePaymentLabel() {
		return driver.findElement(By.cssSelector("h3.page-subheading"));
	}
	
	public WebElement getIConfirmMyOrderButton() {
		return driver.findElement(By.cssSelector("#cart_navigation button.btn-default"));
	}

}
