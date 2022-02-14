package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scriptt {

	public static void main(String[] args) {
//java script use for insert value
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikandan\\eclipse-workspace\\Seleneiumday5\\driver\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();	
		
		driver.get("https://www.amazon.in/");
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].setAttribute('value','Kumar')",Search);
		
		Object Value = executor.executeScript("return arguments[0]. getAttribute('value')",Search);
		System.out.println(Value);
	
	driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
