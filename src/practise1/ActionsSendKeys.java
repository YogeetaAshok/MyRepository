package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeys {

   public static void main(String[] args) {
	 
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://en-gb.facebook.com/r.php");
	   WebElement firstname = driver.findElement(By.name("firstname"));
	   Actions act=new Actions(driver);
	  // act.keyDown(firstname, Keys.SHIFT).sendKeys("Yogeeta").keyUp(Keys.SHIFT).build().perform();
	   act.keyDown(firstname,Keys.SHIFT).sendKeys("Yogeeta").keyUp(Keys.SHIFT).perform();
		
	   
	
}
	
	
}
