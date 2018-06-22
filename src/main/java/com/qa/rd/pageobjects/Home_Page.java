package com.qa.rd.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Home_Page {

	@FindBy(how = How.LINK_TEXT, using = "Sign in")
	public static WebElement SignInLink;
	@FindBy(how = How.ID, using = "email")
	public static WebElement Email;
	@FindBy(how = How.ID, using = "passwd")
	public static WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@id='SubmitLogin']/span")
	public static WebElement SignIn_btn;
	@FindBy(how = How.XPATH, using = "//div[@id='center_column']/div/ol/li")
	public static WebElement error_msg;
	@FindBy(how = How.XPATH, using = "//div[@id='buy']/div[1]/div/ul/li/input")   
	public static WebElement txtSearchBuy_Location;
	@FindBy(how = How.XPATH, using = "//div[@id='find_services']/form/div[1]/div/ul/li/input")
	public static WebElement txtSearchService_Location;
	@FindBy(how = How.ID, using = "spnBuySelectedPropType")
	public static WebElement ProeprtyType_DD;
	@FindBy(how = How.XPATH, using = "//div[@id='res_prop_type']/div[1]/div[1]/div/label") 
	public static WebElement Apertmentchk; 
	@FindBy(how = How.XPATH,  using = "//div[@id='res_prop_type']/div[3]/div[1]/div/label")
	public static WebElement BHK1chk;
	@FindBy(how = How.ID, using = "spnBuyBudgetRange")
	public static WebElement Budget_DD;
	@FindBy(how = How.ID, using = "selBuyMaxBudget")
	public static WebElement MaxBudget_dd;
	@FindBy(how = How.XPATH, using = "//div[@id='buy']/div[4]/a")
	public static WebElement Buy_Searchbtn;
	@FindBy(how = How.XPATH, using = "//a[@id='ui-id-4']")
	public static WebElement selectVastrapur;
	@FindBy(how = How.ID, using = "spnServiceSelectedType")
	public static WebElement ServiceType_DD;
	@FindBy(how = How.XPATH, using = "//div[@id='srv_type_list']/div[1]/div[1]/div/label")
	public static WebElement Agentschk;
	@FindBy(how = How.XPATH, using = "//div[@id='srv_type_list']/div[1]/div[3]/div/label")
	public static WebElement Architectschk;
	@FindBy(how = How.XPATH, using = "//div[@id='srv_type_list']/div[2]/div[1]/div/label")
	public static WebElement CivilContractorschk;
	@FindBy(how = How.XPATH, using = "//li[@id='liFindServices']/a")
	public static WebElement FindServicesTab; 
			
	@FindBy(how = How.XPATH, using = "//div[@id='find_services']/form/div[3]/a")
	public static WebElement Service_Searchbtn;
}
