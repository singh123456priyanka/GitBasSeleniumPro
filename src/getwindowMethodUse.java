import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getwindowMethodUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		
		driver.navigate().to("https://omayo.blogspot.com/");
		String firstwindow = driver.getWindowHandle();

		driver.manage().window().fullscreen();
		System.out.println(driver.getTitle());

		
		Thread.sleep(2000);
		
		//System.out.println(firstwindow);
		
		
		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String> windows = driver.getWindowHandles();

		
		Thread.sleep(5000);
		
		Iterator<String> itr = windows.iterator();
		
		while(itr.hasNext()) {
			String win = itr.next();
			
			driver.switchTo().window(win);
			if (driver.getTitle().equals("Basic Web Page Title"))
			{
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());

				Thread.sleep(2000);
				driver.close();
			}
					
		}
		
		
		driver.switchTo().window(firstwindow);
		driver.findElement(By.name("textboxn")).sendKeys("Priyanka");
		Thread.sleep(2000);
		driver.close();

		

	}

}
