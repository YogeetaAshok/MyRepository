package readProperties;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import practise1.UTILITY;

public class fbSignupByProperties {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		  driver.get(UTILITY.readDataFromProperties("url"));
		 driver.findElement(By.name("firstname")).sendKeys( UTILITY.readDataFromProperties("firstName"));
		  driver.findElement(By.name("lastname")).sendKeys( UTILITY.readDataFromProperties("lastName"));
		  driver.findElement(By.name("reg_email__")).sendKeys( UTILITY.readDataFromProperties("mobNumber"));
		  Thread.sleep(2000);
		  driver.close();
		 
	}

}
