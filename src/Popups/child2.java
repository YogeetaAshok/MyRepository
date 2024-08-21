package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		Set<String> allids = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allids);
		al.get(1);
		driver.switchTo().window(al.get(1));
		driver.manage().window().maximize();
		
		driver.switchTo().window(al.get(0));
		
	}

}
