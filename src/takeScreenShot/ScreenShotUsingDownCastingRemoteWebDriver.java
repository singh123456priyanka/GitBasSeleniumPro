package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ScreenShotUsingDownCastingRemoteWebDriver {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.driver.chrome","./drivers/chromedriver.exe");
		/*ChromeOptions opt= new ChromeOptions();
		opt.addArguments("---remote-allow-origins=*");*/
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebDriverWait wt= new WebDriverWait(driver,Duration.ofMillis(3000));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username' and @class='_aa4b _add6 _ac4d']")));
		
		RemoteWebDriver rm = (RemoteWebDriver) driver;
		File src = rm.getScreenshotAs(OutputType.FILE);
		File dest= new File("./screenshot/insta.png");
		
		Files.copy(src, dest );
		
	}

}
