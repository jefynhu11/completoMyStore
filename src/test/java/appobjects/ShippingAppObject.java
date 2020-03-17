package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingAppObject {
	
	private WebDriver driver;
	
	public ShippingAppObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getNamePageLabel() {
		return driver.findElement(By.cssSelector("h1.page-heading"));
	}
	
	public WebElement getCheckBox() {
		return driver.findElement(By.id("cgv"));
	}
	
	public WebElement getProceedToCheckoutButton() {
		return driver.findElement(By.name("processCarrier"));
	}
}
