package com.qa.rd.scripts.appModule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.rd.pageobjects.CreateProeprtyRequest_Page;
import com.qa.rd.scripts.base.Base;
import com.qa.rd.scripts.library.Functions;
import com.qa.rd.scripts.utility.Log;

// This is called Modularization, when we club series of actions in to one Module
// For Modular Driven Frameworkg, please see http://www.toolsqa.com/modular-driven/   
public class CreatePropertyRequest_Action extends Base {
	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
	public CreatePropertyRequest_Action(WebDriver driver) {
		Base.driver = driver;
	}

	public static void Test_Create_Property_Request() throws Exception {
		
		Log.info("Inside CreatePropertyRequest_Action");
		PageFactory.initElements(driver, CreateProeprtyRequest_Page.class);
		Functions.Click(CreateProeprtyRequest_Page.CreateRequest_Link);
		Functions.Click(CreateProeprtyRequest_Page.Location);
		Functions.Enter(CreateProeprtyRequest_Page.Location,"Vastrapur");
		Thread.sleep(500);
		Functions.selectLocationWithText("Vastrapur");
		Functions.Click(CreateProeprtyRequest_Page.Bhk2Chk);
		Functions.Click(CreateProeprtyRequest_Page.BathroomChk);
		Functions.SelectByText(CreateProeprtyRequest_Page.SelectMaxBudget,"1 Cr");
		Functions.Click(CreateProeprtyRequest_Page.SaleNewChk);
		Functions.Click(CreateProeprtyRequest_Page.ReadyToMoveChk);
		Functions.Click(CreateProeprtyRequest_Page.FurnishedChk);
		Functions.Click(CreateProeprtyRequest_Page.ImmediateChk);
		Functions.Click(CreateProeprtyRequest_Page.ReservedParkingChk);
		Functions.Click(CreateProeprtyRequest_Page.GymnasiumChk);
		Functions.Click(CreateProeprtyRequest_Page.CreateRequestbtn);
		Thread.sleep(500);
	}
}
