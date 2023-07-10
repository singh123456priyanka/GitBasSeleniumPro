package popup;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotifiactionUsingAutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
System.setProperty("webdriver.driver.chrome","./drivers/chrome.exe");
		
		//ChromeOptions opt= new ChromeOptions();
	   //opt.addArguments("--disable-notifications");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);		
		Runtime.getRuntime().exec("./autoITprograms/notificationEaseMyTrip.exe");
		
		
	}

}
