package week5.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test 
  public void a() {
	  System.out.println("Method A");
  }
  @Test (dependsOnMethods = {"c"} )
  public void b() {
	  System.out.println(" Method b");
  }

  @Test (dependsOnMethods = {"a"} )
  public void c() {
	 System.out.println("Method c");
  }

  @Test
  public void d() {
	  System.out.println("Method d");
  }

 
  

  
}
