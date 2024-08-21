package practise1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/*
 * WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.indeed.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//span[contains(text(),'with Google')]")).click();
		String mainpageid = driver.getWindowHandle();
		System.out.println(mainpageid);
		Set<String> allpageid = driver.getWindowHandles();
		ArrayList<String>bl=new ArrayList<String>(allpageid);
		System.out.println(bl.getLast());
		System.out.println("Child window id is " +bl.get(1));
		String childid = bl.get(1);
		driver.switchTo().window(childid);
		driver.findElement(By.id("identifierId")).sendKeys("yogeechalpe21@gmail.com");
		driver.switchTo().window(bl.get(0));
 */
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.indeed.com/");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.id("login-google-button")).click();
		String mainpageid = driver.getWindowHandle();
		System.out.println("Main page id is" +mainpageid);
		Set<String> allpageids = driver.getWindowHandles();
		ArrayList<String> bl=new ArrayList<String>(allpageids);
		System.out.println(bl.getLast());

		System.out.println(bl.size());
		String childid = bl.get(1);
		System.out.println("Child page id is" +childid);
		driver.switchTo().window(childid);
		driver.findElement(By.name("identifier")).sendKeys("yogeechalpe21@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.switchTo().window(mainpageid); 	
		
	}

}
