package com.qa.rd.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateServiceRequest_Page {
	@FindBy(how = How.XPATH, using = "//div[@id='filter_box']/div[3]/div[3]/a[1]")
	public static WebElement AddNewServiceReq_Link;
	@FindBy(how = How.ID, using = "btnClearFilter")
	public static WebElement Clearfilterbtn;
	@FindBy(how = How.ID, using = "btnCreateReq")
	public static WebElement CreateReqbtn;
	@FindBy(how = How.ID, using = "btnEditFeedback")
	public static WebElement EditFeedbackbtn;
	@FindBy(how = How.ID, using = "btn_4a1cf468-a370-e811-80d9-00155d066203")
	public static WebElement ViewContactbtn;
	@FindBy(how = How.ID, using = "btnFeedbackSubmit")
	public static WebElement FeedbackSumitbtn;
	@FindBy(how = How.XPATH, using = "//div[@id='creReqDiv']/div[2]/div/div/div[4]/div/div/div/span/span")
	public static WebElement Msg_Location_Required;
	@FindBy(how = How.XPATH, using = "//div[@id='creReqDiv']/div[2]/div/div/div[5]/div/span[2]/span")
	public static WebElement Msg_Service_Des_Required;
	@FindBy(how = How.XPATH, using = "//div[@id='creReqDiv']/div[2]/div/div/div[6]/div[1]/div/span[1]/span")
	public static WebElement Msg_From_Time_Required;
	@FindBy(how = How.XPATH, using = "//div[@id='creReqDiv']/div[2]/div/div/div[6]/div[2]/div/span[1]/span")
	public static WebElement Msg_To_Time_Required;
	@FindBy(how = How.ID, using ="txtServiceDesc")
	public static WebElement txtServiceDesc;
	@FindBy(how = How.ID, using = "ddlLocation")
	public static WebElement ServiceLocation_dd;
	@FindBy(how = How.XPATH, using ="//div[@class='creat_serv_list']/div")
	public static WebElement ServiceType_chkList;
	@FindBy(how = How.XPATH, using = "//div[@id='bs-example-navbar-collapse-1']/div/ul/li[4]/a[1]")
	public static WebElement AgentMenu;
	@FindBy(how = How.XPATH, using="//div[@id='creReqDiv']/div[2]/div/div/div[6]/div[1]/div/span[2]")
	public static WebElement FormCalc;
	@FindBy(how = How.XPATH, using ="//div[@id='creReqDiv']/div[2]/div/div/div[6]/div[2]/div/span/i")
	public static WebElement ToCalc;
	@FindBy(how = How.XPATH, using = "//div[5]/table/tbody/tr[2]/td[1]/input")
	public static WebElement SelectTimeFrom;
	@FindBy(how = How.XPATH, using = "//div[5]/table/tbody/tr[2]/td[1]/input")
	public static WebElement SelectTimeTo;
	@FindBy(how = How.CSS, using = ".bootstrap-timepicker-hour")
	public static WebElement SelectTime;
	@FindBy(how = How.LINK_TEXT, using = "My Service Requests")
	public static WebElement MyServiceRequests_Link;
			
}
