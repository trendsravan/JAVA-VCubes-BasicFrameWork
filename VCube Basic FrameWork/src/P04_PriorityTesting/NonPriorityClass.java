package P04_PriorityTesting;
import org.testng.annotations.Test;

public class NonPriorityClass {
  @Test 
  public void Apple() {
	  System.out.println("I am Apple Method-1"); }
  @Test 
  public void banana() {
	  System.out.println("I am Banana Method-2"); } 
  @Test 
  public void Cherries() {
	  System.out.println("I am Cherries Method-3"); }	 	  
  @Test 
  public void dragonFruit() {
	  System.out.println("I am dragonFruit Method-4"); }
  @Test 
  public void Elderberry() {
	  System.out.println("I am Elderberry Method-5"); }
  @Test 
  public void farkleberry() {
	  System.out.println("I am farkleberry Method-6"); }
  @Test 
  public void Grapes() {
	  System.out.println("I am Grapes Method-7"); }
}
//outPut : -
//I am Apple Method-1
//I am Cherries Method-3
//I am Elderberry Method-5
//I am Grapes Method-7
//I am Banana Method-2
//I am dragonFruit Method-4
//I am farkleberry Method-6
