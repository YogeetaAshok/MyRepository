package POMpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class memberDetailsPage {

	@FindBy(name ="You") private WebElement ageDropDown;
	
	@FindBy(className ="next-btn") private WebElement nextButton1;
	
	public memberDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void HandleDropDown()
	{
		Select s=new Select(ageDropDown);
		s.selectByValue("24y");
	}
	
	public void HandleDropDown(String string)
	{
		Select s=new Select(ageDropDown);
		s.selectByValue("24y");
	}
	
	
	public void clickOnNextButton() {
		nextButton1.click();
}

}