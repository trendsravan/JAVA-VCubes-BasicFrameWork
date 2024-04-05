package P05_RunOnlyFailedTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class1 {
  @Test
  public void Countries() {
	 int  ConutriesCount =195;
	 Assert.assertEquals(ConutriesCount, 195); }	  
  @Test
  public void India() {
	 String ConutryName ="India";
	 Assert.assertEquals(ConutryName, "India"); }
  @Test
  public void BorderWith() {
	 int BorderWith =9;
	 Assert.assertEquals(BorderWith, 9); }
  
}
