package mavenselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class Alert {
	WebDriver driver;
	String browser= "chrome";
	@BeforeMethod
	public void openbrowser() {
		driver=Driver.getdriver(browser);
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.rediff.com");
	}
	public void testcase() throws InterruptedException {
		driver.findElement(By.name("proceed")).click();
		org.openqa.selenium.Alert a= driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		Thread.sleep(2000);
		driver.findElement(By.id("loginkey")).sendKeys("monica");
		driver.findElement(By.name("proceed")).click();
		
	}
}

