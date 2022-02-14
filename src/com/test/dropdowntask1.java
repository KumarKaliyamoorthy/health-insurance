package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowntask1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikandan\\eclipse-workspace\\SeleneiumDay2\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/SearchHotel.php");
		WebElement txt = driver.findElement(By.xpath("Existing User Login - Build 1"));
	
		WebElement A = driver.findElement(By.id("username"));
		A.sendKeys("aravi251291");
		WebElement B = driver.findElement(By.id("password"));
		B.sendKeys("aravi251291");
	
		WebElement C = driver.findElement(By.id("login"));
		C.click();
		WebElement element = driver.findElement(By.id("location"));
		Select select=new Select (element);
		select.selectByIndex(1);
	
				
		WebElement a = driver.findElement(By.id("hotels"));
		Select select1 = new Select(a);
		select1.selectByIndex(2);
		
		
		WebElement b= driver.findElement(By.id("room_type"));
		Select select2 = new Select(b);
		select2.selectByIndex(2);
		
		
		WebElement c= driver.findElement(By.id("room_type"));
		Select select3 = new Select(c);
		select3.selectByIndex(4);
	
		
		
		WebElement d= driver.findElement(By.id("adult_room"));
		Select select4 = new Select(d);
		select4.selectByIndex(2);
	
		
		WebElement e= driver.findElement(By.id("child_room"));
		Select select5 = new Select(e);
		select5.selectByIndex(2);
	
		WebElement f = driver.findElement(By.id("datepick_in"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].setAttribute('value','11/11/2021')",f);
		
		
		WebElement g = driver.findElement(By.id("datepick_out"));
		JavascriptExecutor exe =(JavascriptExecutor)driver;
		exe.executeScript("arguments[0].setAttribute('value','20/12/21')",g);
		
		
		WebElement h= driver.findElement(By.id("Submit"));
		h.click();
		
		
		WebElement l= driver.findElement(By.id("radiobutton_0"));
		l.click();
		
		WebElement m= driver.findElement(By.id("continue"));
		m.click();
		WebElement n= driver.findElement(By.id("first_name"));
		n.sendKeys("kumar");
		
		WebElement o= driver.findElement(By.id("last_name"));
		o.sendKeys("kumar");
		
		
		WebElement p= driver.findElement(By.id("address"));
		p.sendKeys("sysdney");
		
		
		WebElement q= driver.findElement(By.id("cc_num"));
		q.sendKeys("1234567891234121");
		
		WebElement x= driver.findElement(By.id("cc_cvv"));
		x.sendKeys("1234567891234512");
		
		
		
		WebElement y = driver.findElement(By.id("cc_type"));
		Select select7= new Select(y);
		select7.selectByIndex(4);
	
		
		
		WebElement z = driver.findElement(By.id("cc_exp_month"));
		Select select8= new Select(z);
		select8.selectByIndex(2);
	
		Thread.sleep(3000);
		
		WebElement a1= driver.findElement(By.id("cc_exp_year"));
		Select select10= new Select(a1);
		select10.selectByIndex(12);
	
		
		WebElement b1= driver.findElement(By.id("book_now"));
		
		b1.click();
		
		
		
		WebElement elements = driver.findElement(By.id("order_no"));
		String data = elements.getAttribute("value");
		System.out.println(data);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
