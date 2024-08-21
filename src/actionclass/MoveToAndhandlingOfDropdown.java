package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToAndhandlingOfDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		Actions act=new Actions(driver);
		act.moveToElement(login).perform();
		driver.findElement(By.className("AT0fUR")).click();
		/*close login button
		 * step1-call action class method,pass object driver to the constructor
		 * step2-identify the emelemt where action is needed and create its object
		 * step3-to display all the options of the element call action class method more to element.pass the object of webelement
		 * use perfomr to execute mouse related function
		*/

			

		
		
		
	}

}
