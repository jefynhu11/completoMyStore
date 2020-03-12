package frameworks;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportFw {

	static String path = System.getProperty("user.dir")+File.separator+"reports"+File.separator+"report.html";
	static ExtentHtmlReporter reporter;
	static ExtentReports extent;
	static ExtentTest extentTest;
	
	public static void setUpConfigure(String documentTitulo, String reportNome) {
		reporter = new ExtentHtmlReporter(path);
		reporter.config().setDocumentTitle(documentTitulo);
		reporter.config().setReportName(reportNome);
		reporter.config().setEncoding("utf-8");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Sistema Operacional", "Windows 10");
		extent.setSystemInfo("Browser", "Chrome");
	}
	
	public static void setUpStart(String descricao) {
		extentTest = extent.createTest(descricao);
	}
	
	public static void log(Status status, String mensagem) {
		extentTest.log(status, mensagem);
	}

	public static void log(Status status, String mensagem, String imagemPath) {
		try {			
			extentTest.log(status, mensagem, MediaEntityBuilder.createScreenCaptureFromPath(imagemPath).build());
		} catch (IOException e) {
			log(status, mensagem + " e erro capturar");
		}
	}
	
	public static void tearDownFinish() {
		extent.flush();
	}
}
