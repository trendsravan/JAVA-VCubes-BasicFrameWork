package P05_RunOnlyFailedTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class3 {
	  @Test
	  public void Telangana() {
		 String s1 ="Telangana";
		 Assert.assertEquals(s1, "Telangana"); }	  
	  @Test
	  public void DistrictCount() {
		 int DistrictCount =33;
		 Assert.assertEquals(DistrictCount, 33); }
	  @Test
	  public void TSBorders() {
		 int TSBorders =4;
		 Assert.assertEquals(TSBorders, 4); }
	
	
}
