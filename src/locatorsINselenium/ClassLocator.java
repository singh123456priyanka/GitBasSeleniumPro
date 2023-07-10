package locatorsINselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt= new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*"); // this argument allows us to switch on desired address.
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");// for adding the property of chromedriver.exe  

		WebDriver driver= new ChromeDriver(opt);// passing the argument through opt
		driver.get("https://www.facebook.com");
		
		Thread.sleep(5000);
		driver.findElement(By.className("inputtext")).sendKeys("admin");
		
		Thread.sleep(2000);

	}

}
