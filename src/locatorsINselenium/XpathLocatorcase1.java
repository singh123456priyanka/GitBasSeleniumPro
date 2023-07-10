//using contains xpath

package locatorsINselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathLocatorcase1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address or phone number')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("123456");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).submit();
		
		Thread.sleep(2000);
				

	}

}



