package workingwithTestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AnnotationPracticeActitime {
	WebDriver driver=null;
	
	@BeforeClass 
	@Parameters("browserName")
	public void getBrowserNameFromParameter(String bname) throws IOException, InterruptedException{		
		String urlread = readdata("url");			
		if(bname.equalsIgnoreCase("chrome"))	{
			System.setProperty("webdriver.driver.chrome","./drivers/chrome.exe");
			driver= new ChromeDriver();		}
		else if(bname.equalsIgnoreCase("Firefox"))		{
				System.setProperty("webdriver.driver.gecko","./drivers/geckodriver.exe");
				driver= new FirefoxDriver();		}
		else	{
			 throw new  BrowserException();}		
		driver.manage().window().maximize();
		Reporter.log("Browser is Maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));		
		driver.get(urlread);
		Thread.sleep(3000);
		Reporter.log("Browser is launched",true);
	}
	
	@BeforeMethod
	public void loginActiTime() throws IOException, InterruptedException {		
		Reporter.log("entering login acti time method",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys(readdata("username"));;
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(readdata("password"));
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
	}
	
	@Test
	public void addcustomer() throws IOException, InterruptedException {	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		Thread.sleep(3000);
		WebElement customer = driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]"));
		Thread.sleep(3000);
		customer.sendKeys(readdata("customer"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(4000);
		WebElement searchBox = driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...'])[1]"));
		Thread.sleep(2000);
		searchBox.clear();
		Thread.sleep(1000);
		searchBox.sendKeys(readdata("customer"));
		Thread.sleep(2000);
		Reporter.log("Customer search completed: Exited method",true);
		}
	
	@AfterMethod	
	public void logout() throws InterruptedException {
		//Reporter.log("entering logout method",true);
		//Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();		
	}
	
	@AfterClass
	public void closebrowser() throws InterruptedException{
	//	Reporter.log("entering close method",true);
		Thread.sleep(2000);
		driver.close();		
	}
	
	

	
	public String readdata(String data) throws IOException {
		FileInputStream fis= new FileInputStream(new File("./testData/annotation.properties"));
		
		Properties prop= new Properties();
		prop.load(fis);
		
		String data1;
		data1=prop.getProperty(data).toString();
		System.out.println(data1);
		
		return data1;
		
	}

}

class BrowserException extends RuntimeException {
	public  BrowserException()
	{
		super ("The Browser is Invalid");
	}
	
}
