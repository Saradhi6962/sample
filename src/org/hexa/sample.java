package org.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	
	
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\adhid\\eclipse-workspace\\Sample\\driv\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("saran");
		Thread.sleep(3000);
	
		
	}

}
