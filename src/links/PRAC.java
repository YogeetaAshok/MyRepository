package links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PRAC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("Pke_EE")).sendKeys("i phone 14 pro");
		driver.findElement(By.className("_2iLD__")).click();
		String rating = driver.findElement(By.xpath("((//div[contains(@class,'col')])[8]//span)[4]")).getText();
		System.out.println(rating);
		
		
		

	}

}
