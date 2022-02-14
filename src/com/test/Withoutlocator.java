package com.test;

import java.awt.AWTException;
import java.awt.Event;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Withoutlocator {

	public static void main(String[] args) throws AWTException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikandan\\eclipse-workspace\\SeleneiumDay2\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		Robot robot = new Robot ();
		
		for (int i = 0; i < 3; i++) {
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		}
		
		robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_K);
		
		robot.keyRelease(KeyEvent.VK_K);
		
		robot.keyRelease(KeyEvent.VK_SHIFT);
		
		
			
			
		robot.keyPress(KeyEvent.VK_U);
        
		robot.keyRelease(KeyEvent.VK_U);
		
         robot.keyPress(KeyEvent.VK_M);
        
		robot.keyRelease(KeyEvent.VK_M);
		
		
			
			
			
			
			
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}


