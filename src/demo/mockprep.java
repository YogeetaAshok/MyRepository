package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mockprep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Webdriver methods
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String getTitle = driver.getTitle();
		System.out.println("This is result of getTitle "+ getTitle);
		//driver.close();
		//driver.quit();
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("This page title is " +driver.getTitle());
		driver.navigate().back();
		System.out.println("This page current Url is " +driver.getCurrentUrl());
		Thread.sleep(500);
		
		//Locators
		
		
		//by attribute
		driver.findElement(By.xpath("(//input[@class='radioButton'])[1]")).click();
		//by contains
		WebElement text = driver.findElement(By.xpath("//h1[contains(text(),'Practice ')]"));
		System.out.println(text.getText());
		
		//relative path
		driver.findElement(By.xpath("//div[1]//label[2]//input")).click();
		
		//driver.findElement(By.xpath("//button[@id='openwindow']")).click();-By text
		//Thread.sleep(500);
		//driver.close();
		
		//css selector
		//css=tag#id
		
	
		
		
		
		
		
		
		
		

	}

}
