package POMpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CFHomePage {

	
	// WebElements--> data members
	
	@FindBy(xpath ="//div[text()='Male']") private WebElement maleButton;
	
	//constructor 
	
	public CFHomePage (WebDriver driver) 
	{ PageFactory.initElements(driver, this);}
	
	// methods
	
	public void clickOnGenderButton()
	{maleButton.click();}
	
	
	
	
}