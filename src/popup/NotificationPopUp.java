package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotificationPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		// for adding the property of chromedriver.exe  
			WebDriver driver= new EdgeDriver();
			// passing the argument through opt
			driver.get("https://www.easemytrip.com/");
			
			Thread.sleep(8000);
			driver.manage().window().maximize();
			Thread.sleep(6000);
			Robot bot = new Robot();
			bot.keyPress(KeyEvent.VK_TAB);
			bot.keyRelease(KeyEvent.VK_TAB);
			 Thread.sleep(3000);
			 
			 bot.keyPress(KeyEvent.VK_TAB);
				bot.keyRelease(KeyEvent.VK_TAB);
				 Thread.sleep(3000);
				 
				 bot.keyPress(KeyEvent.VK_TAB);
					bot.keyRelease(KeyEvent.VK_TAB);
					 Thread.sleep(3000);

					 bot.keyPress(KeyEvent.VK_ENTER);
					 	bot.keyRelease(KeyEvent.VK_ENTER);
					 		Thread.sleep(3000);

			driver.findElement(By.xpath("(//a[text()='×'])[1]")).click();
			
			Thread.sleep(3000);
			WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			
			
			WebElement destDate =driver.findElement(By.xpath("//div[text()='Apr 2023']/../..//li[@id='fiv_5_28/04/2023' ]"));
					//driver.findElement(By.xpath("//div[@class='month2' and text()='Apr 2023']/../..//li[@id='fiv_5_28/04/2023' ]"));
			
			wait.until(ExpectedConditions.visibilityOf(destDate));
			destDate.click();



	}

}
