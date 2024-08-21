package POMpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CFHealthPlan {

	

		@FindBy(xpath = "//div[@class='next-btn']") private WebElement nextButton;
		
		public CFHealthPlan(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			}

		public void nextclick() {
			nextButton.click();
		}
		
}
