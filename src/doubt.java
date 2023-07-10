import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class doubt{
public static void main(String[] args) throws  InterruptedException, AWTException {
System.setProperty("webdriver.driver.chrome","./drivers/chromedriver.exe");	
WebDriver driver= new ChromeDriver();
driver.get("https://www.makemytrip.com");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
Robot rb= new Robot();
rb.keyPress(KeyEvent.VK_TAB);
rb.keyRelease(KeyEvent.VK_TAB);
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);



//String[][] arr= {
//			{null,null},
//			{null,null},
//			{"sunny","singh"},
//			{"Siddhu","singh"}
//			};
//			
//	
//	for(int i=2,k=0;i<=3; i++,k++) 
//	{			
//		for(int j=0; j<2; j++) {
//			arr[k][j]=arr[i][j];
//			System.out.println(arr[k][j]);
//		}
//	}
//
//}
		}
}
