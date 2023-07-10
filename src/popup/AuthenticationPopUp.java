package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		// for adding the property of chromedriver.exe  
			WebDriver driver= new EdgeDriver();
			// passing the argument through opt
			driver.get("https://the-internet.herokuapp.com/basic_auth");
			
			
			driver.manage().window().maximize();
			Thread.sleep(4000);
			
			Robot bot = new Robot();
			
			bot.keyPress(KeyEvent.VK_A);
			bot.keyRelease(KeyEvent.VK_A);
			 
			 bot.keyPress(KeyEvent.VK_D);
				bot.keyRelease(KeyEvent.VK_D);
				 
				 bot.keyPress(KeyEvent.VK_M);
					bot.keyRelease(KeyEvent.VK_M);

					 bot.keyPress(KeyEvent.VK_I);
					 	bot.keyRelease(KeyEvent.VK_I);
					 		
					 		bot.keyPress(KeyEvent.VK_N);
							bot.keyRelease(KeyEvent.VK_N);
							
							Thread.sleep(3000);
							 
						 bot.keyPress(KeyEvent.VK_TAB);
						 bot.keyRelease(KeyEvent.VK_TAB);
						 
							Thread.sleep(3000);

								
								bot.keyPress(KeyEvent.VK_A);
								bot.keyRelease(KeyEvent.VK_A);
								 
								 bot.keyPress(KeyEvent.VK_D);
									bot.keyRelease(KeyEvent.VK_D);
									 
									 bot.keyPress(KeyEvent.VK_M);
										bot.keyRelease(KeyEvent.VK_M);

										 bot.keyPress(KeyEvent.VK_I);
										 	bot.keyRelease(KeyEvent.VK_I);
										 		
										 		bot.keyPress(KeyEvent.VK_N);
												bot.keyRelease(KeyEvent.VK_N);
												
												Thread.sleep(3000);

												 
												 bot.keyPress(KeyEvent.VK_TAB);
													bot.keyRelease(KeyEvent.VK_TAB);
													
													Thread.sleep(3000);

													 bot.keyPress(KeyEvent.VK_ENTER);
														bot.keyRelease(KeyEvent.VK_ENTER);

													
		
			

	}

}
