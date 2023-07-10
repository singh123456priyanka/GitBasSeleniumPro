package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingDocumentElementByforDisableButton {

	public static void main(String[] args) {
System.setProperty("webdriver.driver.edge","./drivers/msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//for disable testbox
		js.executeScript(" document.getElementById('tb2').value='priyanka' ");
		
		//for disable button
		WebElement disableButton = driver.findElement(By.id("but1"));
		js.executeScript("argument[0].click()",disableButton); //argument is an array and displaybutton [0]index par save kar raha hai
		//on display we cant see anything happening but it was clicked
		
		
		
	}

}
