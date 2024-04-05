package P03_RunMultiClass_GroupBy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class2 {
	  @Test (groups = "UnitTesting")
	  public void India2() {
		 String s1 ="India";
		 Assert.assertEquals(s1, "India"); }
	  
	  @Test (groups = "SystemTesting")
	  public void StateCount2() {
		 int StateCount =28;
		 Assert.assertEquals(StateCount, 28); }
	  
	  @Test (groups = "Regression")
	  public void Telangana2() {
		 String StateCode ="TG";
		 Assert.assertEquals(StateCode, "TS"); }
	  
}
