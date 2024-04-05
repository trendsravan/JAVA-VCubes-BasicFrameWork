package P05_RunOnlyFailedTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class2 {
	  @Test
	  public void India() {
		 String s1 ="India";
		 Assert.assertEquals(s1, "India"); }	  
	  @Test
	  public void StateCount() {
		 int StateCount =28;
		 Assert.assertEquals(StateCount, 28); }
	  @Test
	  public void Telangana() {
		 String StateCode ="TG";
		 Assert.assertEquals(StateCode, "TG"); }
	  
}
