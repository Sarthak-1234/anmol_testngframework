package InitiateTest;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;

import Objects.GmailPageObject;
import Objects.GooglePageObject;
import Reporting.ExtentManager;
import Reporting.ReportingClass;

public class Init {
	
	public static WebDriver driver;
	public GooglePageObject googlepage;
	public GmailPageObject gmailobject;
	
	public static ExtentReports report;
	private static final Logger LOGGER = LoggerFactory.getLogger(Init.class);
	
	@BeforeClass
	public void beforeClass() {
		driver = WbDriverManager.getDriver();
		report = ExtentManager.setUp("Extent_Reports");
		LOGGER.info("Launching URL");
		driver.get("https://www.naukri.com/");
		googlepage = new GooglePageObject(driver);
		gmailobject = new GmailPageObject(driver);
	
	}
	
	
	@AfterClass
	public void afterClass() {
		LOGGER.info("Closing Browser");
		driver.close();
		ReportingClass.putReport();
	}

}
