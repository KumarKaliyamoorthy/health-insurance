package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertt {

	public static void main(String[] args) {	
			
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikandan\\eclipse-workspace\\SeleneiumDay2\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
		
		WebElement A = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		A.click();
		
		
		
		WebElement btnA = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		btnA.click();
		
		Alert a = driver.switchTo().alert();
		a.sendKeys("kumar");
		a.accept();
		WebElement B = driver.findElement(By.xpath("//p[text()='Hello kumar How are you today']"));
		String D = B.getText();
		System.out.println(D);
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
