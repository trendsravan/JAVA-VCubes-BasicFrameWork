package P01TestAnnot_Verify_Assert;

import org.testng.annotations.Test;

public class V2_Verify_Ifelse_Chk {
  @Test
  public void Moon() {
	  String s ="moon";
	  if(s.equals("mooN")) {
		  System.out.println("I am in moon");
	  }else
		  System.out.println();
		  }
  @Test
  public void Sun() {
	  String s ="sun";
	  if(s.equalsIgnoreCase("SUN")) {
		  System.out.println("I am in Sun");
	  }
  }
	  
} 
