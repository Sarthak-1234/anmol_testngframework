package Reporting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import InitiateTest.Init;
import Utils.TakeScreenshots;

public class ReportingClass {
	
	
	
//	EmptyHTML Report
//	
//	LOGIN Test 
//	
//	LOGOUT Test
//	
//	EmailCheck Test
	
	
	//initReports("TestCase1")
	
	//Empty HTML ---testcase TESTCase1 naam ka
	
	
	
//	
//	Empty HTML Report
//	
//	TestCase -  if pass infoLogPass("")
//				if fail infoLogFail ("")
//				if messagepass infoLogMessage("")
	
	
	
	
	
	public static ExtentReports report = Init.report;  //html report
	public static ExtentTest test;  //instantiate
	public static TakeScreenshots screencapture;
	
	
	
	
	//start-----ReportingClass.initReports("LOGIN")
	//pass -----ReportingClass.infoLogPass("PASS");
	//fail ------ReportingClass.reportFailure("", InitiateTest.driver)
	//skip -----ReportingClass.infoLogMessage("Intentionally skipping")
	//AfterSuite ---ReportingClass.putReport();

	
	public static void reportFailure(String errMsg, WebDriver driver) throws Throwable {
    	screencapture = new TakeScreenshots(driver);
		ReportingClass.infoLogFail(errMsg);
	}
	
	
	//jaise hi testcase start hoga
	public static void initReports(String scenario) {
		test = report.createTest(scenario);
		
	}
	
	public static void putReport() {
		report.flush(); //publish reporst
	}
	
	public static void infoLogPass(String msg) {
		test.log(Status.PASS, msg);
	}
	
	public static void infoLogFail(String msg) throws IOException, Exception {
		test.log(Status.FAIL,msg +" Screenshot-> "+ test.addScreenCaptureFromPath(ExtentManager.screenshotFolderPath+screencapture.TakeScreenshot()));
		Assert.assertFalse(true);
	}
	
	public static void infoLogMessage(String msg) {
		test.log(Status.INFO, msg);
	}

}
