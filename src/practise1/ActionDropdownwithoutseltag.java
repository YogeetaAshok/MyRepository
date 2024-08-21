package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDropdownwithoutseltag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php");
		WebElement dropdown = driver.findElement(By.id("day"));
		Actions act=new Actions(driver);
		for(int i=1; i<=5;i++)
		{
			act.sendKeys(dropdown, Keys.ARROW_DOWN).perform();
		}
		
		 Thread.sleep(2000);
		 act.sendKeys(Keys.ENTER).perform();
		 
			WebElement dropdown1 = driver.findElement(By.id("month"));
			for(int i=1; i<=6;i++)
			{
				act.sendKeys(dropdown1, Keys.ARROW_UP).perform();
			}
			
			 Thread.sleep(2000);
			 act.sendKeys(Keys.ENTER).perform();
			 
			 WebElement dropdown2 = driver.findElement(By.id("year"));
				for(int i=1; i<=30;i++)
				{
					act.sendKeys(dropdown2, Keys.ARROW_DOWN).perform();
				}
				
				 Thread.sleep(2000);
				 act.sendKeys(Keys.ENTER).perform();
			 
		
	}

}
