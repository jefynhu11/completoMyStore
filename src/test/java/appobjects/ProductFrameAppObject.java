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
	
//	public WebElement getIfreme() {
//		visibilityOfElementLocated(driver, By.className("fancybox-iframe"));
//		WebElement iframe = driver.findElement(By.className("fancybox-iframe"));
//		driver.switchTo().frame(iframe);
//		return driver.switchTo().frame(iframe);
//	}
	
	public WebElement getMoreSymbolButtonFrame() {
		visibilityOfElementLocated(driver, By.className("fancybox-iframe"));
		WebElement iframe = driver.findElement(By.className("fancybox-iframe"));
		driver.switchTo().frame(iframe);                                
		WebElement iframe1 = driver.findElement(By.cssSelector("#quantity_wanted_p a.btn.btn-default.button-plus.product_quantity_up"));
		return iframe1;
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
	
	public WebElement getIframe() {
		visibilityOfElementLocated(driver, By.className("fancybox-iframe"));
		WebElement iframe = driver.findElement(By.className("fancybox-iframe"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.cssSelector("#quantity_wanted_p a.btn.btn-default.button-plus.product_quantity_up")).click();
		driver.findElement(By.cssSelector("#group_1 [title='M']")).click();
		driver.findElement(By.id("color_8")).click();
		driver.findElement(By.name("Submit")).click();
		return null;
	}
	
}
