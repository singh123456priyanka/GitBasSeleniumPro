package workingwithTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGThirdProgram {
	
			@Test (priority=7,invocationCount=4,threadPoolSize=2)
			public void irctc() {
				System.setProperty("webdriver.driver.chromedriver","./driver/chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("https://irctc.co.in/");
				driver.manage().window().maximize();
				driver.close();

			}
			
			@Test(priority=1,invocationCount=3,threadPoolSize=2)
			public void makeMyTrip() {
				System.setProperty("webdriver.driver.chromedriver","./driver/chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.makemytrip.com/");
				driver.manage().window().maximize();
				driver.close();
				
			}
			
//			@Test(priority= 0)
//			public void fb() {
//				System.setProperty("webdriver.driver.chromedriver","./driver/chromedriver.exe");
//				WebDriver driver= new ChromeDriver();
//				driver.get("https://www.facebook.com/");
//				driver.manage().window().maximize();
//				driver.close();				
//			}
//			@Test (priority= -3)
//			public void insta() {
//				System.setProperty("webdriver.driver.chromedriver","./driver/chromedriver.exe");
//				WebDriver driver= new ChromeDriver();
//				driver.get("https://www.instagram.com/");
//				driver.manage().window().maximize();
//				driver.close();
//			}
//			@Test(priority=-2)
//			public void gmail() {
//				System.setProperty("webdriver.driver.chromedriver","./driver/chromedriver.exe");
//				WebDriver driver= new ChromeDriver();
//				driver.get("https://accounts.google.com/");
//				driver.manage().window().maximize();
//				driver.close();
//			}


}
