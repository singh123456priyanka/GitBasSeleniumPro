package actionClassMethos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragnDrop4thActionClass {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.driver.gecko","./drivers/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://trello.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("user")).sendKeys("singh123456priyanka22@gmail.com",Keys.ENTER);
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("singh123456priyanka22",Keys.ENTER);
		
		//Thread.sleep(4000);
		WebDriverWait wt= new WebDriverWait(driver, Duration.ofMillis(4000));
		WebElement pswd = driver.findElement(By.name("password"));
		wt.until(ExpectedConditions.visibilityOf(pswd));
		pswd.sendKeys("singh123456priyanka22",Keys.ENTER);

		WebElement myworkspace = driver.findElement(By.xpath("(//div[text()= \"My First Workspace\"])[1]"));
		wt.until(ExpectedConditions.visibilityOf(myworkspace));
		myworkspace.click();
		
		Thread.sleep(3000);
		
		WebElement src = driver.findElement(By.xpath("//span[text()='Manual']" ));
		wt.until(ExpectedConditions.visibilityOf(src));
		WebElement dest = driver.findElement(By.xpath(" //span[text()='Archana']"));
		wt.until(ExpectedConditions.visibilityOf(dest));

		
		
		Actions act= new Actions(driver); 
		act.dragAndDrop(src,dest ).perform();
		
		
		
	}

}
