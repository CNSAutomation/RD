package com.qa.rd.scripts.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.rd.pageobjects.Home_Page;
import com.qa.rd.pageobjects.Login_Page;
import com.qa.rd.scripts.base.Base;
import com.qa.rd.scripts.utility.Log;

public class Functions extends Base {

	public static void Click(WebElement element) throws Exception {
		// Highlight the Element before Click
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", element);
		logger.info("Click on :" + element.getText());
		Log.info("Click on :" + element.getText());
		element.click();

		// Remove Highlight on Element after Click
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].style.border='0px'", element);
	}

	public static void Enter(WebElement element, String TestData) throws Exception {

		// Highlight the Element before Click
		element.clear();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", element);
		element.clear();
		logger.info("Enter Test Data :" + TestData + " in field " + element);
		Log.info("Enter Test Data :" + TestData + " in field " + element);
		element.sendKeys(TestData);

		// Remove Highlight on Element after Click
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].style.border='0px'", element);

	}

	public static void MouseHover(WebElement element) throws Exception {
		// Highlight the Element before Click
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", element);
		Actions a1 = new Actions(driver);
		a1.moveToElement(element).build().perform();
		logger.info("Mouse Hover on :" + element.getTagName());
		// Remove Highlight on Element after Click
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='0px'", element);

	}

	public static void SelectByValue(WebElement element, String ListValue) throws Exception {

		Thread.sleep(1000);
		Select select = new Select(element);
		logger.info("Select Value :" + element.getTagName());
		select.selectByValue(ListValue);
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].style.border='0px'", element);

	}

	public static void SelectByText(WebElement element, String ListValue) throws Exception {

		Thread.sleep(1000);
		Select select = new Select(element);
		logger.info("Select Value :" + element.getTagName());
		select.selectByVisibleText(ListValue);
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].style.border='0px'", element);

	}

	public static void ScrollToView(WebElement element) throws Exception {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		// ((JavascriptExecutor)driver).executeScript("window.scrollTo(" +
		// element.getLocation().x + "," + element.getLocation().y + ")");
		Thread.sleep(1000);

	}

	public static void selectOptionWithText(String textToSelect) throws Exception {

		// WebElement autoOptions = driver.findElement(By.id("ui-id-1"));
		// JavascriptExecutor js=(JavascriptExecutor)driver;
		// js.executeScript("alert(1)");
		// String sgVal = (String) js.executeScript("var returnVal = function (){ var
		// st='hello'; return st;} ");
		// System.out.println("SgVal : "+sgVal);

		WebElement autoOptions = driver.findElement(By.xpath(
				"//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all tagit-autocomplete']"));
		// List<WebElement> autoOptions = driver.findElements(By.cssSelector("html body
		// ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all.tagit-autocomplete"));
		// ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content
		// ui-corner-all tagit-autocomplete']

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(autoOptions));
		// int s = autoOptions.size();
		// if (s > 0)
		// {
		// for()
		List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
		// int i = 0;
		for (WebElement option : optionsToSelect) {
			if (option.getText().equals(textToSelect)) {
				logger.info("Select Option Value : " + option.getText());
				// driver.findElement(By.xpath("//@[id='ui-id-1']/li/a")).click();
				option.click();
				Thread.sleep(1000);
				break;
			}
			// i++;
		}

	}

	public static void selectLocationWithText(String textToSelect) throws Exception {

		WebElement autoOptions = driver.findElement(By.id("ui-id-2"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(autoOptions));

		List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
		for (WebElement option : optionsToSelect) {
			if (option.getText().equals(textToSelect)) {
				System.out.println("Trying to select: " + option.getText());
				driver.findElement(By.linkText(option.getText())).click();
				// driver.findElement(By.xpath("//@[id='ui-id-2']/li[2]/a/span")).click();
				// option.click();
				break;
			}
		}

	}

	public static void waitForElement(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void WaitForPageLoad() throws Exception {
		// driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This loop will rotate for 100 times to check If page Is ready after every 1
		// second.
		// You can replace your if you wants to Increase or decrease wait time.
		int waittime;
		waittime = 60;
		for (int i = 0; i < waittime; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			// To check page ready state.
			if (js.executeScript("return document.readyState").toString().equals("complete")) {
				// System.out.println("Wait for Page Load : "+js.executeScript("return
				// document.readyState").toString());
				break;
			}
		}
	}

	public static void CustomLogin(String LoginUser, String Password) throws Exception {

		PageFactory.initElements(driver, Login_Page.class);
		// Enter invalid email format
		Functions.Enter(Login_Page.Login_EmailorPhone, LoginUser);
		
		// Enter Password
		Functions.Enter(Login_Page.LoginPassword, Password);
		
		// Click on Sign In button
		Functions.Click(Login_Page.Login_btn);
		Thread.sleep(1000);
		Login_Page.MenuIcon.click();
		Thread.sleep(1000);

		if (Login_Page.LogoutLink.isDisplayed()) {
			logger.info("Display : " + Login_Page.LogoutLink.getText());
			Log.info("Display : " + Login_Page.LogoutLink.getText());
		}
	}

	public static void Home_SearchLocation(String SearchTab, String SearchText, String MatchLocation) throws Exception {
		if (SearchTab.equalsIgnoreCase("Buy")) {
			Functions.Enter(Home_Page.txtSearchBuy_Location, SearchText);
		}
		if (SearchTab.equalsIgnoreCase("Service")) {
			Functions.Enter(Home_Page.txtSearchService_Location, SearchText);
		}
		logger.info("Enter Search Location : " + SearchText);
		Functions.selectOptionWithText(MatchLocation);
		logger.info("Matched Search Location :" + MatchLocation);
	}

	public static void Alert_Accept() throws Exception {
		driver.switchTo().alert().accept();
		logger.info("Accept Alert.");
	}

	public static void Alert_dismiss() throws Exception {
		driver.switchTo().alert().dismiss();
		logger.info("Declain Alert.");

	}

	public static void mouseHoverAction(WebElement mainElement, String SubMenu) throws Exception {

		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		action.moveToElement(driver.findElement(By.linkText(SubMenu)));
		action.click().build().perform();
	}
}