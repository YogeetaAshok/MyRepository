package locatorclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class today2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@class='radioButton'])[1]")).click();//xpath by attribute with index
		WebElement text = driver.findElement(By.xpath("//h1[text()='Practice Page']"));//xpath by text
		System.out.println(text.getText());
		driver.findElement(By.xpath("(//input[contains(@class,'radio')])[2]")).click();//xpath by contains attribute
		WebElement text2 = driver.findElement(By.xpath("//h1[contains(text(),'Practice Page')]"));//xpath by text
		System.out.println("this is contains vala " +text2.getText());//xpath by contains text
		
		driver.findElement(By.xpath("/html/body/header/div/a")).click();//xpath by absolute path
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		WebElement abs = driver.findElement(By.xpath("/html/body/div/div/fieldset/legend"));
		System.out.println(abs.getText());
		
		driver.findElement(By.xpath("//div//button[2]")).click();//xpath by relative path
		
		driver.findElement(By.cssSelector("input#autocomplete")).click();//cssSelecter tag#id
		driver.findElement(By.cssSelector("input.radioButton")).click();//cssSelecter tag.class
		driver.findElement(By.cssSelector("input[value='radio3']")).click();//cssS electer tag[attribute=value]
		//driver.findElement(By.cssSelector("a.btn-style[id='opentab']")).click();//cssSelecter tag.class[attribute=value]
		//WebElement opentab = driver.findElement(By.className("btn-style"));//locator by classname
		//opentab.click();
		//driver.findElement(By.linkText("Open Window")).click();  //locator by linked text
		//driver.findElement(By.partialLinkText("Open ")).click();//locator by partial text
		driver.findElement(By.name("radioButton")).click();
		
		//webelement methods
		
		driver.navigate().to("https://www.facebook.com/signup");
		driver.findElement(By.name("reg_email__")).sendKeys("yogeechalpe21@gmail.com");
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement chec = driver.findElement(By.xpath("//button[text()='Signup']"));
		System.out.println(chec.isEnabled());//isenabled method
		
		driver.navigate().to("https://en-gb.facebook.com/");
		String teeeext = driver.findElement(By.linkText("Forgotten password?")).getText();
		System.out.println(teeeext);//get text method
		driver.navigate().to("https://www.instagram.com/");
		boolean login = driver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']")).isEnabled();
		System.out.println(login);
		
		if (login)
		{
			System.out.println("It is enable");
		}
		else
		{
			System.out.println("It is disable");
		}
		
		driver.navigate().to("https://www.facebook.com/signup");
		boolean cc = driver.findElement(By.className("_8esa")).isSelected();
		System.out.println(cc);//isselected method
		if(cc)
		{
			System.out.println("it is selected");
		}
		else
		{
			System.out.println("Is is not selected");
		}
		
		driver.findElement(By.className("_8esa")).click(); 
		boolean kk = driver.findElement(By.className("_8esa")).isSelected();
		System.out.println(kk);
		
		if(kk)
		{
			System.out.println("it is selected");
		}
		else
		{
			System.out.println("Is is not selected");
		}
		
		
		
		
		
		
		
		
		
	}

}
