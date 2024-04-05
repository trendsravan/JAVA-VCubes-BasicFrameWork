package P03_RunMultiClass_GroupBy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class3 {
	  @Test (groups = "UnitTesting")
	  public void Telangana3() {
		 String s1 ="Telangana";
		 Assert.assertEquals(s1, "Telangana"); }
	  
	  @Test (groups = "SystemTesting")
	  public void DistrictCount3() {
		 int DistrictCount =33;
		 Assert.assertEquals(DistrictCount, 33); }
	  
	  @Test (groups = "Regression")
	  public void TSBorders3() {
		 int TSBorders =4;
		 Assert.assertEquals(TSBorders, 4); }
	
	
}
