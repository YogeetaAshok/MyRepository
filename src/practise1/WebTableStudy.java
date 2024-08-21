package practise1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		int totalNumberOfRows = rows.size();
		System.out.println("Total number of Rows are " +totalNumberOfRows);
		List<WebElement> columns = driver.findElements(By.xpath("(//table/tbody/tr)[1]//th"));
		int totalColumns = columns.size();
		System.out.println("Total number of columns are " +totalColumns);
		//how to read perticular row from table
		//table[@name='courses']//tr[5]/td[1]
		//table[@name='courses']//tr[5]/td[2]
		//table[@name='courses']//tr[5]/td[3]
		
		for(int i=1; i<=totalColumns;i++)
		{
		WebElement content = driver.findElement(By.xpath("//table[@name='courses']//tr[5]/td["+i+"]"));
		String data = content.getText();
		System.out.println(data);
		}
		
		
		
	}

}
