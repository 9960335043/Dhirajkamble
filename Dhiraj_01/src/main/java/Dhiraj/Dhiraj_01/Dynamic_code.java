package Dhiraj.Dhiraj_01;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Dynamic_code {
	
	public static WebDriver driver;
    public static void launch_browser(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			 driver = new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("edge")) {
			 driver = new EdgeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
		}
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("Launch browser is : " + browser);
		
	}
    
    public static void hiturl(String url) {
    	driver.get(url);
    	System.out.println(driver.getTitle());
    }
    
    public static void takescreenshot(String screenshot_name) throws Throwable {
    	TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File ("./Jeevansathi_javascript/"+screenshot_name+ ".png");
		FileHandler.copy(Source, target);
		
    }
    public static void Screenshot(String ss_name) throws Throwable {
    	String projectpath = System.getProperty("user.dir");
    	TakesScreenshot ts2 = (TakesScreenshot) driver;
		File Source2 = ts2.getScreenshotAs(OutputType.FILE);
        File target2 = new File (projectpath + "\\Evidences\\"+ ss_name+".png");
		FileHandler.copy(Source2, target2);
    }	
    
    
    
    
    public static void enter_text(String Text) {
    	Actions act = new Actions(driver);
    	act.sendKeys("Text").build().perform();
    
    }
    public static void select_copy_paste() {
    	Actions act = new Actions(driver);
    	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
    	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
    	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
    }
    public static void Rightclick() {
    	Actions act = new Actions(driver);
    	act.contextClick().build().perform();;
    }
    
    public static void Doubleclick() {
    	Actions act = new Actions(driver);
    	act.doubleClick().build().perform();
    }
    
    public static void refresh() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.history.go(0)");
    }
    	
    public static void back() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.history.back()");
    }
    
    public static void forward() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.history.forward()");
    }
    
    public static void scroll_to_bottom() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    public static void scroll_by_offset(int x, int y) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(x + "," + y)");
    }
    
    public static void DragandDrop(WebElement source, WebElement target) {
    	Actions act = new Actions(driver);
	    act.dragAndDrop(source, target).build().perform();
    }
    public static void move_slider(String obj, int x, int y) {
    	Actions act = new Actions(driver);
    	act.dragAndDropBy(null, x, y).build().perform();
    }
    public static void switch_to_frame(WebElement frame) {
    	driver.switchTo().frame(frame);
    	
    }
    public static void back_to_window() {
    	driver.switchTo().defaultContent();
    }
    public static void pageUp() {
    	Actions act = new Actions(driver);
        act.keyDown(Keys.PAGE_UP).build().perform();
        
    }
    public static void pageDown() {
    	Actions act = new Actions(driver);
    	act.keyDown(Keys.PAGE_DOWN).build().perform();
    }
    
}

      


