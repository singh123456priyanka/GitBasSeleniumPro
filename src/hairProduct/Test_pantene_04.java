package hairProduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_pantene_04 {
	@Test(groups="Onlyhair")
	public void pantenehair() throws InterruptedException
	{
		System.setProperty("webdriver.driver.chromedriver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.pantene.in/en-in/browse-by-collection/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}


}
