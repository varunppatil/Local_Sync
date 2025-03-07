package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class Day2 {

	WebDriver driver;

	@BeforeClass
	public void BeforeTest() {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}

	/*
	 * @BeforeSuite
	 * 
	 * public void BeforeSuite() { System.setProperty("webdriver.edge.driver",
	 * "C:\\Users\\HP\\Documents\\msedgedriver.exe");
	 * System.out.println("Before Suite"); driver=new EdgeDriver(); }
	 */
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");
	}

	@Test
	public void Day2() {
		System.out.println("Varun");
	}

	@Test(priority = 1)
	public void Day1() {
		System.out.println("Patil");
	}

	@BeforeTest
	public void prerequisite() {
		System.out.println("BeforeTest");
	}

	@Parameters({ "URL" })
	@BeforeMethod
	public void beforeMethod(String url) {
		System.out.println(url);
	}

	@AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
}
