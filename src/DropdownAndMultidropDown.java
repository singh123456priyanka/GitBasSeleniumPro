import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAndMultidropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
		// Single Select DropDown
		WebElement dropdown = driver.findElement(By.id("drop1"));
		Select sel= new Select(dropdown);
		
		System.out.println("Is Drop down multiple select dropdown?  "+sel.isMultiple());

		List<WebElement> ddlist = sel.getOptions();
		
		for(WebElement we:ddlist)
		{	
				System.out.println(we.getText());
		}

			sel.selectByVisibleText("doc 1");
			
		//Multiple Select DropDown
			
			WebElement multidd = driver.findElement(By.id("multiselect1"));
			Select sel2 = new Select(multidd);
			
			System.out.println("Is Drop down multiple select dropdown?  "+sel2.isMultiple());
			
			List<WebElement> mlist = sel2.getOptions();
			
			for(WebElement we:mlist)
			{
				System.out.println(we.getText());
			}
			
			sel2.selectByVisibleText("Hyundai");
			sel2.selectByVisibleText("Audi");
			
			System.out.println("Selected options on Multi dropdown options are: ");
			for (WebElement me:mlist)
			{
				if(me.isSelected())
				{
					System.out.println(me.getText());
					
				}
			}
	
	}
			
	

	}


