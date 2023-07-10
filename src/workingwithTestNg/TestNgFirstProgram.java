package workingwithTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgFirstProgram {
	
	//Alphabetically order execution of test case first easeMyTrip(), irctc() ,makeMyTrip()
	
	@Test
	public void irctc() {
		int i =1;
		int a=1/0;
		System.setProperty("webdriver.driver.chromedriver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();		
		driver.get("https://irctc.co.in/");
		driver.manage().window().maximize();
		driver.close();

	}
	
	@Test
	public void makeMyTrip() {
		
		System.setProperty("webdriver.driver.chromedriver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.close();
		
	}
	
	@Test
	public void easeMyTrip() {
		
		System.setProperty("webdriver.driver.chromedriver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		driver.close();
		
		
	}


}
