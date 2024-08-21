
package keyboardActionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class eg2DropdownWithoutSelTagname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php");
		WebElement dropdown = driver.findElement(By.id("day"));
		Actions act=new Actions(driver);
	    Thread.sleep(2000);
		for(int i=1;i<=4;i++)
		{		act.sendKeys(dropdown, Keys.ARROW_DOWN).perform();
		
		}
		 Thread.sleep(2000);
		act.sendKeys(Keys.ENTER);
		
		
		
	}                        

}
