package Questions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/*
 * Go to IRCTC.co.in
create a function/method which should accept station name as a string parameter from user
when a station  name is passed by user put first 3 characters of string into a input field "From"
you will see the station name drop down
select the station from the dropdown that has been asked by user

 */
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
	    driver.get("https://www.irctc.co.in/nget/train-search");
	    Thread.sleep(10000);
	  //  String Nagpur="NGP";
	  //  String Mumbai="LTT";
	  //  String Pune="PNP";
	    //WebElement input = driver.findElement(By.className("ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted"));
	   WebElement input = driver.findElement(By.xpath("(//input[@role=\"searchbox\"])[1]"));
	   input.sendKeys(Cities("Nagpur"));
	
	}

	public static CharSequence[] Cities( String City)
	{
		String Nagpur="NGP";
		String Mumbai="LTT";
		String Pune="CCH";
		return null;
	}
}
