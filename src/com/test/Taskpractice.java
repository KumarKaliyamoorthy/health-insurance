package com.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskpractice {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikandan\\eclipse-workspace\\Seleneium6\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone",Keys.ENTER);
		
		
		String parentwindowid= driver.getWindowHandle();
		System.out.println(parentwindowid);
		
		
		Set<String> childwindowid = driver.getWindowHandles();
		System.out.println(childwindowid);
		
		for (String eachwindowsid : childwindowid) {
			
			if(!parentwindowid.equals(eachwindowsid));{
			
			
			
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}
	
	


