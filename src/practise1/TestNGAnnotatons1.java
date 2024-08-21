package practise1;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotatons1 {

	@Test//will show in report not in console
	public void a()
	{
		Reporter.log("a is method for @ test Annotation");;
	}
	
	@Test//shown in both report and console
	public void b()
	{
		Reporter.log("b is method for @ test Annotation2 showing both in report and console",true);
	}
	
	@Test//Will be shown in report but not in console
	public void e()
	{
		Reporter.log("e is method for @ test Annotation3 showing  in report and not in console",false);
	}
	
	@Test//Will be shown in console but not in report
	public void f()
	{
		System.out.println("f is method for @ test Annotation4 not showing in report but in console");
	}
	
	@BeforeMethod
	public void c()
	{
		Reporter.log("c is method for @BeforTest Annotation");
	}
	
	@AfterMethod
	public void d()
	{
		Reporter.log("d is method for @AfterTest Annotation");
	}
	
	
}
