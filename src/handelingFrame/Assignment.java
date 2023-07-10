package handelingFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome","./drivers/chrome.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		//1. Clicking Photo Manager tab
		WebElement src1 =	driver.findElement(By.xpath("(//h5[text()='High Tatras'])"));			
		WebElement dest = driver.findElement(By.xpath("//span[text()='Trash']"));
		 Actions act= new Actions(driver);
		
		 Thread.sleep(3000);
		 act.dragAndDrop(src1, dest).perform();
		 
		WebElement src2 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		Thread.sleep(4000);
		act.dragAndDrop(dest, src2).perform();
		Thread.sleep(4000);
		act.dragAndDrop(src2,dest ).perform();
		Thread.sleep(3000);
		//act.dragAndDrop(src1, src2).perform();
		
		//2. Clicking Accepted Elements tab
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//li[text()='Accepted Elements']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath(("(//iframe[@class='demo-frame lazyloaded'])[2]"))));

		WebElement accpsrc1 = driver.findElement(By.xpath("//div[@id='draggable-nonvalid']"));
		WebElement accdst = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(accpsrc1, accdst).perform();
		Thread.sleep(2000);	

		WebElement accpsrc2 = driver.findElement(By.id("draggable"));
		act.dragAndDrop( accpsrc1,accpsrc2).perform();
		Thread.sleep(2000);	

		act.dragAndDrop(accpsrc2,accdst).perform();
		Thread.sleep(3000);
		
		//3.Clicking Propagation tab
		
		driver.switchTo().parentFrame(); 									
		driver.findElement(By.id("Propagation")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe [@class='demo-frame lazyloaded'])[3]")));

		WebElement propsrc1 = driver.findElement(By.xpath("//p[.='Drag me to my target']"));
		WebElement propdest1 = driver.findElement(By.xpath("(//p[text()='Outer droppable'])[1]"));
		
		Thread.sleep(4000);
		act.dragAndDrop(propsrc1, propdest1).perform();
		
		Thread.sleep(4000);
        WebElement popdest2 = driver.findElement(By.xpath("//p[.='Outer droppable']"));
        act.dragAndDrop(propsrc1, popdest2).perform();
		
        Thread.sleep(4000);
        WebElement popdest3 = driver.findElement(By.xpath("//p[.='Inner droppable (not greedy)']"));
        act.dragAndDrop(propsrc1, popdest3).perform();
		
        Thread.sleep(4000);
        WebElement popdest4 = driver.findElement(By.xpath("//p[.='Inner droppable (greedy)']"));
        act.dragAndDrop(propsrc1, popdest4).perform();
		
     	
	}

}
