package workingwithTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Test
public class SoftAssertFBClass {
	public void softassertexample()
	{
		System.setProperty("webdriver.driver.chrome","./drivers/chrome.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(driver.getTitle(), "Facebook –  log in or sign up", "not matched");
		Reporter.log("FB pg title is correct",true);
		
		WebElement loginButton = driver.findElement(By.name("login"));
		System.out.println(loginButton.isDisplayed());
		sa.assertEquals(loginButton.isDisplayed(), "false","error message:Login Button Is displayed");
		loginButton.click();
		
		WebElement errmsgtxtfield = driver.findElement(By.xpath("//div[@id=\"email_container\"]/div[2]"));
		//System.out.println(errmsgtxtfield.getCssValue("color"));
		sa.assertEquals(errmsgtxtfield.getCssValue("color"), "rgba(240, 40, 73,1)","Successful color");
		sa.assertAll();
		
		
		
	}

}
