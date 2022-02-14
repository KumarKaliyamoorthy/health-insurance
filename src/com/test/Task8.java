package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task8 {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikandan\\eclipse-workspace\\SeleneiumDay2\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	
		
		driver.get("https://www.homedepot.com/");
		
		WebElement txtNumber = driver.findElement(By.className("ShoppingLinks__link js__flyout--open"));

		Actions actions = new Actions (driver);
		
		actions.moveToElement(txtNumber).perform();
		
		
		  driver.close();
		
		
		
		
		
		
		
		
	}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


