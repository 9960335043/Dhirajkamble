package Dhiraj.Dhiraj_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dynamic_dropdown extends Dynamic_code{

	public static void main(String[] args) {
		
		launch_browser("chrome");
		hiturl("https://www.redbus.in/");
		
		 WebElement from_station = driver.findElement(By.cssSelector("input#src"));
		 
		 from_station.sendKeys("Nagpur");
		 
		 List<WebElement> options = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]//child::li"));
		 
		for(int a = 0; a<= options.size(); a++) {
			if(options.get(a).getText().contains("Chatrapathi")) {
				options.get(a).click();
			}
		}
		

		WebElement to_station = driver.findElement(By.cssSelector("input#dest"));
		 
		 to_station.sendKeys("Mumbai");
		
		List<WebElement> to = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]//child::li"));
		for(int b = 0; b<= options.size(); b++) {
			if(options.get(b).getText().contains("Bandra")) {
				options.get(b).click();
			}
			}
				
	}}

