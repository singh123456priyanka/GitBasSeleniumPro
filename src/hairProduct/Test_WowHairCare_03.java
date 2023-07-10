package hairProduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_WowHairCare_03 {
	@Test(groups={"Cosmetic","Onlyhair"})
	public void wowhair() throws InterruptedException
	{
		System.setProperty("webdriver.driver.chromedriver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.buywow.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}


}
