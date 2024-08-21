package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxUsingPOM {

   @FindBy (xpath = "//input[@id='userid']") private WebElement UserID;
	
   @FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	
   @FindBy(xpath = "//button[@class='button-orange wide']") private WebElement LoginButton;

   public CoverFoxUsingPOM (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserId()
	{
		UserID.sendKeys("DV1510");
		
	}
	
	public void EnterPassword()
	{
		PWD.sendKeys("Year@123");
	}
	
	public void ClickOnLoginButton()
	{
		LoginButton.click();
	}


}
