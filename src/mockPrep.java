import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mockPrep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String gettitle = driver.getTitle();
		System.out.println("This is result of" +gettitle);
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
	
		
		
		
		
		
		
		
		
	}

}
