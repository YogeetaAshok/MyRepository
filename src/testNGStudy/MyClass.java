package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass {
  @Test
  public void f() {
	  
	  System.out.println("HI GM");//Only in console and not in the report
	  Reporter.log("Yogeeta");//Only in report not in console
	  Reporter.log("Dev", true);//Both in report and in console
	  Reporter.log("Chalpe", false);//Only in report not in console
  }
  
  @Test
  public void f1() {
	  
	  System.out.println("Good");
  }
  
  @Test
  public void f2() {
	  
	  System.out.println("Morning");
  }
  
  
  
  
}
