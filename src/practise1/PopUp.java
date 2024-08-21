package practise1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class PopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//Hidden division popup
		//WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
	//	driver.get("https://www.makemytrip.com/");
		//Thread.sleep(4000);
		//driver.findElement(By.className("commonModal__close")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("(//span[text()='Hotels'])[1]")).click();
	
		
//Alert Popup
		
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
		 
		/*
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
		alt.accept();
		*/
		
		
	}

}
