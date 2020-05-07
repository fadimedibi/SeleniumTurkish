package com.class4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

	// System.setProperty("webdriver.chrome.silentOutput", "true");

	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html";
	driver.get(url);
	
	// 1. single DropDown  (select only one)
	// If there is a select tag, Use select class
	
	WebElement days= driver.findElement(By.id("select-demo"));
	Select select= new Select(days);
	
	// Select class allows us to use the dd in 3 ways
	//1. Select By index
	//2. Select by visible Text
	//3. select value (Attribute)
	
	// getOptions()
	List<WebElement> optionsOfDays= select.getOptions();
	System.out.println(optionsOfDays.size());
	
	Thread.sleep(2000);
	select.selectByIndex(3);  // Tuesday
	Thread.sleep(2000);
	select.selectByVisibleText("Thursday"); //Thursday
	Thread.sleep(2000);
	select.selectByValue("Friday"); // Friday
	
	//isMultiple()
	
	boolean isDayMultiple= select.isMultiple(); // True: multiple, False: single
	System.out.println(isDayMultiple);
	
	// de selecting is not allowed
	
	
	// 2. single DropDown  (can select more than one)
	
	driver.quit();
	
	
}
}
