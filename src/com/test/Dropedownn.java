package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import okio.Options;

public class Dropedownn {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikandan\\eclipse-workspace\\SeleneiumDay2\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement dDnskills = driver.findElement(By.id("Skills"));
		
		Select select = new Select(dDnskills);
		
		select.selectByIndex(15);
		
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
}
	
	
	
	
	
	
	


