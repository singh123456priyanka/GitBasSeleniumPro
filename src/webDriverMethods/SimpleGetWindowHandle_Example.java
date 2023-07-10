package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SimpleGetWindowHandle_Example {
	
	public static void main(String[] args) throws InterruptedException {
		
	

		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver(option);
		
		driver.navigate().to("http://omayo.blogspot.com/2013/05/page-one.html");
		String parent = driver.getWindowHandle();
		System.out.println("Parent window : "+parent);
		
		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println("Windows : "+windows);
		
		Thread.sleep(4000);
		
		driver.quit();
		

		
		
		
		
		

	}

}
