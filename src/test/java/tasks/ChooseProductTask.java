package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import appobjects.ChooseProductAppObject;

public class ChooseProductTask {

	private WebDriver driver;
	private ChooseProductAppObject chooseProductAppObject;
	
	public ChooseProductTask(WebDriver driver) {
		this.driver = driver;
		this.chooseProductAppObject = new ChooseProductAppObject(driver);
	}
	
	public void chooseProduct() throws InterruptedException {
		chooseProductAppObject.getImageButton().click();
//		chooseProductAppObject.getMoreSymbolButtonFrame().click();
//		Thread.sleep(2000);
//		chooseProductAppObject.getMenuSelectFrame().click();
//		chooseProductAppObject.getColorButtonFrame().click();
//		Thread.sleep(2000);
	}
}
