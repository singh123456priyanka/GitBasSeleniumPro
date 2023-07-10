package lipstic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Maybeline_01 {
	
	@Test(groups="Cosmetics")
	public void mayBeLineLipstic() throws InterruptedException
	{
		System.setProperty("webdriver.driver.chromedriver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.maybelline.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
	
	

}
