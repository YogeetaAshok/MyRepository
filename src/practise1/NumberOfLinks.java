package practise1;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class NumberOfLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(10000);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links are " +allLinks.size());
		
		/*for(int i=1;i<=allLinks.size()-1;i++)
		{
			System.out.println(allLinks.get(i).getText());
		}
		
		//Another method each loop
		 * 
		 */
		
	/*	for(WebElement t:allLinks)
		{
			System.out.println(t.getText());
		}
		*/
		ListIterator<WebElement> ite = allLinks.listIterator();
		while(ite.hasNext())
		{
			String text=ite.next().getText();
				System.out.println(text);	
		}
		
		
	}

}
