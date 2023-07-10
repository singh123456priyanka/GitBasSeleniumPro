package hairProduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Loreal_02 {
	@Test (groups="Cosmetic" )
	public void lorealhair() throws InterruptedException
	{
		System.setProperty("webdriver.driver.chromedriver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lorealparis.co.in/hair-care");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}


}
