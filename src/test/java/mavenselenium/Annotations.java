package mavenselenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
@BeforeSuite
	public void suitstart() {
		
		System.out.println("Suit starts");
	}
	@AfterSuite
	public void suitend() {
		System.out.println("Suit Ends");
	}
	@BeforeClass
	public void serverstart() {
		System.out.println("class");
	}
	@AfterClass
	public void closeserver() {
		System.out.println("closing");
	}
	
	@BeforeTest
	public void Teststart() {
		System.out.println("starting");
	}
	@AfterTest
	public void Testends() {
		System.out.println("closing");
	}
	
	@Test
	
	public void first() {
		
	System.out.println("first");
	}
	
	@Test
	
	public void second() {
		
	System.out.println("second");
	}
	
	@BeforeMethod
	public void openbroswer() {
		System.out.println("open");
		}
	
	@AfterMethod
	public void closebroswer() {
				System.out.println("close");
	}
}
