package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample3 {
  @Test(groups ={"sanity"})
  public void a() {
	 
	  Reporter.log("This is a", true);
  }
  
  @Test(groups ={"sanity"})
  public void b() {
	  
	  Reporter.log("This is b", true);
  }
  
  @Test(groups ={"regression"})
  public void c() {
	  
	  Reporter.log("This is c", true);
  }
  
  @Test(groups ={"regression"})
  public void d() {
	  
	  Reporter.log("This is d", true);
  }
  
  
}
