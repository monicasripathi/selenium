package mavenselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mouse {
	WebDriver driver;
	String browser= "chrome";
	@BeforeMethod
	public void openbrowser() {
		driver=Driver.getdriver(browser);
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.drikpanchang.com");
	}
	@Test
	public void testcase() throws InterruptedException {
		WebElement panchang = driver.findElement(By.xpath("//*[@id=\"dpMenuId\"]/li[3]/a"));
		
		Actions mouse = new Actions(driver);
		mouse.moveToElement(panchang).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"dpMenuId\"]/li[3]/div[2]/div[2]/a[4]")).click();
		Thread.sleep(2000);
		
	}
	
}

