package practise1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertVerAllMethods {
  @Test //for equals and not equals
  public void equals () {
	   String a="Pune";
	   String b="Nagpur";
	   String c="Pune";
	   String d=null;
	   
	  
	  //Assert.assertEquals(a,b,"value of a and b is not matching");
	//  Assert.assertNotEquals(a, b,"value of a and b is matching");
	 // Assert.assertNotEquals(a, c,"value of a and c is matching");
	  // Assert.assertNotNull(d , "Object is null");
	   Assert.assertNull(d,"Object is not null");
	   Assert.fail();
  }
}
