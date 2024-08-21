package keyboardActionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class eg1SendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php");
		WebElement firstname = driver.findElement(By.name("firstname"));
		Actions act=new Actions(driver);
		act.sendKeys(firstname, "Yogeeta").perform();
		
	}

}
