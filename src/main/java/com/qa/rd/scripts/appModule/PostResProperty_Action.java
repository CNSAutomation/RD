package com.qa.rd.scripts.appModule;

import java.io.File;
import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.rd.pageobjects.Login_Page;
import com.qa.rd.pageobjects.PostResProperty_Page;
import com.qa.rd.scripts.base.Base;
import com.qa.rd.scripts.library.Functions;
import com.qa.rd.scripts.utility.Constant;
import com.qa.rd.scripts.utility.Log;

// This is called Modularization, when we club series of actions in to one Module
// For Modular Driven Frameworkg, please see http://www.toolsqa.com/modular-driven/   
public class PostResProperty_Action extends Base {
	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
		public PostResProperty_Action(WebDriver driver) {
		Base.driver = driver;
	}

	public static void Test_Res_Property_Validation() throws Exception {

		Log.info("Inside Test_Res_Property_Validation");
		PageFactory.initElements(driver, PostResProperty_Page.class);
		PageFactory.initElements(driver, Login_Page.class);
		Functions.Click(Login_Page.MenuIcon);
		Functions.Click(Login_Page.MenuIcon);
		Functions.waitForElement(PostResProperty_Page.PostProperty_Link);
		Functions.Click(PostResProperty_Page.PostProperty_Link);
		//Thread.sleep(500);
		Functions.Click(PostResProperty_Page.GoToStep2);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(PostResProperty_Page.Msg_To_totalnobed_required.getText(), "Select total number of bedrooms");
		logger.info("Verified Msg :"+ PostResProperty_Page.Msg_To_totalnobed_required.getText());
		
		softAssert.assertEquals(PostResProperty_Page.Msg_To_totalbaths_required.getText(), "Select total number of bedrooms");
		logger.info("Verified Msg :" + PostResProperty_Page.Msg_To_totalbaths_required.getText());

		softAssert.assertEquals(PostResProperty_Page.Msg_To_Selling_Price_required.getText(),
				"Provide property price information");
		logger.info("Verified Msg :" + PostResProperty_Page.Msg_To_Selling_Price_required.getText());
	
		softAssert.assertEquals(PostResProperty_Page.Msg_To_CarpetArea_required.getText(),
				"Please enter carpet area value");
		logger.info("Verified Msg :" + PostResProperty_Page.Msg_To_CarpetArea_required.getText());
		
		softAssert.assertEquals(PostResProperty_Page.Msg_To_totalFloors_required.getText(),
				"Enter total floors information");
		logger.info("Verified Msg :" + PostResProperty_Page.Msg_To_totalFloors_required.getText());
		
		softAssert.assertEquals(PostResProperty_Page.Msg_To_Floor_required.getText(),
				"Enter floor number information");
		logger.info("Verified Msg :" + PostResProperty_Page.Msg_To_Floor_required.getText());
		Thread.sleep(1000);
		WebElement slider = driver.findElement(By.xpath("//div[@id='divResiBedroom']/div/span[1]/span[1]/span[1]/span[1]"));
		Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(PostResProperty_Page.totalbed_slider, 30, 0).build();
        action.perform();
        Thread.sleep(1000);
        Actions move1 = new Actions(driver);
        Action action1 = (Action) move1.dragAndDropBy(PostResProperty_Page.totalBathroom_slider, 30, 0).build();
        action1.perform();
        Thread.sleep(1000);
        Functions.SelectByValue(PostResProperty_Page.Price_Cr, "1");
        Functions.SelectByValue(PostResProperty_Page.Price_lakh, "25");
        Functions.Enter(PostResProperty_Page.CarpetArea, "1500");
        Functions.Enter(PostResProperty_Page.TotalFloors, "10");
        Functions.Enter(PostResProperty_Page.NoOfFloor, "5");
        Functions.Click(PostResProperty_Page.GoToStep2);
        Thread.sleep(1000);
        Functions.Click(PostResProperty_Page.GoToStep3);
        Functions.Click(PostResProperty_Page.Amenities_ReseredParking);
        Functions.Click(PostResProperty_Page.Amenities_Lift);
        Functions.Click(PostResProperty_Page.Amenities_Security);
        Functions.Click(PostResProperty_Page.Amenities_PowerBackup);
        Functions.Click(PostResProperty_Page.Amenities_SwimmingPool);
        Functions.Click(PostResProperty_Page.Amenities_ClubHouse);
        Functions.Click(PostResProperty_Page.GoToStep4);
        Functions.SelectByText(PostResProperty_Page.Location, "Naranpura");
        Functions.Enter(PostResProperty_Page.PinCode, "380013");
        Functions.Click(PostResProperty_Page.GoToStep5);
        Functions.Click(PostResProperty_Page.UploadMainImage);
        Thread.sleep(2000);
       System.out.println("AutoIT script path :"+System.getProperty("user.dir")+Constant.FileUploadScript);
		
		Runtime.getRuntime().exec(System.getProperty("user.dir")+Constant.FileUploadScript);
      
        Thread.sleep(2000);
	}
}
