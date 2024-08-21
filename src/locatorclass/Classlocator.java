package locatorclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classlocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		//WebElement myclass = driver.findElement(By.className("btn-style class1 class2"));
		//myclass.click(); error shown because class name should not have space
		WebElement myclass=driver.findElement(By.className("radioButton"));
		myclass.click();
		//WebElement openTabButton = driver.findElement(By.linkText("Open Tab"));
		//openTabButton.click();
		driver.findElement(By.partialLinkText("Open")).click();
		
		//css tag and id
		
		driver.findElement(By.cssSelector("button#openwindow")).click();			
		
	}

}
