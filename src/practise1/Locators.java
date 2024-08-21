package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5j0bx521tf_e&adgrpid=150668181581&hvpone=&hvptwo=&hvadid=674842289449&hvpos=&hvnetw=g&hvrand=14372709766455699905&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302738&hvtargid=kwd-10544572015&hydadcr=5621_2359492&gad_source=1");
		driver.manage().window().maximize();
		String attri = driver.findElement(By.xpath("//span[@class='a-color-base']")).getText();
		System.out.println(attri);//xpath by attribute
		String text = driver.findElement(By.xpath("//h2[text()='Revamp your home in style']")).getText();
		System.out.println(text);//xpath by text
		String containstext = driver.findElement(By.xpath("//h2[contains(text(),'Revamp your')]")).getText();
		System.out.println(containstext);//xpath by contains text
		String containsattri = driver.findElement(By.xpath("//span[contains(@class,'a-colo')]")).getText();
		System.out.println(containsattri);//xpath by contains attribute
		String index = driver.findElement(By.xpath("(//span[contains(@class,'a-colo')])[19]")).getText();
		System.out.println(index);//xpath by index
		System.out.println("-------------------------------------------");
	

	}

}
