package locatorclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class today3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 WebElement ifsss = driver.findElement(By.id("displayed-text"));
		 System.out.println("element is " +ifsss.isDisplayed());
		 if(ifsss.isDisplayed())
		  {
			  System.out.println("Element is present");
		  }
		  else
		  {
			  System.out.println("Element is not displayed");
		  }
		 ifsss.sendKeys("Yogee");
		 driver.findElement(By.id("hide-textbox")).click();
		  System.out.println("element is " +ifsss.isDisplayed());
		  if(ifsss.isDisplayed())
		  {
			  System.out.println("Element is displayed");
		  }
		  else
		  {
			  System.out.println("Element is not displayed");
		  }
		 
		
		
		
		
		
	}
	
}
