package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartSummaryAppObject {
	
	private WebDriver driver;
	
	public ShoppingCartSummaryAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getNamePageLabel() {
		return driver.findElement(By.cssSelector("h1.page-heading"));
	}

	public WebElement getValueSpan() {
		return driver.findElement(By.cssSelector("span[id='total_price']"));
	}
	
	public WebElement getProceedToCheckoutButton() {
		return driver.findElement(By.cssSelector("p.clearfix a[title='Proceed to checkout']"));
	}
}
