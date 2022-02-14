package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screensshott {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikandan\\eclipse-workspace\\Seleneiumday5\\driver\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();		
		
		driver.get("https://www.moneycontrol.com/markets/fno-market-snapshot");
		
		WebElement A = driver.findElement(By.id("data_1_1"));
		File B = A.getScreenshotAs(OutputType.FILE);
		
		File file = new File("C:\\Users\\manikandan\\Pictures\\Invitation Card Maker E-cards  Digital invites//output.png");
		FileUtils.copyFile(B,file);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
