package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	WebElement leftclick = driver.findElement(By.xpath("//input[@value='radio2']"));
	Actions act= new Actions(driver);
	act.click(leftclick).perform();
	WebElement leftclick2 = driver.findElement(By.xpath("//input[@value='radio1']"));
	act.moveToElement(leftclick2).click().perform();
	
	}

}
