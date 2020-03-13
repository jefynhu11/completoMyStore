package appobjects;

import static frameworks.WaitElementFw.visibilityOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ChooseProductAppObject {

	private WebDriver driver;
	
	public ChooseProductAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getImageButton() {
		return driver.findElement(By.cssSelector("img[title='Blouse']"));
	}
	
	public WebElement getAddToCartButton() {
		return driver.findElement(By.cssSelector("button[name='Submit']"));
	}
	
	public Select getSizeSelect() {
		return new Select(driver.findElement(By.cssSelector("#group_1 option[title='M']")));
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
	
	
}
