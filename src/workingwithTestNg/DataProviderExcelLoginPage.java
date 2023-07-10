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

public class DataProviderExcelLoginPage {
	
	@DataProvider
	public String[][] readdata() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream (new File("./testData/LoginExcel.xlsx"));
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet2");
		int rowc = sheet.getPhysicalNumberOfRows()-2;	//here value be 2
		int r=	rowc+1;		// because in excel the value is ending at index 4 or else our loop will not work.
		int colc = sheet.getRow(2).getPhysicalNumberOfCells();
		System.out.println(colc);
			String[][] arr=new String[rowc][colc];		
			//for(int i=2,k=0;i<=rowc;i++,k++)  
			//1st Loop (i=2;2<=(2)rowc=true;i=3) admin, manager will come
			//2nd Loop (i=3; 3<=(2)rowc=false ===>exit
			//so i have given r=rowc+1:: 3 the loop will go on.
			for(int i=2,k=0;i<=r; i++,k++) 
			{			
			for(int j=0; j<colc; j++) {
				arr[k][j]=sheet.getRow(i).getCell(j).toString();
				System.out.println(arr[k][j]);
			}
		}
			return arr;
	}
	@Test(dataProvider="readdata")	
	public void setdata(String[] data) throws InterruptedException{		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(data[0]);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(data[1]);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(15000);
		driver.quit();
	}
	
}
