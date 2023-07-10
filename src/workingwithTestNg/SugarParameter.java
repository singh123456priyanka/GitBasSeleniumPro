package workingwithTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SugarParameter {
		
	
	@Test
	@Parameters("lipsticName")
	
	 public void lipstickTest(String lname) throws InterruptedException
		{
		 
			System.out.println(lname);
			System.setProperty("webdriver.driver.chrome", "./driver/chrome.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://in.sugarcosmetics.com/collections/lips");
			driver.manage().window().maximize();
			
			
			WebElement cframe = driver.findElement(By.xpath("//iframe[@name='webpush-onsite']"));
			driver.switchTo().frame(cframe);
			Thread.sleep(1000);

			WebElement ele = driver.findElement(By.id("deny"));	
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.click();
			
			Reporter.log("It has been Clicked",true );
			Thread.sleep(6000);
			driver.quit();

			
		}	

	}



