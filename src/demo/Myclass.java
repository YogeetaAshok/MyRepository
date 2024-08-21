package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Yogeeta");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Chalpe");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("yogeechalpe21@gmail.com");
	driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("yogeechalpe21@gmail.com");
	
	}
	
}
