package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SubmitMethodExample {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().fullscreen();
		
		driver.findElement(By.id("email")).sendKeys("pankajandpriyanka@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pankaji12345677777778") ;
		//driver.findElement(By.name("login")).click();// or instead we can use submit
		
		driver.findElement(By.id("pass")).submit() ;

		Thread.sleep(6000);
		
		driver.close();
		
		
	}

}
