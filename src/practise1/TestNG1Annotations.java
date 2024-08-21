package practise1;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class TestNG1Annotations {

	/*@BeforeMethod
	public void Yogeeta() {
		Reporter.log("Yogeeta is method for @BeforTest Annotation", true);
	}
	*/

	@Test(groups= {"Parent"},priority=1)
	public void Ashok() {
		Reporter.log("My name is Ashok-Test1", true);
	}

	@Test(groups= {"Parent"},priority=2)
	public void Usha() {
		Reporter.log("My name is Usha-Test2", true);
	}
	
	@Test(groups= {"Son"},priority=3)
	public void Vicky() {
		Reporter.log("My name is Vicky-Test3", true);
	}

	@Test(priority=4)
	public void Swetta() {
		Reporter.log("My name is Swetta-Test4", true);
	}
	
	@Test(groups= {"Son"},priority=5)
	public void Aahan() {
		Reporter.log("My name is Aahan-Test5", true);
	}
	
	

/*	@AfterMethod
	public void Family() {
		Reporter.log("Family is method for @After Annotation", true);
	}
*/
}
