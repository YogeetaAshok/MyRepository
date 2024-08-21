package screenshotsss;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class timestamp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        /*Driver flow does now have screenshot
         * (TakesScreenshot)driver();this is casting
         * 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); this will take screenshot
         * 	File myfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);-will store in temp file
         * 
         *
         */
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		File myfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(myfile);
		//String random = RandomString.make(3);
		String datestamp = new SimpleDateFormat("ddmmyyHH").format(new Date());
		File destination=new File("C:\\Users\\yogee\\OneDrive\\Documents\\myscreenshot\\seleniumscreenshit"+datestamp+".png");
		FileHandler.copy(myfile, destination);
		System.out.println(destination);
		
	}
	

}
