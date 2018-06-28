package com.qa.rd.scripts.appModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.qa.rd.pageobjects.ForgotPwd_Page;
import com.qa.rd.pageobjects.Login_Page;
import com.qa.rd.scripts.base.Base;
import com.qa.rd.scripts.library.Functions;
import com.qa.rd.scripts.utility.Constant;
import com.qa.rd.scripts.utility.ExcelUtils;
import com.qa.rd.scripts.utility.Log;

// This is called Modularization, when we club series of actions in to one Module
// For Modular Driven Frameworkg, please see http://www.toolsqa.com/modular-driven/   
public class ForgotPwd_Action extends Base {
	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
	public ForgotPwd_Action(WebDriver driver) {
		Base.driver = driver;
	}

	public static void Test_FogotPwd_Validation() throws Exception {

		Log.info("Inside ForgotPwd_Action.class - Test_InValid_Login()");
		PageFactory.initElements(driver, ForgotPwd_Page.class);
		SoftAssert softAssert = new SoftAssert();
		Functions.Click(ForgotPwd_Page.ForgotPwd_Link);
		Functions.Click(ForgotPwd_Page.submitbtn);

		softAssert.assertEquals(ForgotPwd_Page.Msg_EmailorPhone_Required.getText(),
				"Please enter Email Or Phone number");

		logger.info("Verified Msg : " + ForgotPwd_Page.Msg_EmailorPhone_Required.getText());
		Log.info("Verified Msg : " + ForgotPwd_Page.Msg_EmailorPhone_Required.getText());

		Functions.Enter(ForgotPwd_Page.txtLogin, "test@test.com");

		Functions.Click(ForgotPwd_Page.submitbtn);

		softAssert.assertAll();
	}

}
