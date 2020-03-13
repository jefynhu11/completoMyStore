package tasks;

import org.openqa.selenium.WebDriver;

import appobjects.ProductFrameAppObject;

public class ProductFrameTask {
	
	private WebDriver driver;
	private ProductFrameAppObject productFrameAppObject;
	
	public ProductFrameTask(WebDriver driver) {
		this.driver = driver;
		this.productFrameAppObject = new ProductFrameAppObject(driver);
	}
	
	public void frames() {
		productFrameAppObject.getMoreSymbolButtonFrame().click();
		productFrameAppObject.getMenuSelectFrame().click();
		productFrameAppObject.getColorButtonFrame().click();
//		productFrameAppObject.getAddToCartButtonFrame().click();
	}

}
