package CoverFoxStudy;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CoverFoxStudy.CFHealthPlan;
import CoverFoxStudy.CFHomePage;
import CoverFoxStudy.memberDetailsPage;

public class CoverFoxtc2 {
	WebDriver driver;
	CFHomePage Homepage;
	CFHealthPlan HealthPlan;
	memberDetailsPage MemberDetails;
	CoverFoxAddressDetails AddressPage;
	CoverFoxResultPage resultPage;
	String filePath = "C:\\Users\\yogee\\Downloads\\COVERFOXEXCEL.xlsx";
	
	
	@BeforeTest
	public void launchBrowser() throws InterruptedException
	{
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		driver= new ChromeDriver(opts);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		
		
		//created objects if all the classes.
		Homepage=new CFHomePage(driver);
		HealthPlan=new CFHealthPlan(driver);
		MemberDetails=new memberDetailsPage(driver);
		Thread.sleep(5000);
		AddressPage=new CoverFoxAddressDetails(driver);
		resultPage=new CoverFoxResultPage(driver);
		
	}

	@BeforeClass
	public void preconditions() throws InterruptedException, EncryptedDocumentException, IOException {
		Homepage.clickOnGenderButton();
		Thread.sleep(1000);
		HealthPlan.nextclick();
		Thread.sleep(1000);
		MemberDetails.HandleDropDown(Utility.readDataFromExcel(filePath, "Sheet1", 0, 0));
		MemberDetails.clickOnNextButton();
		Thread.sleep(1000);
		AddressPage .enterPincode(Utility.readDataFromExcel(filePath, "Sheet1", 0, 1));
		AddressPage.enterMobileNumber(Utility.readDataFromExcel(filePath, "Sheet1", 0, 2));
		AddressPage.clickOnContinueButton();
		
	}
	
	@Test
	public void validateBanners() throws InterruptedException, EncryptedDocumentException, IOException {
		Thread.sleep(4000);
		int bannersPlanbanners=resultPage.getPlannersFromBanners();
		int StringPlanNumbers = resultPage.getPlanNumersFromString();
				
		assertEquals(bannersPlanbanners, StringPlanNumbers,"Plan on banners not matching with results,TC failed");
		
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
}
