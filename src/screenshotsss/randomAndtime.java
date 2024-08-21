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

public class randomAndtime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(4);
		File destination=new File("C:\\Users\\yogee\\OneDrive\\Desktop\\SCREENSHOTS SELENIUM\\"+random+".png");
		FileHandler.copy(source, destination);
		System.out.println(destination);
		*/
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		String dateStamp= new SimpleDateFormat("YYYMMddHHmmss").format(new Date());
		File sou = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\yogee\\OneDrive\\Desktop\\SCREENSHOTS SELENIUM\\"+dateStamp+".png");
		FileHandler.copy(sou, des);
		System.out.println(des);
		
		
		
	}

}
