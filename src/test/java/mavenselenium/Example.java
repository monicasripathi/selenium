package mavenselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example {
WebDriver driver;
String browser= "chrome";
@BeforeMethod
public void openbrowser() {
	driver=Driver.getdriver(browser);
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.google.com");
}
@Test
public void test() {
	System.out.println("this is test");
}
@AfterMethod
public void closebrowser() {
	driver.close();
}
}
