package com.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersUtility implements ITestListener{
	ExtentSparkReporter sparkReports;
	ExtentReports reports;
	ExtentTest test;
 String reportPath="C:\\Users\\PraneethReddyKatamre\\Desktop\\Automation Testing\\GoogleServices\\ExtendReport\\Reports.html";
	
 public void onTestStart(ITestResult result) {
	//System.out.println(result.getMethod());
	test.log(Status.INFO,MarkupHelper.createLabel("Test Start",ExtentColor.PURPLE));
	Reporter.log("Start-"+result.getName(),true);
	}

	public void onTestSuccess(ITestResult result) {
		//System.out.println(result.getMethod());
		test.log(Status.PASS,MarkupHelper.createLabel(result.getName(),ExtentColor.GREEN));
		Reporter.log("success-"+result.getName(),true);
	}

	public void onTestFailure(ITestResult result) {
		//System.out.println(result.getMethod());
		test.log(Status.FAIL,MarkupHelper.createLabel(result.getName(),ExtentColor.RED));
		Reporter.log("Failure-"+result.getName(),true);
	}

	public void onTestSkipped(ITestResult result) {
		//System.out.println(result.getMethod());
		test.log(Status.SKIP,MarkupHelper.createLabel(result.getName(),ExtentColor.YELLOW));
		Reporter.log("Skip-"+result.getName(),true);
	}



	public void onStart(ITestContext context) {
		
		sparkReports=new ExtentSparkReporter(reportPath);
		sparkReports.config().setDocumentTitle("Google Services Extent Reports");
		sparkReports.config().setReportName("Html Report");
		sparkReports.config().setTheme(Theme.DARK);
		reports=new ExtentReports();
		reports.attachReporter(sparkReports);
		
		test=reports.createTest("Google Services Functionalities");
		
		test.log(Status.INFO,"Extent Reports file is loaded and ready to generate reports");
		
	}

	public void onFinish(ITestContext context) {
	
		System.out.println("Task is completed");
		test.log(Status.INFO,MarkupHelper.createLabel("Finish",ExtentColor.WHITE));
		reports.flush();
	}

}
