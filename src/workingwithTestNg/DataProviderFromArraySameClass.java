package workingwithTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderFromArraySameClass {
	@DataProvider()
	public String[] geturl()
	{
		String [] sarr= {
								"https://www.lakmeindia.com/",
								"https://lovechild.in/",
								"https://www.maybelline.co.in/",
								"https://in.sugarcosmetics.com/collections/lips"
							};
		return sarr;
		
	}
	
	@Test(dataProvider="geturl")
	public void launchappBrowser(String bname) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(bname);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	
	}

}
