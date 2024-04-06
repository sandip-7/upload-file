package Automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FIrstTestng {
  @Test
  public void f() {
	  System.out.println("This is test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is runned first");
}

  @AfterTest
  public void afterTest() {
	  System.out.println("This is runn after test");
  }

}
