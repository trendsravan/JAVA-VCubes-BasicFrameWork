package P04_PriorityTesting;
import org.testng.annotations.Test;

public class PriorityClass2 {
  @Test (priority = 1)
  public void Apple() {
	  System.out.println("I am Apple Method-1"); }
  @Test (priority = 2)
  public void banana() {
	  System.out.println("I am Banana Method-2"); } 
  @Test (priority =3)
  public void Cherries() {
	  System.out.println("I am Cherries Method-3"); }	 	  
  @Test (priority =4)
  public void dragonFruit() {
	  System.out.println("I am dragFruit Method-4"); }
  @Test (priority =5)
  public void Elderberry() {
	  System.out.println("I am Elderberry Method-5"); }
  @Test (priority =6)
  public void farkleberry() {
	  System.out.println("I am farkleberry Method-6"); }
  @Test (priority =7)
  public void Grapes() {
	  System.out.println("I am GrapesFruit  Method-7"); }
}
