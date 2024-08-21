package links;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNumberOfLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		 List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		//print how many links are there?	
		 System.out.println(totalLinks.size());
		//using for loop
		//(int i=0;i<=totalLinks.size()-1;i++)
		// {
		//	 System.out.println(totalLinks.get(i).getText());
		// }
		 //each loop
		// for(WebElement t:totalLinks)
		// {
		//	 System.out.println(t.getText());
		 //}
		 
		Iterator<WebElement> it = totalLinks.iterator();
		while(it.hasNext())
		{
			String text = it.next().getAttribute("href");
			System.out.println(text);
		}
	}

}
