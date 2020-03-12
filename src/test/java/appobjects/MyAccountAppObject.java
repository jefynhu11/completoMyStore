package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountAppObject {
	
	private WebDriver driver;
	
	public MyAccountAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSearchTextField() {
		return driver.findElement(By.id("search_query_top"));
	}
	
	public WebElement getSearchButton() {
		return driver.findElement(By.name("submit_search"));
	}

}
