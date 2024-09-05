package Dhiraj.Dhiraj_01;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends Dynamic_code{

	private static final char[] projectpath = null;

	public static void main(String[] args) throws IOException {
		
		launch_browser("Chrome");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File ("./Evidences/Browser_launched.png");
		FileHandler.copy(Source, target);
		
		
		hiturl("https://snapdeal.com/");

		// Tell driver to take the screenshot
		// use takescreenshot interface (you need to create object)
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		
		// with the help of referance variable of takescreenshot interface use getscreenshotAs method)
		File Source1 = ts.getScreenshotAs(OutputType.FILE);
		
		// directly with foldername and filename
		File target1 = new File ("./Evidences/Snapdeal.png");
		FileHandler.copy(Source1, target1);
		
		driver.findElement(By.cssSelector("input#inputValEnter")).sendKeys("Kitchen products");
		
		//By declaring project path
		String projectpath = System.getProperty("user.dir");
		
		System.out.println(projectpath);
		
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File Source2 = ts.getScreenshotAs(OutputType.FILE);
        File target2 = new File (projectpath + "\\Evidences\\Search_product+.png");
		FileHandler.copy(Source2, target2);
	}

}
