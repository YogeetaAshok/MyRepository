package ChromeOptions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class multipleargs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		ArrayList<String> al=new ArrayList<String>();
		al.add("start-maximized");
		al.add("incognito");
		al.add("disable-infobars");
		
		
		opt.addArguments(al);
		
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.justdial.com/");
		Thread.sleep(2000);
	}

}
