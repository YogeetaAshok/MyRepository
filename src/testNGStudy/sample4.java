package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample4 {
  @Test(groups ={"sanity"})
  public void e() {
	 
	  Reporter.log("This is e", true);
  }
  
  @Test(groups ={"sanity"})
  public void f() {
	  
	  Reporter.log("This is f", true);
  }
  
  @Test(groups ={"regression"})
  public void g() {
	  
	  Reporter.log("This is g", true);
  }
  
  @Test
  public void h() {
	  
	  Reporter.log("This is h", true);
  }
  
  
}
