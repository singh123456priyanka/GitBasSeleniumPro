package lipstic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Lakme_02 {
	@Test(groups="Cosmetic")
	public void lakmeLipstic() throws InterruptedException
	{
		System.setProperty("webdriver.driver.chromedriver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lakmeindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}


}
