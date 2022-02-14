package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	public static void main(String[] args) {
		
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikandan\\eclipse-workspace\\SeleneiumDay2\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://demo.automationtesting.in/Register.html");
			
			WebElement dDnskills = driver.findElement(By.id("Skills"));
							
			Select select = new Select(dDnskills );
			
			
//find a drop down length
			
			List<WebElement> options = select.getOptions();
			//length
			int len = options.size();
			System.out.println(len);
			
			// get index option
			WebElement element = options.get(15);
			
			//get text
			String data = element.getText();
			System.out.println(data);
			
			//or 
			
			//attribute value
			WebElement a = options.get(10);
			String Data = a.getAttribute("value");
			System.out.println(Data);
			
				
			
				
				
				
				
				
				
	
				
				
				
				
				
				
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
