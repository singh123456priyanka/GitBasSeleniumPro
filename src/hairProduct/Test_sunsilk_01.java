package hairProduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_sunsilk_01 {
	@Test(groups="Onlyhair")
	public void sunsilkhair() throws InterruptedException
	{ 
		System.setProperty("webdriver.driver.chromedriver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sunsilk.in/home.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}


}
