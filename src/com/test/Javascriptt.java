package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptt {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikandan\\eclipse-workspace\\Seleneiumday5\\driver\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();	
		
		driver.get("https://www.facebook.com/");
		WebElement UserName = driver.findElement(By.id("email"));
		//using java script
		JavascriptExecutor executor= (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','Greens')",UserName);
		
		//get values
		Object Name = executor.executeScript("return arguments[0].getAttribute('value')",UserName);
		System.out.println(Name);
		
		//using java script
		WebElement Password = driver.findElement(By.id("pass"));
		
		executor.executeScript("arguments[0].setAttribute('value','Kumar')",Password);
		//get values
		Object Value = executor.executeScript("return arguments[0].getAttribute('value')",Password);
		System.out.println(Value);
		
		//login
		WebElement Btnlogin = driver.findElement(By.xpath("//button[text()='Log In']"));
		Btnlogin.click();
		
		
		
		
		
		
		
		
		
		

	}

}
