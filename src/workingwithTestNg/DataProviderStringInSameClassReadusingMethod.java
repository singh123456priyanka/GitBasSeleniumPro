package workingwithTestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderStringInSameClassReadusingMethod {
	
	@DataProvider()
	public String[] getData() throws EncryptedDocumentException, IOException 
		{
		String[] url = excel();
		String[] geturl = null;
		for(String array:url )
		{
			System.out.println(array); 
			geturl=url;
		}
		return geturl;
		}
	@Test(dataProvider="getData")
	public void testBrowser(String cdata) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(cdata);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	
	}

public static String[] excel(){
	
		String[] sarr= {
								"https://www.lakmeindia.com/",
								"https://lovechild.in/",
								"https://www.maybelline.co.in/",
								"https://in.sugarcosmetics.com/collections/lips"
							};
		return sarr;
		
	}
	

}