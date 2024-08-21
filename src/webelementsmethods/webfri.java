package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webfri {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Yogeeta");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'u_0_4_')]")).click();
		String fortext = driver.findElement(By.xpath("//div[text()='Create a new account']")).getText();
		System.out.println(fortext);
	}
}
