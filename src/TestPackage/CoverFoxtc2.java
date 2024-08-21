 package TestPackage;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasePackage.Base;
import POMpackage.CFHealthPlan;
import POMpackage.CFHomePage;
import POMpackage.CoverFoxAddressDetails;
import POMpackage.CoverFoxResultPage;
import POMpackage.memberDetailsPage;
import UtilityPackage.Utility3;
@Listeners(UtilityPackage.Listeners.class)



public class CoverFoxtc2 extends Base {
	
	CFHomePage Homepage;
	CFHealthPlan HealthPlan;
	memberDetailsPage MemberDetails;
	CoverFoxAddressDetails AddressPage;
	CoverFoxResultPage resultPage;
	String filePath;
	
	
	@BeforeTest
	public void launchBrowser() throws InterruptedException 
	{
		OpenBrowser();
		Homepage=new CFHomePage(driver);
		HealthPlan=new CFHealthPlan(driver);
		MemberDetails=new memberDetailsPage(driver);
		Thread.sleep(5000);
		AddressPage=new CoverFoxAddressDetails(driver);
		resultPage=new CoverFoxResultPage(driver);
		filePath = "C:\\Users\\yogee\\Downloads\\COVERFOXEXCEL.xlsx";
	}

	@BeforeClass
	public void preconditions() throws InterruptedException, EncryptedDocumentException, IOException {
	
		Homepage.clickOnGenderButton();
		Thread.sleep(1000);
		HealthPlan.nextclick();
		Thread.sleep(1000);
		MemberDetails.HandleDropDown(Utility3.readDataFromExcel(filePath, "Sheet1", 0, 0));
		MemberDetails.clickOnNextButton();
		Thread.sleep(1000);
		AddressPage .enterPincode(Utility3.readDataFromExcel(filePath, "Sheet1", 0, 1));
		AddressPage.enterMobileNumber(Utility3.readDataFromExcel(filePath, "Sheet1", 0, 2));
		AddressPage.clickOnContinueButton();
		
	}
	
	@Test
	public void validateBanners() throws InterruptedException, EncryptedDocumentException, IOException {
		Thread.sleep(4000);
		Assert.fail();
		int bannersPlanbanners=resultPage.getPlannersFromBanners();
		int StringPlanNumbers = resultPage.getPlanNumersFromString();
				
		assertEquals(bannersPlanbanners, StringPlanNumbers,"Plan on banners not matching with results,TC failed");
		
		
	}
	
	@AfterClass
	public void browserClose()
	{
		closeBrowser();
	}
	
}
