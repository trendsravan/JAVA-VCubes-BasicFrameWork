package P03RunMultiClass_GroupBy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class1 {
  @Test (groups = "UnitTesting")
  public void Countries1() {
	 int  ConutriesCount =195;
	 Assert.assertEquals(ConutriesCount, 195); }	
  
  @Test (groups = "SystemTesting")
  public void India1() {
	 String ConutryName ="India";
	 Assert.assertEquals(ConutryName, "Bharath"); }
  
  @Test (groups = "Regression")
  public void BorderWith1() {
	 int BorderWith =9;
	 Assert.assertEquals(BorderWith, 9); }
  
}
