package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidrodown {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikandan\\eclipse-workspace\\SeleneiumDay2\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	
		
		driver.get("demo.automation testing.in/register");
		
			
			WebElement element = driver.findElement(By.id("name"));
			Select select = new Select (element);
			
			
			
			
			
			
			
			
			
			
			driver.close();
			
			
		
		

		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
