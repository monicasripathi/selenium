package mavenselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebElement {
	WebDriver driver;
	String browser= "chrome";
	@BeforeMethod
	public void openbrowser() {
		driver=Driver.getdriver(browser);
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
	}
	
	@Test
	public void ActionSearch()  throws InterruptedException{
	org.openqa.selenium.WebElement popup= driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		org.openqa.selenium.WebElement Search = driver.findElement(By.name("q"));
		org.openqa.selenium.WebElement click= driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/form/div/div[2]/button"));
		popup.click();
		Search.sendKeys();
		click.click();	
		driver.navigate().back();
		Search.clear();
		Search.sendKeys("watch");
		click.click();
		Thread.sleep(2000);
		
	}

	@AfterMethod
	public void closedriver() {
		driver.close();
	}
}
