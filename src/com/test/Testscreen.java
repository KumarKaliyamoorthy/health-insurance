package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscreen {

	public static void main(String[] args) throws IOException, Exception {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikandan\\eclipse-workspace\\Seleneiumday5\\driver\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();		
		
		driver.get("https://toolsqa.com/");
	
		WebElement Element = driver.findElement(By.className("learner"));
		Thread.sleep(3000);
		File S= Element.getScreenshotAs(OutputType.FILE);
		File file = new File ("C:\\Users\\manikandan\\Pictures\\kumar\\absraction//kumar");
		FileUtils.copyFile(S, file);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
