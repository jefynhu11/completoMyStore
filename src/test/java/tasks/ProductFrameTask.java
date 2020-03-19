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
		productFrameAppObject.getIframes();
		productFrameAppObject.getMoreSymbolButtonFrame().click();
		productFrameAppObject.getMenuSelectFrame().click();
		productFrameAppObject.getColorButtonFrame().click();
		productFrameAppObject.getAddToCartButtonFrame().click();
		visibilityOfElementLocated(driver, By.cssSelector("div.button-container a[title='Proceed to checkout']"));
		productFrameAppObject.getProceedToCheckoutButtonFrame().click();
		
	}

}
