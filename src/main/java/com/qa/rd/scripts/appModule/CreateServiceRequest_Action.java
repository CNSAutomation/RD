package com.qa.rd.scripts.appModule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.qa.rd.pageobjects.CreateServiceRequest_Page;
import com.qa.rd.pageobjects.Login_Page;
import com.qa.rd.scripts.base.Base;
import com.qa.rd.scripts.library.Functions;
import com.qa.rd.scripts.utility.Log;

// This is called Modularization, when we club series of actions in to one Module
// For Modular Driven Frameworkg, please see http://www.toolsqa.com/modular-driven/   
public class CreateServiceRequest_Action extends Base {
	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
		public CreateServiceRequest_Action(WebDriver driver) {
		Base.driver = driver;
	}

	public static void Test_Create_Service_Request() throws Exception {

		Log.info("Inside Test_Create_Service_Request");
		PageFactory.initElements(driver, CreateServiceRequest_Page.class);
		Thread.sleep(2000);
		SoftAssert softAssert = new SoftAssert();
		Functions.mouseHoverAction(CreateServiceRequest_Page.AgentMenu, "Agents");
		logger.info("Click on Agent Menu");
		Functions.Click(CreateServiceRequest_Page.AddNewServiceReq_Link);
		logger.info("Click : "+ CreateServiceRequest_Page.AddNewServiceReq_Link.getText());
		Functions.Click(CreateServiceRequest_Page.Clearfilterbtn);
		logger.info("Click : "+CreateServiceRequest_Page.Clearfilterbtn);
		Functions.Click(CreateServiceRequest_Page.CreateReqbtn);
		logger.info("Click Create Request button");
		Thread.sleep(1000);
		softAssert.assertEquals(CreateServiceRequest_Page.Msg_Location_Required.getText(), "Location is required.");
		logger.info("Verified Msg :" + CreateServiceRequest_Page.Msg_Location_Required.getText());
		Log.info("Verified Msg :" + CreateServiceRequest_Page.Msg_Location_Required.getText());

		softAssert.assertEquals(CreateServiceRequest_Page.Msg_Service_Des_Required.getText(),
				"Service Description is required.");
		logger.info("Verified Msg :" + CreateServiceRequest_Page.Msg_Service_Des_Required.getText());
		Log.info("Verified Msg :" + CreateServiceRequest_Page.Msg_Service_Des_Required.getText());
		
		softAssert.assertEquals(CreateServiceRequest_Page.Msg_From_Time_Required.getText(),
				"Msg_From_Time_Required.");
		logger.info("Verified Msg :" + CreateServiceRequest_Page.Msg_From_Time_Required.getText());
		
		softAssert.assertEquals(CreateServiceRequest_Page.Msg_To_Time_Required.getText(),
				"Msg_To_Time_Required.");
		logger.info("Verified Msg :" + CreateServiceRequest_Page.Msg_To_Time_Required.getText());
		
		Thread.sleep(1000);
		Functions.SelectByText(CreateServiceRequest_Page.ServiceLocation_dd, "Naranpura");
		logger.info("Select value in Location drop down");
		Functions.Enter(CreateServiceRequest_Page.txtServiceDesc, "Test Description");
		logger.info("Enter Service Description");
		Functions.Click(CreateServiceRequest_Page.FormCalc);
		logger.info("Click on From Time Icon");
//		Thread.sleep(500);
		Functions.Click(CreateServiceRequest_Page.SelectTime);
		logger.info("Select From Time");
		//WebElement fromTime = driver.findElement(By.cssSelector(".bootstrap-timepicker-hour"));
		//fromTime.click();
		Thread.sleep(500);
		Functions.Click(CreateServiceRequest_Page.ToCalc);
		logger.info("Click on To Time Icon");
		Thread.sleep(500);
		Functions.Click(CreateServiceRequest_Page.SelectTime);
		logger.info("Select To Time");
		//WebElement toTime = driver.findElement(By.cssSelector(".bootstrap-timepicker-hour"));
		//toTime.click();
		Thread.sleep(500);
		Functions.Click(CreateServiceRequest_Page.CreateReqbtn);
		logger.info("Click Create Request button");
		Functions.Alert_Accept();
		logger.info("Accept Alert message");

		List<WebElement> oCheckBox = driver.findElements(By.xpath("//div[@class='creat_serv_list']/div"));
		// This will tell you the number of Check Boxes are present
		int iSize = oCheckBox.size();
		// Start the loop from first Check Box to last Check Boxe
		for (int i = 1; i <= iSize; i++) {
			// Store the Check Box name to the string variable, using 'Value' attribute
			WebElement checkbox = driver.findElement(By.xpath("//div[@class='creat_serv_list']/div["+i+"]/div/label"));
			
			String sValue = checkbox.getText();
			checkbox.click();
			logger.info("Click on check box :"+sValue);
			// Select the Check Box it the value of the Check Box is same what you are
			// looking for
//			if (sValue.equalsIgnoreCase("Agents")) {
//				checkbox.click();
//				// This will take the execution out of for loop
//
//			}
//			if (sValue.equalsIgnoreCase("Civil Contractors")) {
//				checkbox.click();
//				// This will take the execution out of for loop
//
//			}
//			if (sValue.equalsIgnoreCase("Legal Services")) {
//				checkbox.click();
//				// This will take the execution out of for loop
//				break;
//			}
		}
		Functions.Click(CreateServiceRequest_Page.CreateReqbtn);
		logger.info("Click Create Request button");
	//	softAssert.assertAll();
		Thread.sleep(2000);
	}
	public static void Verify_Created_Service_Request() throws Exception {
		PageFactory.initElements(driver, Login_Page.class);
		PageFactory.initElements(driver, CreateServiceRequest_Page.class);
		Functions.Click(Login_Page.MenuIcon);
		logger.info("Click on Menu Link");
		Functions.Click(CreateServiceRequest_Page.MyServiceRequests_Link);
		logger.info("Click on MyService Requests Link");	
		Thread.sleep(2000);
	}
}
