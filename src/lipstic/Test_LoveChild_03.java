package lipstic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_LoveChild_03 {
	@Test(groups="Cosmetic")
	public void lovechildLipstic() throws InterruptedException
	{
		System.setProperty("webdriver.driver.chromedriver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://lovechild.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}


}
