package maple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe")	;	
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");

		
	}

}
