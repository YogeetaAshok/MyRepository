package listdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mul {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement multipledrop = driver.findElement(By.id("cars"));
		Select s=new Select(multipledrop);
		System.out.println(s.isMultiple());
		s.selectByValue("volvo");
		s.selectByValue("saab");
		s.selectByValue("audi");
		Thread.sleep(3000);
		s.deselectByValue("audi");
		
		
	}

}
