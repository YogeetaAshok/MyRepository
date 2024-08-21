package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		//Identify list box to be handled and store it in reference variable

		Select s=new Select(dropdown);
		//Create an object of Select class which will accept WebElement as argument
		
		s.selectByIndex(2);// selectByIndex(int arg0) 
		s.selectByValue("option1");//selectByValue(String arg0)
		s.selectByVisibleText("Option3");//selectByVisibleText(String arg0) 
		
		/*By using one of the select class methods we can select values form list box like 
		1. selectByVisibleText: selectByVisibleText(String arg0) 
		2. selectByIndex: selectByIndex(int arg0) 
		3. selectByValue: selectByValue(String arg0)
         */
		
	//	multiselection drop down
		
		driver.navigate().to("https://demoqa.com/select-menu");
		WebElement multi = driver.findElement(By.name("cars"));
		Select k=new Select(multi);
		
		System.out.println(k.isMultiple());
		k.selectByValue("volvo");
		k.selectByValue("opel");
		k.selectByValue("audi");
		k.deselectByValue("volvo");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
