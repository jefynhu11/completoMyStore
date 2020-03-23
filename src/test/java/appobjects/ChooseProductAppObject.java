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
		boolean existe = false; 
		existe = driver.findElements(By.cssSelector("img[title='Blouse']")).size() != 0;
		if(existe) {
			return driver.findElement(By.cssSelector("img[title='Blouse']"));
		} else {
			return driver.findElement(By.cssSelector("a.product_img_link"));
		}
	}
}
