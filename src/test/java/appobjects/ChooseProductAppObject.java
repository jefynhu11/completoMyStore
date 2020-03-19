package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChooseProductAppObject {

	private WebDriver driver;
	
	public ChooseProductAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getImageButton() {
		return driver.findElement(By.cssSelector("img[title='Blouse']"));
	}
	
}
