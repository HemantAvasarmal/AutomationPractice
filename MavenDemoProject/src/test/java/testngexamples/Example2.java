package testngexamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example2 {
  @Test(invocationCount=3)
  public void testcase1() {
	  System.out.println("I am test case1");
  }
  @AfterTest
  public void testcase4() {
	  System.out.println("hi i am test case 4");
  }
  @BeforeTest(timeOut=2000)
  public void testcase2() throws InterruptedException {
	  System.out.println("Hi i am test case 2");
	  Thread.sleep(3000);
  }
  @Test
  public void testcase3() {
	  System.out.println("Hi i am test case 3");
  }
}
