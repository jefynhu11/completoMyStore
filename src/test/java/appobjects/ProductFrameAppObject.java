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
	
	public WebElement getMoreSymbolButtonFrame() {
		visibilityOfElementLocated(driver, By.className("fancybox-iframe"));
		WebElement iframe = driver.findElement(By.className("fancybox-iframe"));
		driver.switchTo().frame(iframe);                                
		WebElement iframe1 = driver.findElement(By.cssSelector("#quantity_wanted_p a.btn.btn-default.button-plus.product_quantity_up"));
		return iframe1;
	}

	public WebElement getMenuSelectFrame() {
		visibilityOfElementLocated(driver, By.className("fancybox-iframe"));
		WebElement iframe = driver.findElement(By.className("fancybox-iframe"));
		driver.switchTo().frame(iframe);                                
		WebElement iframe1 = driver.findElement(By.cssSelector("#group_1 [title='M']"));
		return iframe1;
	}
	
	public WebElement getColorButtonFrame() {
		visibilityOfElementLocated(driver, By.className("fancybox-iframe"));
		WebElement iframe = driver.findElement(By.className("fancybox-iframe"));
		driver.switchTo().frame(iframe);                                
		WebElement iframe1 = driver.findElement(By.id("color_8"));
		return iframe1;
	}

	public WebElement getAddToCartButtonFrame() {
		visibilityOfElementLocated(driver, By.className("fancybox-iframe"));
		WebElement iframe = driver.findElement(By.className("fancybox-iframe"));
		driver.switchTo().frame(iframe);                                
		WebElement iframe1 = driver.findElement(By.name("Submit"));
		return iframe1;
	}
	
}
