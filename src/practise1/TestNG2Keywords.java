package practise1;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2Keywords {
  @Test
	
		@BeforeMethod
		public void e()
		{
			Reporter.log("e is method for @BeforTest Annotation",true);
		}
		
    
  		@Test (invocationCount=3,dependsOnMethods = "g" )//enabled=false,//priority=2
  		public void f() {
  		Reporter.log("My name is 1",true);
  		}
  		
  		
		@Test
		public void g() {
			Reporter.log("My name is 2",true);
		}
		
		@Test()//priority=-1
		public void h() {
			Reporter.log("My name is 3",true);
		}
		
		
		@AfterMethod
			public void j()
			{
				Reporter.log("j is method for @After Annotation",true);
			}
		
		}
