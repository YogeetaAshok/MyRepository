package practise1;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("start-maximized");
		//options.addArguments("incognito");
		//options.addArguments("headless");
		//If we want to pass multiple arguments--> create an object of List
		ArrayList<String> al= new ArrayList<String>();
	//	al.add("incognito");
		al.add("disable-infobars");
		al.add("disable-notifications");
		al.add("start-maximized");
		
		options.addArguments(al);
		WebDriver driver = new ChromeDriver(options);
		String ver = options.getBrowserVersion();
		System.out.println(ver);
		driver.get("https://www.justdial.com/");
		

		
		
	}

}
