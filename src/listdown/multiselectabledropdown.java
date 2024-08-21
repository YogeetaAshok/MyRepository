package listdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectabledropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		WebElement multipleSelectDropdown = driver.findElement(By.id("cars"));
		Select s= new Select(multipleSelectDropdown);
		System.out.println(s.isMultiple());
		s.selectByIndex(0);
		s.selectByIndex(2);
		s.deselectByIndex(0);
		
	}

}
