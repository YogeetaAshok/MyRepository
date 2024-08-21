package practise1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AssertDataProvider {
	

	
  @Test (dataProvider = "Boys" , dataProviderClass = practise1.AssertDataProviderclass.class)
  public void equals (String firstname, String lastname ,String regEmail) throws InterruptedException {
		
	
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  driver.get("https://www.facebook.com/signup");
	  driver.findElement(By.name("firstname")).sendKeys(firstname);
	  driver.findElement(By.name("lastname")).sendKeys(lastname);
	  driver.findElement(By.name("reg_email__")).sendKeys(regEmail);
	  Thread.sleep(2000);
	  driver.close();
  }
}
