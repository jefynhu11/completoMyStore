package frameworks;

import static frameworks.ReportFw.tearDownFinish;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestFw {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	@AfterEach
	public void tearDown() {
		tearDownFinish();
		if(driver!=null) {
			driver.quit();
			driver = null;
		}
	}

}
