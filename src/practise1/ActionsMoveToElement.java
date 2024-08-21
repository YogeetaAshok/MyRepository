package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		Actions act=new Actions(driver);
		act.moveToElement(login).perform();
		Thread.sleep(10000);
		driver.findElement(By.className("AT0fUR")).click();
		*/
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(1000);
		//Scrolling
		//1.
		//WebElement bookingSection = driver.findElement(By.xpath("//h1[text()='Book & Buy on Paytm.']"));
		WebElement rech = driver.findElement(By.xpath("//span[text()='Recharge & pay bills']"));
		//2.
		Actions act= new Actions(driver);
		//3.
		Thread.sleep(1000);
		act.scrollToElement(rech).perform();
		
		
	}

}
