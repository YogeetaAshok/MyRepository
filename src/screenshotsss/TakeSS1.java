package screenshotsss;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeSS1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=yogeeta+chalpe&rlz=1C1ONGR_enIN1105IN1105&oq=Yog&gs_lcrp=EgZjaHJvbWUqBggBECMYJzIGCAAQRRg5MgYIARAjGCcyDAgCECMYJxiABBiKBTIMCAMQABhDGIAEGIoFMg8IBBAAGEMYsQMYgAQYigUyCggFEC4YsQMYgAQyBggGEEUYPTIGCAcQRRhB0gEINjk3N2owajeoAgCwAgA&sourceid=chrome&ie=UTF-8");
		File myfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\yogee\\OneDrive\\Desktop\\SCREENSHOTS SELENIUM\\1.png");
		FileHandler.copy(myfile, destination);
	
	}

}
