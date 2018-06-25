package com.qa.rd.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotPwd_Page {

	@FindBy(how = How.XPATH, using = "//form[@id='frmLogin']/div/a")
	public static WebElement ForgotPwd_Link;
	@FindBy(how = How.ID, using = "ForgotResetPassword_EmailOrPhone")
	public static WebElement txtLogin;
	@FindBy(how = How.ID, using = "ForgotResetPassword_EmailOrPhone-error")
	public static WebElement Msg_EmailorPhone_Required;
	@FindBy(how = How.ID, using = "sbtnForgotPwdClick")
	public static WebElement submitbtn;
}
