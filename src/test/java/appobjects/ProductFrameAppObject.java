package appobjects;

import static frameworks.WaitElementFw.visibilityOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductFrameAppObject {
	
	private WebDriver driver;
	
	public ProductFrameAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver getIframes() {
		visibilityOfElementLocated(driver, By.className("fancybox-iframe"));
		WebElement iframe = driver.findElement(By.className("fancybox-iframe"));
		driver.switchTo().frame(iframe);
		return driver;
	}
	
	public WebElement getMoreSymbolButtonFrame() {
		return driver.findElement(By.cssSelector("#quantity_wanted_p a.btn.btn-default.button-plus.product_quantity_up"));
	}

	public WebElement getMenuSelectFrame() {
		return driver.findElement(By.cssSelector("#group_1 [title='M']")); 
	}
	
	public WebElement getColorButtonFrame() {
		return driver.findElement(By.id("color_8")); 
	}

	public WebElement getAddToCartButtonFrame() {
		return driver.findElement(By.name("Submit")); 
	}
	
	public WebElement getProceedToCheckoutButtonFrame() {
		return driver.findElement(By.cssSelector("div.button-container a[title='Proceed to checkout']"));
	}
	
}
