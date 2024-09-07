package My_practise.Selenium_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Dynamic_code {

	public static WebDriver driver;
	
		 public static void text(String text) {
		    	Actions act = new Actions(driver);
		    	act.sendKeys("text");
		
	}

}
