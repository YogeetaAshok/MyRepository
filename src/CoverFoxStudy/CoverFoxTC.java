package CoverFoxStudy;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoverFoxTC {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opts);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		String filePath = "C:\\Users\\yogee\\Downloads\\COVERFOXEXCEL.xlsx";
				
		String age = Utility.readDataFromExcel(filePath, "Sheet1", 1, 0);
		String pinCode = Utility.readDataFromExcel(filePath, "Sheet1", 1, 1);
		String mobileNumber = Utility.readDataFromExcel(filePath, "Sheet1", 1, 2);
		
		// create object of pages
		CFHomePage home= new CFHomePage(driver);
		home.clickOnGenderButton();
		//driver.findElement(By.xpath("//div[text()='Female']")).click();
		CFHealthPlan member=new CFHealthPlan(driver);
		member.nextclick();
		
		memberDetailsPage drop=new memberDetailsPage(driver);
		drop.HandleDropDown();
		drop.clickOnNextButton();
	
		CoverFoxAddressDetails addressDertailsPage = new CoverFoxAddressDetails(driver);

		addressDertailsPage.enterPincode(pinCode);
		addressDertailsPage.enterMobileNumber(mobileNumber);
		addressDertailsPage.clickOnContinueButton();
		Thread.sleep(4000);
		CoverFoxResultPage resultPage = new CoverFoxResultPage(driver);
		resultPage.validateBanners();
		Thread.sleep(4000);
		driver.close();
	
	
	
	
	
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
