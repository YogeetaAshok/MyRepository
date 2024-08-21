import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		//switch to frame
		driver.switchTo().frame("iframeResult");
	    driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date and Time.')]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("menuButton")).click();
		
		
		
		
	}

}
