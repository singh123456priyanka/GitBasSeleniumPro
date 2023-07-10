package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadFromPropertiesFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		
			File filepath = new File("./testData/configure.properties");
			
//-	--------1. Create the obj of input stream----------------
			FileInputStream fis=new FileInputStream(filepath);
	
		
//----------2. Create the obj of file type---------------------
			Properties prop=new Properties();
			prop.load(fis);			
			
//----------3. Call appropriate read method -----------------
			System.out.println( prop.get("name").toString());
			System.out.println( prop.get("url").toString());
			System.out.println( prop.get("browser").toString());
			System.out.println( prop.get("password").toString());

//-----------------------------------------------------
			Thread.sleep(5000);
			
	String key = prop.get("syskey").toString();	
	String value = prop.get("sysvalue").toString();
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	driver.get(prop.get("url").toString());
	



	}

}
