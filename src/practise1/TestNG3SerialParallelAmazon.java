package practise1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG3SerialParallelAmazon {
  @Test
  public void AmazonTest() throws InterruptedException {
	  
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(2000);
	  driver.close();
  }
}
