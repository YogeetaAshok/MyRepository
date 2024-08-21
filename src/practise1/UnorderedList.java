package practise1;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Velocity");
		Thread.sleep(1000);
		List<WebElement> ul = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		System.out.println(ul.size());
		for(WebElement hu:ul)
		{
			System.out.println(hu.getText());
			
		}
		
		String required="velocity unit";
		
		for(WebElement g:ul)
		{
			String actualText = g.getText();
			Thread.sleep(1000);
			if(actualText.equals(required))
			{
				g.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
