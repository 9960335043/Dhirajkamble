package Dhiraj.Dhiraj_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Static_Dropdown extends Dynamic_code {

	public static void main(String[] args) {
		
		launch_browser("chrome");
		hiturl("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC");
		
		
	
		WebElement create_profile_for = driver.findElement(By.cssSelector("select#reg_relationship"));
		
		Select sd = new Select(create_profile_for);
		
		//sd.selectByVisibleText("Relative/Friend");
		//sd.selectByVisibleText("Sister");
		//sd.selectByValue("6D");
		//sd.selectByValue("5");
		//sd.selectByIndex(0);
		sd.selectByIndex(1);
		
		WebElement dob = driver.findElement(By.cssSelector("select#reg_dtofbirth_day"));
		Select dt = new Select(dob);
		//dt.selectByValue("3");
		dt.selectByValue("14");
		//dt.selectByIndex(25);
		
		
		WebElement month = driver.findElement(By.cssSelector("select#reg_dtofbirth_month"));
		Select mh = new Select(month);
		//mh.selectByIndex(4);
		mh.selectByValue("9");
		
		WebElement year = driver.findElement(By.cssSelector("select#reg_dtofbirth_year"));
		Select yr = new Select(year);
		//yr.selectByValue("1994");
		yr.selectByIndex(14);
		
		
		
	}

}
