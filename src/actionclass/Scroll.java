package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(1000);
		
		WebElement bookingSection = driver.findElement(By.xpath("//h1[text()='Book & Buy onPaytm.']"));
		Actions act= new Actions(driver);
		Thread.sleep(1000);
		act.scrollToElement(bookingSection).perform();
	}

}
