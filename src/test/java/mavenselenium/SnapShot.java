package mavenselenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SnapShot {
	
	public static void getScreenshot(WebDriver driver, String filepath) throws IOException {
		
		TakesScreenshot ss=((TakesScreenshot)driver);
		 File src = ss.getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("C:\\Users\\A07208trng_b4a.04.28\\Desktop\\Webdriver");
		 FileUtils.copyDirectory(src, dest);
	}

}
