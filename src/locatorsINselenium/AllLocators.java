package locatorsINselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllLocators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");// for adding the property of chromedriver.exe  

		WebDriver driver= new ChromeDriver();// passing the argument through opt
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569888%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569888&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9062009%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw0ZiiBhBKEiwA4PT9z6AxzR9rngYunumNNuSZ80cDi6MEzfJgT5bfmnJ_yokiN3Kh2vQ2uBoCkd0QAvD_BwE");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//1.name  
		driver.findElement(By.name("firstname")).sendKeys("Priyanka");
				Thread.sleep(3000);
		
		//2. cssSelector using $ 
		driver.findElement(By.cssSelector("input[autocomplete $='word']")).sendKeys("ftyrytrytyty");
				Thread.sleep(3000);
		
		//3.cssSelector using ^
		driver.findElement(By.cssSelector("input[name^='la']")).sendKeys("Singh");
				Thread.sleep(3000);
		
		//4.xpath
		driver.findElement(By.xpath("//input[@name='reg_email__'] ")).sendKeys("pp@gmail.com");
				Thread.sleep(5000);
		
		//5.Xpath
		driver.findElement(By.xpath(" //input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_email_confirmation__']")).sendKeys("priyankas22");
				Thread.sleep(5000);

				driver.close();
		//driver.get("");
		
		
		
		
		/*WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		Thread.sleep(4000);
		WebElement reenter = driver.findElement(By.xpath("//div[text()='Re-enter email address']"));
		wait.until(ExpectedConditions.visibilityOf(reenter));
		reenter.sendKeys("ncdsjn");
		//driver.findElement(By.id("u_0_d_VM")).sendKeys("Singh");
		//driver.findElement(By.cssSelector("input[id='u_0_g_Ph']")).sendKeys("9123455666");
		//driver.findElement(By.cssSelector(" [id*='d']")).click();*/
		/*WebElement repswd = driver.findElement(By.xpath("//input[@id='u_0_j_5L'and @name='reg_email_confirmation__' ]"));
		wait.until(ExpectedConditions.visibilityOf(repswd));
		repswd.sendKeys("djsjsdcds");*/
		/*JavascriptExecutor js =(JavascriptExecutor) driver;
		  js.executeScript(" document.getElementById ('password_step_input').value='Priya75348834' ");*/
		
				

	}

}
