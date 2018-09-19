package mavenselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicAnnotations {

	@Test
	public void testcase() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A07208trng_b4a.04.28\\Desktop\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://www.google.com");
		
		Thread.sleep(2000);
		driver.close();
	}
}
