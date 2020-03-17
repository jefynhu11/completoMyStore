package tasks;

import org.openqa.selenium.WebDriver;

import appobjects.ChooseProductAppObject;

public class ChooseProductTask {

	private WebDriver driver;
	private ChooseProductAppObject chooseProductAppObject;
	
	public ChooseProductTask(WebDriver driver) {
		this.driver = driver;
		this.chooseProductAppObject = new ChooseProductAppObject(driver);
	}
	
	public void chooseProduct() {
		chooseProductAppObject.getImageButton().click();
	}
}
