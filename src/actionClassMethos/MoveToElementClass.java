package actionClassMethos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementClass {

	public static void main(String[] args) {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.reliancedigital.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("wzrk-cancel")).click();
		WebElement homeAppliance = driver.findElement(By.xpath("//div[text()='Home Appliances']"));
		
		Actions act=new Actions (driver);
		act.moveToElement(homeAppliance).perform();
		
		driver.findElement(By.linkText("Fans")).click();
		
		

	}

}
