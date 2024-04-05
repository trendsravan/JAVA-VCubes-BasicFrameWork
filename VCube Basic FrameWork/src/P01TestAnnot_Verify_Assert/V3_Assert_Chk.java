package P01TestAnnot_Verify_Assert;
import org.testng.Assert;
import org.testng.annotations.Test;
public class V3_Assert_Chk {
  @Test
  public void Russia() {
	  String name ="Russia";
	  Assert.assertEquals(name, "Russia");
	  System.out.println("Printing Russia");
  }
  @Test
  public void China() {
	  String name ="China";
	  Assert.assertEquals(name, "Chiny");
	  System.out.println("Print China");
  }
}
