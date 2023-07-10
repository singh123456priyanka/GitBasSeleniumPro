package javaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Assignment1UsingScrollbar {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.driver.edge", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com/doodles");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,2000)");
		
		Thread.sleep(3000);

		js.executeScript( "window.scrollBy(0,7000)");
		
		Thread.sleep(3000);
		js.executeScript( "window.scrollBy(0,6000)");
		
		Thread.sleep(4000);

		js.executeScript("window.scrollBy(0,10000)");
		
		Thread.sleep(4000);

		js.executeScript("window.scrollBy(0,6000)");
		
		Thread.sleep(4000);
		
		js.executeScript("window.scrollBy(0,6000)");

		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,6000)");
		
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,20000)");
		
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,6000)");
		
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,20000)");
		
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,20000)");
		
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,30000)");
		
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,20000)");
		
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,30000)");
		
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,30000)");
		
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-1000)");
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)");
		
		//driver.manage().window().;
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(200,0)");
		
		Thread.sleep(2000);
		
		WebElement img = driver.findElement(By.xpath("(//a[@href=\"/doodles/national-voter-registration-day-2022\"])[1]"));
		wait.until(ExpectedConditions.visibilityOf(img));
		File src = img.getScreenshotAs(OutputType.FILE);
		File dest= new File("./screenshot/nationalVoter.png");
		Files.copy(src, dest);
	
		

		
		
		
	}

}
