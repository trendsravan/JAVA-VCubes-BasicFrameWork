package P01_TestAnnot_Verify_Assert;

import org.testng.annotations.Test;

public class V1_TestAnnotation_Chk {
  @Test
  public void TestCase1() {
	  System.out.println("In first Test Case");	  
  }
  @Test
  public void TestCase2() {
	  System.out.println("In Second Test Case");
  }
  
  //If @test is not present it will not consider that method as test case
  public void TestCase3() {
	  System.out.println("In third test case");
  }
}
