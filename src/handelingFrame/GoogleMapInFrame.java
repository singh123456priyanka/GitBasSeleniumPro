package handelingFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleMapInFrame {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.driver.chrome","./drivers/chrome.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//div[@id='gbwa']")).click();
		
		WebElement frm = driver.findElement(By.xpath("//iframe[@name='app']"));

		driver.switchTo().frame(frm);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(.,'Maps') and @class='Rq5Gcb' ]")).click();
		Thread.sleep(4000);

		driver.navigate().back();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Hello Siddhu!!");	
		
		
	}

}
