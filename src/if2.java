import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class if2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(7000);
		driver.switchTo().frame("iframe-name");
		Thread.sleep(7000);
		WebElement myText = driver.findElement(By.xpath("//strong[text()=' Learn Earn & Shine']"));
		String result=myText.getText();
		System.out.println(result);
	}

}
