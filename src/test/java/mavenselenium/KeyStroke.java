package mavenselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

public class KeyStroke {

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
	public void typekeys() throws InterruptedException, AWTException {
		
		Actions mouse = new Actions(driver);
		WebElement city = driver.findElement(By.xpath("//*[@id=\"gosuggest_inputSrc\"]"));
		//WebElement dest = driver.findElement(By.xpath("//*[@id=\"gosuggest_inputDest\"]"));
		WebElement support = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/span/a/small/span"));
		
		mouse.moveToElement(city).click().keyDown(city,Keys.SHIFT).sendKeys(city,"moni").doubleClick().keyDown(city,Keys.CONTROL).sendKeys("C").keyUp(city,Keys.SHIFT).keyUp(city,Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		//mouse.moveToElement(dest).click().keyDown(dest,Keys.CONTROL).sendKeys("v").build().perform();
		mouse.moveToElement(support).contextClick().perform();
		Robot win = new Robot();
		win.keyPress(KeyEvent.VK_DOWN);
		win.keyPress(KeyEvent.VK_DOWN);
		win.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(2000);	
}
}
