package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AvoidFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			WebDriver driver= new EdgeDriver();
			driver.get("http://omayo.blogspot.com/2013/05/page-one.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.manage().window().maximize();
			
			Thread.sleep(4000);
			
			driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\panka\\OneDrive\\Desktop\\link.html");
			


	}

}
