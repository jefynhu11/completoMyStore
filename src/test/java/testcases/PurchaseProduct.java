package testcases;

import static frameworks.ReportFw.log;
import static frameworks.ReportFw.setUpConfigure;
import static frameworks.ReportFw.setUpStart;
import static frameworks.ReportFw.tearDownFinish;
import static frameworks.ScreenshotFw.screenshotCapture;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.AuthenticationTask;

public class PurchaseProduct {
	
	private WebDriver driver;
	private AuthenticationTask authenticationTask;
	
	@BeforeEach
	public void setUp() {
		setUpConfigure("Automaticon Report", "Execution Report");
		setUpStart("Compra com sucesso");
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		this.authenticationTask = new AuthenticationTask(driver);
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/dados.csv")
	public void test(String email, String password) {
		log(Status.INFO, "Validacao titulo");
		if(driver.getTitle().equals("Login - My Store")) {
			log(Status.PASS, "Validado titulo");
		} else {
			log(Status.FAIL, "Nao validado titulo", screenshotCapture(driver));
		}
		authenticationTask.account(email, password);
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
