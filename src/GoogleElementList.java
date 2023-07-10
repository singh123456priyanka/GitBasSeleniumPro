import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleElementList {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		
		driver.navigate().to("https://google.com");
		
		//driver.findElement(By.xpath("//div[@class='a4bIc']/textarea"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.switchTo().activeElement().sendKeys("clock");
		
		WebElement element = driver.findElement(By.xpath("//ul[@class='G43f7e']/li[5]"));
		System.out.println(element.getText()+"\n\n");
		 
		List<WebElement> clock = driver.findElements(By.xpath("//ul[@class='G43f7e']/li")); //list  wala xpath select karna padega
		
		for (WebElement we:clock)
		{
			String says = we.getText();
			System.out.println(says);
		}
		

	}

}
