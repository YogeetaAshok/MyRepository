package practise1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxEG1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.xpath("//div[text()='Female']")).click();
		driver.findElement(By.xpath("(//div[@class='ms-img-bx'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='ms-img-bx'])[2]")).click();
		driver.findElement(By.className("next-btn")).click();
		WebElement dropdown = driver.findElement(By.id("Age-Spouse"));
		Select s=new Select(dropdown);
		s.selectByValue("50y");
		driver.findElement(By.className("next-btn")).click();
		driver.findElement(By.className("mp-input-text")).sendKeys("440009");
		driver.findElement(By.id("want-expert")).sendKeys("8291298060");
		driver.findElement(By.className("next-btn")).click();	
		Thread.sleep(4000);
		String text = driver.findElement(By.xpath("//div[contains(text(),'Insurance Plans')]")).getText();
	    System.out.println(text);//Will get the result of search
	    String[] ar = text.split(" ");//split the text
	   String numberInString= ar[0];//store it in array
	   int result = Integer.parseInt(numberInString);//find the number in the string
	   System.out.println("Matching number is " +result);
	   List<WebElement> banners = driver.findElements(By.className("plan-card-container"));//finding the number of plans
	   int numberOfBanners = banners.size();
	   System.out.println("Total Banners are " +numberOfBanners);
	   
	   if(result==numberOfBanners)
	   {
		   System.out.println("Test case is passed");
	   }
	   
	   else	
	   {
		   System.out.println("Test case if failed");
	   }
	}

}
