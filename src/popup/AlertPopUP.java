package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopUP {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.driver.edge","./drivers/msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("alert1")).click();
		
		Thread.sleep(6000);
		
		driver.switchTo().alert().accept();
		
		

	}

}
