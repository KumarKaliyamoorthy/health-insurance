package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropp {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikandan\\eclipse-workspace\\SeleneiumDay2\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement dDnskills = driver.findElement(By.id("Skills"));
		
		Select select = new Select(dDnskills);
		
		List<WebElement> options = select.getOptions();
		
		//print all options
		for (int i = 0; i <options.size(); i++) {
			
			WebElement a = options.get(i);
		//get text
			String data = a.getText();
			System.out.println(data);
			
			//enhanced loop
			for (WebElement Element : options) {
				
				
				//get text
				
				String b = Element.getText();
				System.out.println(b);
		//	get	attribute
				String n = Element.getAttribute("value");
				
				driver.close();
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
