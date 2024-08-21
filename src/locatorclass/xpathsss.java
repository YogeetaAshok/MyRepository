package locatorclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathsss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		//*****Webdriver methods-It is an interface use to perform action of browser********************
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		String c = driver.getTitle();
		System.out.println("Title is" +c);
		System.out.println(driver.getCurrentUrl());
		String currenturl = driver.getCurrentUrl();
		System.out.println("Current URL is" +currenturl);
		
		/*    ******Locators are used to identify an element present in a webpage with the help of locator types.
		    driver.findElement(By.xpath(“xpath_expression”)).sendkeys(“abc”);*************
		    
		    */
	//	1.	xpath by attribute
		//tagname[@attribute name='attribute value']
		driver.findElement(By.xpath("//tagname=[@id='bc']"));
    //  a.	xpath by text
		//tagname[text()='textvalue'];
		driver.findElement(By.xpath( "//tagname[text()='text value']"));
	//  2.	xpath by contains()-I.	Contains with text() :, 2.	Contains with attribute() :
		//a.Contains with text() : //tagname[contains(text(),’textvalue’)]
		driver.findElement(By.xpath("//tagname[contains(text(),'text value')]"));
		//b.Contains with attribute :-//tagname[contains(@attribute name, ‘attribute value’)]
		driver.findElement(By.xpath("//tagname[contains(@attribute name,'attribute value')]"));
		
	// 3.	xpath by index-(//tagname[@attribute name = ‘attribute value’] )[2]
		//a.By Attribute-(//tagname [@attribute name='attribute value'])[index number]
		driver.findElement(By.xpath("(//tagname[@attributename='attribute value'])[2]"));
		//b.By contains attribute-(//input[contains(@attributename,'attributevalue')])[indexnumber]
		driver.findElement(By.xpath("(//tagname[contains(@attributename,'attributevalue')])[3]"));
		//c.By Text-(//tagname[text()='textvalue'])[index number]
		driver.findElement(By.xpath("(//tagname[text()='text value'])[3]"));
		//d.By contains Text-(//tagname[contains(text(),'textvalue'])[Index number]
		driver.findElement(By.xpath("(//tagname[text(),'text value'])[]6]"));
		
	//4.	Absolute eg  html/body/div[2]/input[1] and Relative xpath eg.//div[2]/input[1]
		
		
	//************CSS SELECTOR******************
		/*
		 * Tag and ID---->Css=tag#id---->css=input#email
		 * Tag and Class---->css=tag.class---->css=input.inputtext
		 * Tag and Attribute---->css=tag[attribute=value]---->css=input[name=lastName]
		 * Tag, Class, and Attribute---->css=tag.class[attribute=value]---->css=input.inputtext[tabindex=1]
		 */
		
		//************Handling dynamic values*************
		/*Using Partial Matching://input[contains(@id, 'dynamicPart')]
		 * Using text() and ancestor Relationships://label[text()='Dynamic Text']/following-sibling::input
		 * Using following and preceding Axes://div[@class='dynamicDiv']/following::input
		 *Combining Multiple Attributes://input[@id='staticID' and @class='dynamicClass']
		 *Parent-Child Relationship://div[@class='parentDiv']//input[@class='dynamicClass']
		 *Using position() Function:(//button[@class='dynamicClass'])[2]
		 *Using Indexed Position://div[@class='dynamicContainer']/input[3]
		 *Using descendant Axis:	//div[@class='parentDiv']//descendant::input[@class='dynamicClass']







		 */
		
		
		
		
		
				

		
			
		
		
	}

}
