package tasks;

import static frameworks.WaitElementFw.visibilityOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appobjects.ProductFrameAppObject;
import frameworks.WaitElementFw;

public class ProductFrameTask {
	
	private WebDriver driver;
	private ProductFrameAppObject productFrameAppObject;
	
	public ProductFrameTask(WebDriver driver) {
		this.driver = driver;
		this.productFrameAppObject = new ProductFrameAppObject(driver);
	}
	
	public void frames() {
//		productFrameAppObject.getMoreSymbolButtonFrame().click();
//		productFrameAppObject.getMenuSelectFrame().click();
//		productFrameAppObject.getColorButtonFrame().click();
//		productFrameAppObject.getAddToCartButtonFrame().click();
		visibilityOfElementLocated(driver, By.className("fancybox-iframe"));
		WebElement iframe = driver.findElement(By.className("fancybox-iframe"));
		driver.switchTo().frame(iframe);
//		System.out.println(driver.findElement(By.cssSelector("div.price #our_price_display")).getText());
		driver.findElement(By.cssSelector("#quantity_wanted_p a.btn.btn-default.button-plus.product_quantity_up")).click();
		driver.findElement(By.cssSelector("#group_1 [title='M']")).click();
		driver.findElement(By.id("color_8")).click();
		driver.findElement(By.name("Submit")).click();
		visibilityOfElementLocated(driver, By.cssSelector("div.button-container a[title='Proceed to checkout']"));
		driver.findElement(By.cssSelector("div.button-container a[title='Proceed to checkout']")).click();
	}

}
