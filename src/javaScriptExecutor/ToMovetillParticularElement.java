package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToMovetillParticularElement {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.driver.edge","./drivers/msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement newsButton = driver.findElement(By.xpath("//a[@class='selenium-button selenium-white-cyan text-uppercase font-weight-bold']"));
		js.executeScript("arguments[0].scrollIntoView(false);",newsButton);
		
		Thread.sleep(15000);
		driver.quit();
		

	}

}
