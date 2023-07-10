package workingwithTestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUsingExcel {
	
	@DataProvider
	public String[][] readExcel() throws EncryptedDocumentException, IOException
	{
		
		FileInputStream fis= new FileInputStream(new File("./testData/urlExcel.xlsx"));
		
		Workbook wb = WorkbookFactory.create(fis)	;	
		Sheet sheet = wb.getSheet("Sheet1");
		
		int rowc = sheet.getPhysicalNumberOfRows()-1;
		int colc = sheet.getRow(1).getPhysicalNumberOfCells();
		
		String[][] arr= new String[rowc][colc];
	
		for(int i=1,k=0;i<=rowc;i++,k++){
			for(int j=0; j<colc; j++) {
			
				arr[k][j]=sheet.getRow(i).getCell(j).toString();
				System.out.println(arr);
				}
					}
			return arr;		
	}
	
	@Test(dataProvider="readExcel")
public void testBrowser(String data) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(data);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	
	}

}
