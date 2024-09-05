package Dhiraj.Dhiraj_01;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser_launch {

	public static void main(String[] args) {
		
		//WebDriver driver = new ChromeDriver();
		
		//WebDriver drive = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.amazon.com/");
		
		//driver.close();
		
		//driver.navigate().to("");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.snapchat.com/");
		
		/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(null));
		
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);*/
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("gw-ftGr-desktop-hero-1"));
		
		driver.findElement(By.className("skip-link"));
		
		driver.findElement(By.name("abc"));
		
		driver.findElement(By.linkText("Mobiles"));
		
		driver.findElement(By.linkText("Today's Deals"));
		
		driver.findElement(By.partialLinkText("Today's De"));
		
		driver.findElement(By.tagName("option"));
		
		//tagname#idvalue
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		//tagname.classvalue
		driver.findElement(By.cssSelector("div.nav-search-field "));
		
		//css - single attribute
		driver.findElement(By.cssSelector("input[placeholder=\"Search Amazon.in\"]"));
		
		//css - multiple attribute
		driver.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"][placeholder=\"Search Amazon.in\"]"));
		
		//contains
		driver.findElement(By.cssSelector("input[id*=\"twotabsearc\"]"));
		
		//startswith
		driver.findElement(By.cssSelector("input[id^=\"tw\"]"));
		
		//endswith
		driver.findElement(By.cssSelector("input[id$=\"ox\"]"));
		
		//pseudo-class
		//first-child
		driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :first-child"));
		
		//last-child
		driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :last-child"));
		
		//nth-child(n)
		driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :nth-child(4)"));
		
		//nth-last-child(n)
		driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :nth-last-child(4)"));
		
		
		
		
		
		
		driver.close();
		
		
		
		
		
		

	}

	
	}

	
	
	

