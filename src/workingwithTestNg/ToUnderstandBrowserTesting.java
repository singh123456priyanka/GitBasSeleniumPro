package workingwithTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ToUnderstandBrowserTesting {
	
	@Parameters("browserName")
	@Test
	public void testBrowser(String bname) throws InterruptedException {
	WebDriver driver= null;
	if(bname.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.driver.chrome", "./driver/chrome.exe");
		driver=new ChromeDriver();
	}
	else if(bname.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.driver.gecko", "./driver/geckodriver.exe");
		driver=new FirefoxDriver();

	}
	//WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-female")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Priyanka");
	driver.findElement(By.id("LastName")).sendKeys("singh");
	driver.findElement(By.name("Email")).sendKeys("singh123456priyanka22@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("pankaji1*");
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(4000);
	driver.quit();
	
	
	
	}
	

}
