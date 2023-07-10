//Runtime Ploymorphism example

package allInOneLuanch;

import java.util.Scanner;// Scanner class

import org.openqa.selenium.WebDriver; // WebDriver class
import org.openqa.selenium.chrome.ChromeDriver; // ChromeDriver class
import org.openqa.selenium.chrome.ChromeOptions;//for ChromeOptions class enables allow to switch address
import org.openqa.selenium.edge.EdgeDriver;// EdgeDriver class
import org.openqa.selenium.firefox.FirefoxDriver;// FirefoxDriver class

public class All_in_1_launchBrowser {

	public static void main(String[] args) throws InterruptedException // after using thread.sleep this exception throw should be handeled
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which browser do you want to execute?\n");
		
		String bname= sc.next();
		
		if( bname.equalsIgnoreCase("Chrome") )// equalsIgnoreCase is used to ignore upper or lower case of value
		{
			
			ChromeOptions opt= new ChromeOptions();
			
			opt.addArguments("--remote-allow-origins=*"); // this argument allows us to switch on desired address.
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");// for adding the property of chromedriver.exe  

			WebDriver driver= new ChromeDriver(opt);// passing the argument through opt
			driver.get("https://www.facebook.com");
			
			Thread.sleep(5000);
			driver.close();
		}
		
		else if(bname.equalsIgnoreCase("firefox") )
		{
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.instagram.com/");
			
			Thread.sleep(10000);
			
			driver.get("https://www.facebook.com");
			 
			Thread.sleep(4000);

			driver.close();
			
		}
		
		else {
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.selenium.dev/");// first this will open and without delay it
			
		//	Thread.sleep(10000);
			
			driver.get("https://www.facebook.com");// is going to this address
			 
			Thread.sleep(4000);

			driver.close();

		}
		
		
	
}

}
