package practise1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']//tr"));
		int totalRows = rows.size();
		System.out.println(totalRows);
		List<WebElement> columns = driver.findElements(By.xpath("(//table//tbody/tr)[1]//th"));
		int totalColumns = columns.size();
		System.out.println(totalColumns);
		
		
		//to read the table
		
		WebElement contents = driver.findElement(By.xpath("//table[@name='courses']//tr[5]/td[1]"));
		 String datas = contents.getText();
		 System.out.println(datas);
		
		
		
		 //how to read perticular row from table
		for(int i=1;i<=totalColumns;i++)
		{
		 WebElement content = driver.findElement(By.xpath("//table[@name='courses']//tr[5]/td["+i+"]"));
		 String data = content.getText();
		 System.out.println(data);
		}
		
	
		//how to read perticular column from table
		for(int i=2;i<=totalRows;i++)
		{
		 WebElement content1 = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/td[3]"));
		 String data1 = content1.getText();
		 System.out.println(data1);
		}
	    System.out.println("==========================================================================");
	
	    //reading table
	    //header seperately
	    
		for(int i=1;i<=totalColumns;i++)
		{
	   WebElement header = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[1]/th["+i+"]"));
	    String headerData = header.getText();
	    System.out.print(headerData+" ");
		}
		System.out.println();
		
//		
		for(int i=2;i<=totalRows;i++)
		{
			for(int j=1;j<=totalColumns;j++)
			{
			String textdata = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print(textdata+" ");
			
			}
			System.out.println();
			
		}
		
		
		
		
				
	}
}

	
