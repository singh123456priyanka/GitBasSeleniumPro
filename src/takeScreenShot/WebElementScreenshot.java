package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.driver.chrome","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(2000));
		
		WebElement img = driver.findElement(By.xpath("//img[@id=\"hplogo\" and @class=\"lnXdpd\"]"));
		wait.until(ExpectedConditions.visibilityOf(img)) ;
		File src = img.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/googlelogo.png");
		Files.copy(src, dest);
		
		WebElement imge = driver.findElement(By.xpath(" //textarea[@class='gLFyf\' and@id='APjFqb\']"));
		imge.sendKeys("123456");
		File src1 = imge.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./screenshot/googlesearch.png");
		Files.copy(src1, dest1);

		


	}

}
