package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleDoodleForLoop {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.driver.edge","./drivers/msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com/doodles");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for(;;)
		{
			try
			{
				  driver.findElement(By.xpath("(//div[@class='thumb-image'])[61]")).click();
			}
			catch(NoSuchElementException e)
			{
				js.executeScript("window.scrollBy(0,1000);");
			}
		}
		
	}

	}


