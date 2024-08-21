package practise1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AssertDataProviderclass {
	

	
  
	 @DataProvider(name="Girls")
	public String[][] myData() {
	  
	 
	 String data [][]= {{"Yogee","Chalpe","891"},
						  {"Deepee","Chalpe","892"},
						  {"Suru","Bhadang","892"}
						  };
	  return data;}
	  
	  @DataProvider(name="Boys")
		public String[][] myData1() {
		  
		 
		 String data [][]= {{"Dev","Trivedi","891"},
							  {"Alok","Adhao","892"},
							  {"Ravindra","Chalpe","892"}};
		  return data;}
	 
		
	
	 
  }

