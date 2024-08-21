import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		//switch to frame
		driver.switchTo().frame("frame1");
		String parent = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println(parent);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		String child = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println(child);
		driver.switchTo().parentFrame();
		String parentback = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println(parentback);
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	    String text = driver.findElement(By.className("text-center")).getText();
	    System.out.println(text);
	
	}

}
