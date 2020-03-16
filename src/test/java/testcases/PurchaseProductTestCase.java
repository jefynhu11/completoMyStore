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
import tasks.ChooseProductTask;
import tasks.MyAccountTask;
import tasks.ProductFrameTask;
import tasks.ShoppingCartSummaryTask;

public class PurchaseProductTestCase {
	
	private WebDriver driver;
	private AuthenticationTask authenticationTask;
	private MyAccountTask myAccountTask;
	private ChooseProductTask chooseProductTask;
	private ProductFrameTask productFrameTask;
	private ShoppingCartSummaryTask shoppingCartSummaryTask;
	
	@BeforeEach
	public void setUp() {
		setUpConfigure("Automaticon Report", "Execution Report");
		setUpStart("Compra com sucesso");
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		this.authenticationTask = new AuthenticationTask(driver);
		this.myAccountTask = new MyAccountTask(driver);
		this.chooseProductTask = new ChooseProductTask(driver);
		this.productFrameTask = new ProductFrameTask(driver);
		this.shoppingCartSummaryTask = new ShoppingCartSummaryTask(driver);
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/dados.csv")
	public void test(String email, String password) throws InterruptedException {
		log(Status.INFO, "Validacao titulo");
		if(driver.getTitle().equals("Login - My Store")) {
			log(Status.PASS, "Validacao - O titulo Login correto.");
		} else {
			log(Status.FAIL, "Validacao - O titulo incorreto.", screenshotCapture(driver));
		}
		authenticationTask.account(email, password);
		myAccountTask.search("blouse");
		chooseProductTask.chooseProduct();
		productFrameTask.frames();
		Thread.sleep(2000);
//		shoppingCartSummaryTask.shoppingSummary();
		
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
