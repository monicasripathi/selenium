package mavenselenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class naukri {
	
	WebDriver driver;
	String browser= "chrome";
	@BeforeMethod
	public void openbrowser() {
		driver=Driver.getdriver(browser);
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
	}
	@Test
	public void testcase() throws InterruptedException {
		String mwid = driver.getWindowHandle();
		
		Set <String> allwindows = driver.getWindowHandles();
		
		for(String x:allwindows) {
			
			if (!x.equals(mwid)) {
				driver.switchTo().window(x);
				driver.close();
			}
		}
	driver.switchTo().window(mwid);
	driver.close();
	}

}
