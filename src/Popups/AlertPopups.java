package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		al.accept();
		Thread.sleep(2000);
		//Alert an = driver.switchTo().alert();
		al.accept();
		String myText = driver.findElement(By.className("barone")).getText();
		System.out.println(myText);
		
		
	}

}
