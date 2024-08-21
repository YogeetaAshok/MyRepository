package practise1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG3SerialParallelFB {
  @Test
  public void FbTest() throws InterruptedException {
	  
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/signup");
	  Thread.sleep(2000);
	  driver.close();
  }
}
