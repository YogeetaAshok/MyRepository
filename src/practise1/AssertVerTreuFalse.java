package practise1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;



public class AssertVerTreuFalse {
  @Test//for true and false
  public void fbtest() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/signup");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  WebElement customgender = driver.findElement(By.xpath("//label[text()='Custom']"));
	  boolean result = customgender.isDisplayed();
	  
	  /*
	  if(result)
	  {
		  Reporter.log("Element is present,TC is passed",true);
	  }
	  else
	  {
		  Reporter.log("Element is absent,TC is failed",true);
	  }
	  */
	  
	//  Assert.assertTrue(result);
	  
	  Assert.assertFalse(result,"The result is true ,hence testcase is failed");	
  }
}
