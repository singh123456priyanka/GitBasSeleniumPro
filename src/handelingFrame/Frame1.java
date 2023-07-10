package handelingFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Frame1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.edge","./drivers/msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.dream11.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']")));
		
		driver.findElement(By.xpath(" //input[@name='regEmail']")).sendKeys("91206443434");
	}

}
