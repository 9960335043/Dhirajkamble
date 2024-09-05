package Dhiraj.Dhiraj_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_methods {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		
		//click
		WebElement searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		searchbox.click();
		
		//sendkeys
		searchbox.sendKeys("Mobiles");
		
		Thread.sleep(3000);
		
		//clear
		searchbox.clear();
		
		searchbox.sendKeys("Books");
		
		//getAttribute
		System.out.println(searchbox.getAttribute("value"));
		
		//getText
		//System.out.println(searchbox.getText());
		
		//getlocation
		System.out.println("The x co-ordinate of searchbox lies at : " + searchbox.getLocation().x);
		System.out.println("The y co-ordinate of searchbox lies at : " + searchbox.getLocation().y);

		//get size
		System.out.println("size of searchbox is : " + searchbox.getSize());
		
		//get tagname
		System.out.println(searchbox.getTagName());
		
		//is displayed
		System.out.println(searchbox.isDisplayed());
		
		//is enabled
		System.out.println(searchbox.isEnabled());
		
		//is selected
		System.out.println(searchbox.isSelected());

		
	}

}
