package ChromeOptions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Chromeoptions {

	public static void main(String[] args) throws InterruptedException, IOException  {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		//options.addArguments("start-maximized");
     	//options.addArguments("incognito");
		options.addArguments("headless");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.goo	gle.co.in/");
		driver.findElement(By.name("q")).sendKeys("velocity");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\yogee\\OneDrive\\Desktop\\SCREENSHOTS SELENIUM\\mysecond.png");
		FileHandler.copy(src, dest);
		
		

		
		
	}

}
