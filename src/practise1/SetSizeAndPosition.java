package practise1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeAndPosition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Dimension defaultsize = driver.manage().window().getSize();
		System.out.println("Default size is" +defaultsize);
		Dimension d=new Dimension(1200,700);
		driver.manage().window().setSize(d);
		Dimension newsize = driver.manage().window().getSize();
		System.out.println("New size is" +newsize);
		
		Point defaultPosition = driver.manage().window().getPosition();
		System.out.println("Default position is "+defaultPosition);
		Point p=new Point(50,50);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p);
		Point newPosition = driver.manage().window().getPosition();
		System.out.println("New postion is"+newPosition);
		
		
		
		
		
		
	}

}
