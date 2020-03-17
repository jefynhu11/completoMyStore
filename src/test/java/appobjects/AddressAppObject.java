package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressAppObject {

	private WebDriver driver;
	
	public AddressAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getNamePageLabel() {
		return driver.findElement(By.cssSelector("h1.page-heading"));
	}
	
	public WebElement getFirstNameLastNameLabel() {
		return driver.findElement(By.cssSelector("#address_delivery li.address_firstname"));
	}
	
	public WebElement getAddressAdressLabel() {
		return driver.findElement(By.cssSelector("#address_delivery li.address_address1"));
	}
	
	public WebElement getAddressCityCodeLabel() {
		return driver.findElement(By.cssSelector("#address_delivery li.address_city"));
	}
	
	public WebElement getAddressCountryLabel() {
		return driver.findElement(By.cssSelector("#address_delivery li.address_country_name"));
	}
	
	public WebElement getAddressPhoneLabel() {
		return driver.findElement(By.cssSelector("#address_delivery li.address_phone_mobile"));
	}
	
	public WebElement getMessagemTextArea() {
		return driver.findElement(By.cssSelector("textarea.form-control"));
	}
	
	public WebElement getProceedToCheckoutButton() {
		return driver.findElement(By.name("processAddress"));
	}
}
