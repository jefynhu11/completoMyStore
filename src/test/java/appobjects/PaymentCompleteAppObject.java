package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentCompleteAppObject {
	
	private WebDriver driver;
	
	public PaymentCompleteAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getNamePageLabel() {
		return driver.findElement(By.cssSelector("h1.page-heading"));
	}
	
	public WebElement getMessageSuccessLabel() {
		return driver.findElement(By.cssSelector("p.alert-success"));
	}
}
