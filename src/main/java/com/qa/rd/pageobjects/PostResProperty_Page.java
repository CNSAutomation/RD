package com.qa.rd.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostResProperty_Page {

	@FindBy(how = How.ID, using = "SocietyName")
	public static WebElement SocietyName;
	@FindBy(how = How.LINK_TEXT, using = "Post a Property")
	public static WebElement PostProperty_Link;
	@FindBy(how = How.ID, using = "txt_beds_post-error")
	public static WebElement Msg_To_totalnobed_required;
	@FindBy(how = How.ID, using = "txt_baths_post-error")
	public static WebElement Msg_To_totalbaths_required;
	@FindBy(how = How.ID, using = "divValidationStep2")
	public static WebElement Msg_To_Selling_Price_required;
	@FindBy(how = How.ID, using = "divValidationCarpetArea")
	public static WebElement Msg_To_CarpetArea_required;
	@FindBy(how = How.ID, using = "divValidationTotalFloors")
	public static WebElement Msg_To_totalFloors_required;
	@FindBy(how = How.ID, using = "NumberOfFloor-error")
	public static WebElement Msg_To_Floor_required;
	@FindBy(how = How.ID, using = "ddPriceInCrore")
	public static WebElement Price_Cr;
	@FindBy(how = How.ID, using = "ddPriceInLakh")
	public static WebElement Price_lakh;
	@FindBy(how = How.ID, using = "ddPriceInThousand")
	public static WebElement Price_Thousand;
	@FindBy(how = How.ID, using = "CarpetArea")
	public static WebElement CarpetArea;
	@FindBy(how = How.ID, using = "BuiltupArea")
	public static WebElement BuiltupArea;
	@FindBy(how = How.ID, using = "SuperBuiltupArea")
	public static WebElement SuperBuiltupArea;
	@FindBy(how = How.ID, using = "ddAreaUnitType")
	public static WebElement DD_Unit;
	@FindBy(how = How.ID, using = "Floors")
	public static WebElement TotalFloors;
	@FindBy(how = How.ID, using = "NumberOfFloor")
	public static WebElement NoOfFloor;
	@FindBy(how = How.XPATH, using = "//div[@id='post_prop']/div/a/span")
	public static WebElement GoToStep2;
	@FindBy(how = How.XPATH, using = "//div[@id='prop_highlight']/a[1]/span")
	public static WebElement GoToStep3;
	
	@FindBy(how = How.XPATH, using = "//div[@id='divResiBedroom']/div/span[1]/span[1]/span[1]/span[1]")
	public static WebElement totalbed_slider;
	
	@FindBy(how = How.XPATH, using = "//div[@id='divBathRoom']/div/span[1]/span[6]")
	public static WebElement totalBathroom_slider;
	
	@FindBy(how = How.XPATH, using = "//div[@id='divResiFlatsAmenities']/div[1]")
	public static WebElement Amenities_ReseredParking;
	
	@FindBy(how = How.XPATH, using = "//div[@id='divResiFlatsAmenities']/div[3]")
	public static WebElement Amenities_Security;
	
	@FindBy(how = How.ID, using = "divApartmentLift")
	public static WebElement Amenities_Lift;
	
	@FindBy(how = How.XPATH, using = "//div[@id='divResiFlatsAmenities']/div[4]")
	public static WebElement Amenities_PowerBackup;
	
	@FindBy(how = How.XPATH, using = "//div[@id='divResiFlatsAmenities']/div[15]")
	public static WebElement Amenities_SwimmingPool;
	
	@FindBy(how = How.XPATH, using = "//div[@id='divResiFlatsAmenities']/div[17]")
	public static WebElement Amenities_ClubHouse;
	
	@FindBy(how = How.XPATH, using = "//div[@id='prop_amenities']/div/a[1]/span")
	public static WebElement GoToStep4;
	
	@FindBy(how = How.ID, using = "LocationID")
	public static WebElement Location;
	
	@FindBy(how = How.ID, using = "ZipCode")
	public static WebElement PinCode;
	
	@FindBy(how = How.XPATH, using = "//div[@id='prop_location']/div/a[1]/span")
	public static WebElement GoToStep5;
	
	@FindBy(how = How.XPATH, using = "//div[@id='divResMainImageUploader']/div/div/div[1]")
	public static WebElement UploadMainImage;
	
	@FindBy(how = How.XPATH, using = "//div[@id='divBuildingEntranceImageUploader_1']/div/div/div[1]")
	public static WebElement BuildingEnterenceImage;
	
	@FindBy(how = How.XPATH, using = "//div[@id='prop_photos']/div/a[1]/span")
	public static WebElement GoToStep6;
	
	@FindBy(how = How.XPATH, using = "//div[@id='divTermsNdConditions']/div/div/div/input")
	public static WebElement AgreeTerm;
	
	@FindBy(how = How.ID, using = "btnPostProperty")
	public static WebElement PostPropertybtn;
	
	
}
