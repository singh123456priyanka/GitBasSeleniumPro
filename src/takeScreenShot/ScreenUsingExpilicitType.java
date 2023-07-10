package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class ScreenUsingExpilicitType {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.driver.chrome","./drivers/chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("---remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/goog.png");
		Files.copy(src,dest);
	}

	}
