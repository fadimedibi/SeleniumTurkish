package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		// Set the property of Chrome Driver
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		//Instantiate an instance of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		// navigating the desired URL
		String url="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		
		driver.get(url);
		
		//Locators
		
		//1. id (1st preference)
		
	//	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//2. name
		
//		WebElement password= driver.findElement(By.name("txtPassword"));
//		password.sendKeys("admin123");
		
		//3. className
		
//		driver.findElement(By.className("button")).click();
		
		//4.linkText (only for links)
		
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Welcome Admin")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.linkText("Logout")).click();
		
		//5. PartialLinkText
		
//		Thread.sleep(3000);
//		driver.findElement(By.partialLinkText("Welcome")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.linkText("Logout")).click();
		
		// 6. tagName
		
		// 7. XPath
		
		//a. Absolute XPath(Native) "/" slash ile baslar
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");
		
		//b. Relative XPath  "//" slashes ile baslar
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		
		//8. cssSelector
		driver.findElement(By.cssSelector("input[class='button']")).click(); //input.button
	
		
		
	}

}
