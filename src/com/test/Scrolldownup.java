package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldownup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikandan\\eclipse-workspace\\Seleneiumday5\\driver\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();	
		
		driver.get("https://www.amazon.in/");
	WebElement Down = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		//scroll down
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		
		 executor.executeScript("arguments[0].scrollIntoView(true)",Down);
		 
		 //scroll up
		 WebElement Up = driver.findElement(By.xpath("//span[text()='Up to 40% off | Refurbished activity trackers']"));
		 executor.executeScript("arguments[0].scrollIntoView(false)",Up);
		 
		 driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
