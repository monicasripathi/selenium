package mavenselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class Mercury {
	WebDriver driver;
	String browser= "chrome";
	@BeforeMethod
	public void openbrowser() {
		driver=Driver.getdriver(browser);
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
	}
	public void testcase () throws InterruptedException{
		WebElement dropdown= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"));
		
		Select selectbox=new Select(dropdown);
		selectbox.selectByIndex(16);
				Thread.sleep(2000);
		selectbox.selectByValue("217");
		Thread.sleep(2000);
		selectbox.selectByVisibleText("INDIA");
		Thread.sleep(2000);
	
		List<WebElement> option=selectbox.getOptions();
		System.out.println("The number of countries listed is " + option.size());
		for (int i=0;i<=option.size();i++) {
			System.out.println(option.get(i).getText());
		}
		
			List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println(" the number of links are " + links.size());
			for(int j=0;j<links.size();j++) {
				if(!links.get(j).getText().equals(""))
				System.out.println(links.get(j).getText());
				
			}	
		}		
	
		@AfterMethod
		public void closedriver() {
			driver.close();
			
		}
		
	}

