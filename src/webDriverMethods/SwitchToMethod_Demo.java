package webDriverMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchToMethod_Demo {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver(option);
		
		
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("data",Keys.ENTER) ;
		Thread.sleep(800);
		driver.close();
	}

}
