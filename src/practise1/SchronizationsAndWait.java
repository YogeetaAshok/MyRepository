package practise1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;



public class SchronizationsAndWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.discoveryplus.in/home");
	     
	     
	  //   Thread.sleep(15000);
	     //Static wait,will wait for all 15000 seconds
	     //result came in 18000 
	     
	 //  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
	     // implicit wait -15000--> page load 8000? save-->next execution
	     //you are waiting for 100sec🡪 page loaded in 20 sec🡪 once page loaded🡪 release timeout(80sec)
	   //result came in 11000

	 //  WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(15000));
	 //   w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h6[text()='Sign In'])[2]")));
		//Explicit wait:Applicable: single element
	    // 1 parameter: time value(seconds)
	    // 2 parameter: Condition (isselected, isdisplayed, isenabled)
	  //result came in 11000

	    FluentWait<WebDriver> W=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(15000)).pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class);
	    W.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h6[text()='Sign In'])[2]")));
	     //. Fluent wait:
	     //Applicable: single element
	     //1 parameter: time value(seconds)//1000ms
	     //2 parameter: Condition (isselected, isdisplayed, isenabled)
	    // 3 frequency: time(time in sec)- 5 m sec🡪10ms
	    //result came in 11000

	     
	     driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
	}

}
