package BasePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;




public class Base {
	static protected WebDriver driver;
	public void OpenBrowser()
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		
	}
	
	public void closeBrowser()
	{
		Reporter.log("closing browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		driver.close();
	}
}
