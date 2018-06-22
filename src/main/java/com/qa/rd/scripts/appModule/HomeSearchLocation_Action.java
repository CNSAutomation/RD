package com.qa.rd.scripts.appModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.rd.pageobjects.Home_Page;
import com.qa.rd.scripts.base.Base;
import com.qa.rd.scripts.library.Functions;
import com.qa.rd.scripts.utility.Log;

// This is called Modularization, when we club series of actions in to one Module
// For Modular Driven Frameworkg, please see http://www.toolsqa.com/modular-driven/   
public class HomeSearchLocation_Action extends Base {
	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
	public HomeSearchLocation_Action(WebDriver driver) {
		Base.driver = driver;
	}

	public static void Test_SearchBuyLocation(String SearchTab, String SearchText, String MatchLocation)
			throws Exception {
		Thread.sleep(2000);
		Log.info("Inside HomeSearchLocation_Action");
		PageFactory.initElements(driver, Home_Page.class);
		Functions.Home_SearchLocation(SearchTab, SearchText, MatchLocation);
		Functions.Click(Home_Page.ProeprtyType_DD);
		
		Functions.Click(Home_Page.Apertmentchk);
		
		Functions.Click(Home_Page.BHK1chk);
		
		Functions.Click(Home_Page.Buy_Searchbtn);
		
	}

	public static void Test_SearchServiceLocation(String SearchTab, String SearchText, String MatchLocation)
			throws Exception {
		Thread.sleep(2000);
		Log.info("Inside HomeSearchServiceLocation_Action");
		PageFactory.initElements(driver, Home_Page.class);
		Functions.Click(Home_Page.FindServicesTab);
		Functions.Home_SearchLocation(SearchTab, SearchText, MatchLocation);
		Functions.Click(Home_Page.ServiceType_DD);
		
		Functions.Click(Home_Page.Agentschk);
		
		Functions.Click(Home_Page.Architectschk);
		logger.info("Checked Architects");
		Functions.Click(Home_Page.CivilContractorschk);
		logger.info("Checked Civil Contractor");
		Functions.Click(Home_Page.Service_Searchbtn);
		logger.info("Click on Search button");
	}
}
