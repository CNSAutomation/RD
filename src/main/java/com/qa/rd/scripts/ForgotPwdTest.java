package com.qa.rd.scripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.qa.rd.scripts.appModule.ForgotPwd_Action;
import com.qa.rd.scripts.appModule.Login_Action;
import com.qa.rd.scripts.base.Base;
import com.qa.rd.scripts.utility.Log;
import com.qa.rd.scripts.utility.TestListener;

public class ForgotPwdTest extends Base {
	// Getting the Test Case name, as it will going to use in so many places
	private String sTestCaseName = this.toString();

	@Test(priority = 0)
	public void Test_Forgot_Validation() throws Exception {
		Log.info("-------Start TestCase" + sTestCaseName + "----------");
		driver.manage().deleteAllCookies();
		logger = extent.createTest("Test Forgot Password Validation");
		try {
			Login_Action.Click_Login_Link();
			logger.log(Status.PASS, MarkupHelper.createLabel("Click_Login_Link", ExtentColor.GREEN));
			Log.info("Login_Action.Click_Login_Link() : PASS");
		} catch (Exception e) {
			Log.error("Login_Action.Test_Valid_Login() : FAIL");
			//logger.log(Status.FAIL, MarkupHelper.createLabel("Test_Blank_login", ExtentColor.RED));
			Log.error(e.getMessage());
			throw (e);
		}
		try {
			ForgotPwd_Action.Test_FogotPwd_Validation();
			logger.log(Status.PASS, MarkupHelper.createLabel("Test_FogotPwd_Validation", ExtentColor.GREEN));
			Log.info("ForgotPwd_Action.Test_FogotPwd_Validation() : PASS");
		} catch (Exception e) {
			Log.error("ForgotPwd_Action.Test_FogotPwd_Validation() : FAIL");
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

	@AfterClass
	public void endReport() {
		driver.close();
	}
}
