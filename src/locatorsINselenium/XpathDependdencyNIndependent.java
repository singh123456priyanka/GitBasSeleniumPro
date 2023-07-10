package locatorsINselenium;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathDependdencyNIndependent {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		ChromeOptions opt= new ChromeOptions();
			opt.addArguments("--disable-notifications"); 
			// this argument allows us to switch on desired address.
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				// for adding the property of chromedriver.exe  
					WebDriver driver= new ChromeDriver(opt);
					// passing the argument through opt
					driver.get("https://www.easemytrip.com/");
						Thread.sleep(4000);
					driver.manage().window().maximize();
					
					Thread.sleep(3000);
					
					driver.findElement(By.xpath("(//a[text()='×'])[1]")).click();
					
				/*	Robot robot = new Robot();
					
					robot.keyPress(KeyEvent.VK_TAB);
					robot.keyPress(KeyEvent.VK_ENTER);
					
					robot.keyRelease(KeyEvent.VK_TAB);
					robot.keyRelease(KeyEvent.VK_ENTER);*/
					WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
					
								
					WebElement destDate =driver.findElement(By.xpath("//div[text()='Apr 2023']/../..//li[@id='fiv_5_28/04/2023' ]"));
							//driver.findElement(By.xpath("//div[@class='month2' and text()='Apr 2023']/../..//li[@id='fiv_5_28/04/2023' ]"));
					
					wait.until(ExpectedConditions.visibilityOf(destDate));
					destDate.click();
					//driver.findElement(By.xpath("//div[text()='Apr 2023']/../..//li[text()='28']")).click() ;
					
					//driver.findElement(By.xpath("//p[@id='rtag']")).click();
					
					//driver.findElement(By.xpath("//div[text()='May 2023']/../..//li[text()='11']")).click();
					//Thread.sleep(8000);
					driver.close();



					 //div[text()='Apr 2023']/../..//li[@id='fiv_2_25/04/2023']
	}

}
