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

import net.bytebuddy.utility.RandomString;

public class randomstring {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=baba+hanumanji&rlz=1C1ONGR_enIN1105IN1105&oq=baba+hanumanji&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCDMyNjBqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8#vhid=nJTN5-jsPq2GMM&vssid=l");
		File SS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random= RandomString.make(4);
		String datestamp = new SimpleDateFormat("ddMMyyyyy").format(new Date());
		File destination=new File("C:\\Users\\yogee\\OneDrive\\Desktop\\SCREENSHOTS SELENIUM\\babaji"+random+ ".png" +datestamp+ ".png");
		FileHandler.copy(SS, destination);
		
	
	}

}
