package actionClassMethos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethodUse {

	public static void main(String[] args) throws InterruptedException  {
		
		System.getProperty("webdriver.driver.chrome","./drivers/chrome.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("---remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("http://omayo.blogspot.com/2013/05/page-one.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		
		
		WebElement textDouble = driver.findElement(By.xpath( "//p[text()='Double-click']" ));
		
		Actions act=new Actions(driver);
		act.doubleClick(textDouble).perform();
		
		 driver.findElement(By.linkText("Flipkart")).click();
		
		 WebElement txt = driver.findElement(By.xpath("//input[@type='text' and @class='_2IX_2- VJZDxU'] " ) );
		txt.sendKeys("bvh");
		txt.submit();
		Thread.sleep(3000);
		driver.navigate().back(); 
		
		
		WebElement dblclk = driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
		
		//Actions acti= new Actions(driver);
		act.doubleClick(dblclk).perform();
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
		//Thread.sleep(2000);

		//driver.close();
		
		
		
		
		
			
	}

}
