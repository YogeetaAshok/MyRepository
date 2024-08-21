package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver()	;
	driver.manage().window().maximize();
	/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
	Select s=new Select(listbox);
	s.selectByValue("option2");
	System.out.println(s.isMultiple());
	//if true select  the number of times
	 * 
	driver.get("https://demoqa.com/select-menu");
	WebElement dd = driver.findElement(By.id("oldSelectMenu"));
	Select r=new Select(dd);
	r.selectByValue("2");
	System.out.println(r.isMultiple());
	 */
	driver.get("https://demoqa.com/select-menu");
	WebElement ids = driver.findElement(By.id("cars"));
	Select s=new Select(ids);
	System.out.println(s.isMultiple());
	s.selectByValue("volvo");
	s.selectByValue("saab");
	
		

	}

}
