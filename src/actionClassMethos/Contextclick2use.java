package actionClassMethos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Contextclick2use {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.driver.chrome","./drivers/Chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("---remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://trello.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("user")).sendKeys("singh123456priyanka22@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("singh123456priyanka22",Keys.ENTER);
		WebDriverWait wt= new WebDriverWait(driver, Duration.ofMillis(3000));

		WebElement myworkspace = driver.findElement(By.xpath("(//div[text()= \"My First Workspace\"])[1]"));
		wt.until(ExpectedConditions.visibilityOf(myworkspace));
		myworkspace.click();
		
		WebElement mn = driver.findElement(By.xpath("//span[text()='Manual']"));
		
		Actions act= new Actions(driver);
		act.contextClick(mn).perform();
		
		driver.findElement(By.xpath("//span[text()='Open card']")).click();
		Thread.sleep(2000);

		WebElement textbox = driver.findElement(By.xpath( "//textarea[@class='comment-box-input js-new-comment-input' and  @placeholder=\"Write a comment…\"]"));
		
		wt.until(ExpectedConditions.visibilityOf(textbox));
		
		textbox.click();
		textbox.sendKeys("Hello Priyanka!!!");
		textbox.findElement(By.xpath("//input[@class='nch-button nch-button--primary confirm mod-no-top-bottom-margin js-add-comment' ]")).click();
		driver.close();
	}

}
