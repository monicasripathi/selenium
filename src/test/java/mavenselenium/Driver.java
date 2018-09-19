package mavenselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Driver {



	public static WebDriver getdriver (String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\A07208trng_b4a.04.28\\Desktop\\driver\\chromedriver.exe");
			return new ChromeDriver();
		}
			else if(browser.equalsIgnoreCase("mozilla")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\A07208trng_b4a.04.28\\Desktop\\driver\\geckodriver.exe");
				return new FirefoxDriver();
			}
			else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "C:\\Users\\A07208trng_b4a.04.28\\Desktop\\driver\\IEDriverServer.exe");
			}
			else {
				System.out.println("Browser name invalid");
			}
		return null;
		}
	}
		
	
	