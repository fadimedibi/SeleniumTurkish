package com.class1;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 {

	public static void main(String[] args) {
	
		
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	String url="http://google.com";
//	driver.get(url);
	
//	driver.get("http://google.com");
//	
//	String currentUrl= driver.getCurrentUrl();
//	System.out.println("Current URL :" + currentUrl);
//	
//		
//	String title= driver.getTitle();
//	System.out.println("title: "+title);
//	
//	if(title.equalsIgnoreCase("gooooogle")) {
//		System.out.println("expected and actual title match");
//	}else {
//		System.out.println("expected and actual title does NOT match");
//	}
//	driver.close();
//	// driver.quit();
		

	driver.navigate().to(url);
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	
	}

}
