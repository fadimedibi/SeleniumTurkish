package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://ebay.com/");

		// XPath

		// driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Insan Ne Ile
		// Yasar");

		// driver.findElement(By.xpath("//input[@class='gh-tb
		// ui-autocomplete-input']")).sendKeys("Insan Ne Ile Yasar");

		// 1. contains()
		// driver.findElement(By.xpath("//input[contains(@class,'gh-tb')]")).sendKeys("Sefiller");

		// 2. starts-with

		// id= test_123
		// id= test_1234
		// id= test_12345
		// id= test_12233

		driver.findElement(By.xpath("//input[starts-with(@class,'gh-tb')]")).sendKeys("Sefiller");

		// 3. ends-with
		// id= atest_123
		// id= asabtest_123
		// id= ctest_123
		// id= dtest_123
		// driver.findElement(By.xpath("//input[ends-with(@id,'test_123')]")).sendKeys("Sefiller");

		// 4. text() for link
		// driver.findElement(By.xpath("//a[text()=' My eBay']")).click();

		// contains + text

		// driver.findElement(By.xpath("//a[contains(text(),' My eBay')][1]")).click();

		driver.findElement(By.xpath("//a[contains(.,' My eBay')][1]")).click();

		driver.close();
		
		
		
	//	css selector
	
		// attribute name :   id= #
		// attribute name :   class= .
		
		// css functions
		
		// contains	: *
		// starts-with : ^
		// ends-with :	$
		
		// css example : input[id='u_0-q'] -------> input # u_0-q
		// 				 input[id*='u_']
		// 					
	}

}
