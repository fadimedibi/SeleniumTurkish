package com.class4;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class FindElements {
	public static void main(String[] args) {
		
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

	// System.setProperty("webdriver.chrome.silentOutput", "true");

	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://ebay.com";
	driver.get(url);

	List<WebElement> ebayLinkLists=driver.findElements(By.tagName("a"));
	
	System.out.println("Size of the links: "+ebayLinkLists.size());
	
	for(int i=0; i<ebayLinkLists.size(); i++) {
		String linkText= ebayLinkLists.get(i).getText();
		if(!linkText.isEmpty()) {
		System.out.println(linkText);
		}
	
	}
	driver.close();
	
	
	
	}
}
