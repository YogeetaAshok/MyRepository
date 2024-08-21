package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ratings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Iphone 14 pro");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String dynamicRatings = driver.findElement(By.xpath("((//div[contains(@class,'col')])[8]//span)[4]")).getText();
		System.out.println(dynamicRatings);
	}

}
