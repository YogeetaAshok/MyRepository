package practise1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVerSoftAssert {
  @Test
  public void f() {
	  
	  String a="Yogeeta";
	  String b="Yo";
	  
	  SoftAssert soft=new SoftAssert();
	  soft.assertNotEquals(a, b, "The value are  matching,TC failed");
	  //soft.assertEquals(a, b, "The value are not matching,TC failed");
	
	  soft.assertAll();
  }
  @Test
 public void f1() {
	 boolean x = true;
	 SoftAssert soft = new SoftAssert();
	 soft.assertFalse(x, "x is true, TC failed");
	 soft.assertAll();
  }
}
