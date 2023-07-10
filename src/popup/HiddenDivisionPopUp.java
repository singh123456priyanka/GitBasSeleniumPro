package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome","./drivers/chrome.exe");
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
		
		
		driver.findElement(By.xpath("//span[contains(@class,'logSprite icClose')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='sc-gGCDDS eaLCwN fswFld '])[3]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='April 2023']/../..//p[text()='29']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(.,'Done')]")).click();

	}

}
