package listdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listdownst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement dropdown = driver.findElement(By.cssSelector("select#dropdown-class-example"));
		Select s=new Select(dropdown);
		//s.selectByIndex(2);
		//s.selectByValue("option2");
		s.selectByVisibleText("Option2");
		
		System.out.println(s.isMultiple());
		
	}

}
