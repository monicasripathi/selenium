package mavenselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frame {
	
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
	public void testcase() throws InterruptedException{
		
		driver.findElement(By.xpath("//*[@id=\"get_sign_in\"]")).click();
		org.openqa.selenium.WebElement frameid=driver.findElement(By.id("authiframe"));
		driver.switchTo().frame(frameid);
		driver.findElement(By.id("authMobile")).sendKeys("1345");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"authOverlay\"]/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"gosuggest_inputSrc\"]")).sendKeys("BLR");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
