package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myttile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		Thread.sleep(1000);

		String myTitle = driver.getTitle();
		System.out.println(myTitle);
			
		String myurl = driver.getCurrentUrl();
		System.out.println(myurl);
	}

}
