package frameworks;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotFw {

	public static String screenshotCapture(WebDriver driver) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+File.separator+"screenshots"+File.separator+"ScreenshotFw"+System.nanoTime()+".jpg";
		FileHandler.copy(src, new File(path));
		return path;
	}
}
