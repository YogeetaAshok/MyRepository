package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unordrlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Velocity");
		Thread.sleep(1000);
		List<WebElement> re = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		System.out.println(re.size());
		for(WebElement j:re)
		{
			
			System.out.println(j.getText());
		}
		
		String required= "velocity meaning";
		
		for (WebElement j:re)
		{
			
			String actualtext = j.getText();
			if(actualtext.equals(required))
			{
				j.click();
				break;
			}
		}
		
		
		
		
	}

}
