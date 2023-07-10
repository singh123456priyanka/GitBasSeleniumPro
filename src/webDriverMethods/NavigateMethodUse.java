package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigateMethodUse {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver wb= new ChromeDriver(op);
		wb.get("https://www.google.com/");
		
		Thread.sleep(8000);
		
		wb.navigate().to("https://www.facebook.com/");
		wb.manage().window().fullscreen();

		
		Thread.sleep(4000);
		wb.navigate().back();
		wb.manage().window().maximize();
		
		Thread.sleep(2000);
		wb.navigate().forward();
		
		Thread.sleep(2000);
		wb.navigate().refresh();
		
		Thread.sleep(2000);
		wb.close();

		
	}

}
