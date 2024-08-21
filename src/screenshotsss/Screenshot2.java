package screenshotsss;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		File myfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(myfile);
		File destination=new File("C:\\Users\\yogee\\OneDrive\\Desktop\\SCREENSHOTS SELENIUM\\myfirstss.png");
		FileHandler.copy(myfile, destination);
		System.out.println(destination);
	}

}
