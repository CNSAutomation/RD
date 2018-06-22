package com.qa.rd.scripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.qa.rd.scripts.appModule.Login_Action;
import com.qa.rd.scripts.appModule.SearchPropertyRequest_Action;
import com.qa.rd.scripts.base.Base;
import com.qa.rd.scripts.utility.Log;
import com.qa.rd.scripts.utility.TestListener;

public class SearchPropertyRequestTest extends Base {
	// Getting the Test Case name, as it will going to use in so many places
	private String sTestCaseName = this.toString();

	@Test(priority = 0)
	public void Test_Search_Property_Request() throws Exception {
		Log.info("-------Start TestCase" + sTestCaseName + "----------");
		driver.manage().deleteAllCookies();
		logger = extent.createTest("Test Search Property Request");
		try {
			Login_Action.Click_Login_Link();
			logger.log(Status.PASS, MarkupHelper.createLabel("Click_Login_Link", ExtentColor.GREEN));
			Log.info("Login_Action.Click_Login_Link() : PASS");
		} catch (Exception e) {
			Log.error("Login_Action.Test_Valid_Login() : FAIL");
			throw (e);
		}
		try {
			SearchPropertyRequest_Action.Test_Search_Property_Request();
			logger.log(Status.PASS, MarkupHelper.createLabel("Test_Search_Property_Request", ExtentColor.GREEN));
			Log.info("SearchPropertyRequest_Action.Test_Search_Property_Request() : PASS");
		} catch (Exception e) {
			Log.error("SearchPropertyRequest_Action.Test_SearchLocation() : FAIL");
			throw (e);
		}
		try {
			SearchPropertyRequest_Action.Test_Property_Request_Feedback();
			logger.log(Status.PASS, MarkupHelper.createLabel("Test_Property_Request_Feedback", ExtentColor.GREEN));
			Log.info("SearchPropertyRequest_Action.Test_Property_Request_Feedback() : PASS");
		} catch (Exception e) {
			Log.error("SearchPropertyRequest_Action.Test_Property_Request_Feedback() : FAIL");
			throw (e);
		}

	}

	@AfterMethod
	public void getResult(ITestResult result) throws Exception {
		Log.endTestCase(sTestCaseName);
		if (result.getStatus() == ITestResult.FAILURE) {
			// MarkupHelper is used to display the output in different colors
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			TestListener testListener = new TestListener();
			testListener.onTestFailure(result);
		} else if (result.getStatus() == ITestResult.SKIP) {
			// logger.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
		}
	}

	@AfterTest
	public void endReport() {
		driver.close();
	}
}
