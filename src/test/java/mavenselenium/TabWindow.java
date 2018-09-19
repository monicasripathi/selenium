package mavenselenium;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TabWindow {
	WebDriver driver;
	String browser= "chrome";
	@BeforeMethod
	public void openbrowser() {
		driver=Driver.getdriver(browser);
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.licindia.com/");
		}
	@Test
	public void testcase() {
		driver.findElement(By.xpath("//*[@id=\"footpart\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"socialThings2\"]/ul/li[1]/a")).click();
		Set <String> s = driver.getWindowHandles();
		Iterator <String> it = s.iterator();
		String mwid=it.next();
		String t1=it.next();
		driver.switchTo().window(mwid);
		driver.findElement(By.id("email")).sendKeys("wjhfh");
		driver.switchTo().window(t1);
		driver.findElement(By.xpath("//*[@id=\"footpart\"]/ul/li[1]/a")).click();
		System.out.println("Home button found");
		
		
	}
}


