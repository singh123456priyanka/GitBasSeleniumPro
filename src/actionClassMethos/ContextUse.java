package actionClassMethos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextUse {

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("webdriver.driver.chrome","./drivers/Chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("---remote-allow-origins=*");
		
		
		
		//WebDriver driver=new EdgeDriver();
		WebDriver driver=new ChromeDriver(opt);

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("APjFqb")).sendKeys("Trello.com",Keys.ENTER);
		Thread.sleep(2000);

		
		driver.findElement(By.xpath(" //a[text()='Log in to Trello']")).click();
		
		driver.findElement(By.id("user")).sendKeys("singh123456priyanka22@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("singh123456priyanka22",Keys.ENTER);
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//div[text()= \"My First Workspace\"])[1]")).click();
		
		
		WebElement mn = driver.findElement(By.xpath("//span[text()='Manual']"));
		
		Actions act= new Actions(driver);
		act.contextClick(mn).perform();
		
		List<WebElement> listname = driver.findElements(By.xpath(" //span[@class='quick-card-editor-buttons-item-text']" ));
		
		for(WebElement we:listname)
		{
		String name = we.getText();
		System.out.println(name);
		Thread.sleep(2000);
		}

		driver.quit();
		
		/*driver.findElement(By.xpath( "//span[text()='Continue with Google']" )).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("identifierId")).sendKeys("singh123456priyanka22@gmail.com");
		
		driver.findElement(By.xpath("//div[@class=\"board-tile-details is-badged\"]")).click();
		//driver.close();*/
		
		

	}

}
