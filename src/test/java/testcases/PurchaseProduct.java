package testcases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.AuthenticationTask;

public class PurchaseProduct {
	
	private WebDriver driver;
	private AuthenticationTask authenticationTask;
	
	@BeforeEach
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		this.authenticationTask = new AuthenticationTask(driver);
	}

	@Test
	public void test() {
		authenticationTask.account();
	}
	
	@AfterEach
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
			driver = null;
		}
	}
}
