package webElementMethod;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsingAllElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		System.getProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		/*driver.get("https://integrator.actitime.com/auth/at");
		driver.manage().window().maximize();
		
		 WebElement serveraddress_txtbox = driver.findElement(By.xpath("(//input[@class='ZmCOM' and @name='actiTimeUrl'])"));
		WebElement username_txtbox = driver.findElement(By.xpath("//input[@class='ZmCOM' and @name='username' ]"));
		WebElement password_txtbox = driver.findElement(By.xpath("//input[@class='ZmCOM' and @name='password' ]"));
		WebElement login_button = driver.findElement(By.xpath("//span[text()='Login']"));
		
		serveraddress_txtbox.sendKeys("ABCD");
		username_txtbox.sendKeys("Admin123");
		password_txtbox.sendKeys("123455");
		login_button.click();
		Thread.sleep(5000);
		
		serveraddress_txtbox.clear();
		serveraddress_txtbox.sendKeys("fb");*/
		//driver.close();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement utxtbox = driver.findElement(By.name("username"));
		WebElement pwdtxtbox = driver.findElement(By.name("pwd"));
		WebElement checkboxlog = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		WebElement buttonlog = driver.findElement(By.linkText("Login"));
		utxtbox.sendKeys("admin");
		pwdtxtbox.sendKeys("12321");
		checkboxlog.click();
		Thread.sleep(6000);

		buttonlog.click();
		
		Dimension size = utxtbox.getSize();
		System.out.println("size"+size);
		System.out.println("Height --> "+size.getHeight());
		System.out.println("Width --> "+size.getWidth());

		
		
		
		
		

	}

}
