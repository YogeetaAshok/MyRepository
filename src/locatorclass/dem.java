package locatorclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Dev");
		driver.findElement(By.name("lastname")).sendKeys("Trivedi Chalpe");
		driver.findElement(By.name("reg_email__")).sendKeys("9082976613");
		driver.findElement(By.name("reg_passwd__")).sendKeys("I_love_Chalpe");
		WebElement date = driver.findElement(By.id("day"));
		Select d=new Select(date);
		d.selectByValue("17");
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("10");
		
		WebElement year = driver.findElement(By.id("year"));
		Select y=new Select(year);
		y.selectByValue("1994");
		
		driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
		driver.navigate().to("https://www.google.com/search?q=But+kya+karu+baby+signup+karke&rlz=1C1ONGR_enIN1105IN1105&oq=But+kya+karu+baby+signup+karke&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCjEwNzUxajBqMTWoAgCwAgA&sourceid=chrome&ie=UTF-8");
		driver.navigate().to("https://www.google.com/search?sca_esv=3934d71341ac1ffa&rlz=1C1ONGR_enIN1105IN1105&q=I+toh+love+you&udm=2&fbs=AEQNm0CFDpRHaDHkXm_YXueHTfHtrgIXUKlluACpCix4T5ZoUSz6e3GWv4zN_09JkP2cR-DwqD-ER1CSuTjXzdXNKT0Wma9mNyum3oWLzhs1xt8u5GJdCx58_F0ZS8HPQnKQz9WgsdJpThHV1BWzodOO8E_BatEjT0dIL3U5ECu78v7bqTooU6tI88M-Qrvjqh0VwmagWSscc3JaO_0BmvDToqXs55uEqQ&sa=X&ved=2ahUKEwjtm7fnyPGGAxWRwjgGHUn1CrUQtKgLegQIFBAB&biw=1280&bih=533&dpr=1.5#vhid=AmDRZA0PIvX9_M&vssid=mosaic");
		
		
		
		
		

	}

}
