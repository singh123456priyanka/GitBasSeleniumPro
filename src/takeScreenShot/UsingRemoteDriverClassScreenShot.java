package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class UsingRemoteDriverClassScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.driver.chrome","./drivers/chromedriver.exe");
		
		RemoteWebDriver remdriver= new ChromeDriver();
		remdriver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569849%7Cb%7Cfacebook%20%27%7C&placement=&creative=589460569849&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9062009%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw6IiiBhAOEiwALNqncbJ9jRjm2Qo0ZoH_A-skzUraarYzqmwuQuJfqIujoMfeR_pbupXOdRoC0QcQAvD_BwE");
		
		File src = remdriver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/fb.png");
		Files.copy(src, dest);

	}

}
