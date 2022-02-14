package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tasksample {

	public static void main(String[] args) {
		
		
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikandan\\eclipse-workspace\\Seleneium6\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		
		driver.switchTo().frame(1);
		
		
		WebElement s = driver.findElement(By.name("fldLoginUserId"));
		s.sendKeys("kumar");
		
		
		
		
		
		
		
		
		
		
				 
		driver.close();	 
			 
			 
			 
			 
			 
			 
			 
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


