package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PromptPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		// for adding the property of chromedriver.exe  
			WebDriver driver= new EdgeDriver();
			// passing the argument through opt
			driver.get("http://omayo.blogspot.com/2013/05/page-one.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.manage().window().maximize();

			
			driver.findElement(By.id("prompt")).click();
			
			
			Alert prompt_alert = driver.switchTo().alert();
			
			prompt_alert.sendKeys("Priyanka");
			
			Thread.sleep(5000);
			prompt_alert.accept();
			Thread.sleep(3000);

			
		
	}

}
