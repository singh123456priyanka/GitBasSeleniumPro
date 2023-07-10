package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UnderstandingWindowsScrollingActions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.edge","./drivers/msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver; //TypeCasting
		js.executeScript("window.scrollBy(0,5000)"); //moving scroll on window down on y axis by 5000 pixel
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-1000)");//moving upon axis by 1000
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(50,500)");//moving right and up
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(1000,0)");//moving right 1000 pixel 
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(-200,0)");//moving left by -200 pixel 

		

	}

}
