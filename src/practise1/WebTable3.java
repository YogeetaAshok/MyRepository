package practise1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		 int totalrows = rows.size();
		 System.out.println("Total rows are " +totalrows);
		 List<WebElement> columns = driver.findElements(By.xpath("(//table[@name='courses']/tbody/tr)[1]/th"));
		 int totalcolumns = columns.size();
		 System.out.println("Total columns are " +totalcolumns);
		 
		 for(int i=1;i<=totalrows;i++)
		 {
		 //inner for loop for columns
		 for(int j=1;j<=totalcolumns;j++)
		 {
		 if(i==1)
		 {
		 String text =

		 driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/th["+j+"]")).getText();

		 System.out.print(text+" ");
		 }
		 else {
		 String text =

		 driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/td["+j+"]")).getText();

		 System.out.print(text+" ");
		 }
		 }

		 System.out.println();
		 }
	}

}
