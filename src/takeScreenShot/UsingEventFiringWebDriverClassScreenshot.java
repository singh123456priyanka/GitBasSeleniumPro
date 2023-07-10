package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class UsingEventFiringWebDriverClassScreenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.driver.chrome","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Request OTP']")));
		
		EventFiringWebDriver eventf=new EventFiringWebDriver(driver); //depricated means old 
		File src = eventf.getScreenshotAs(OutputType.FILE);
		File dest= new File("./screenshot/flipkart.png");
		Files.copy(src, dest);
		
		

	}

}
