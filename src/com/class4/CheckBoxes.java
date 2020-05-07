package com.class4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class CheckBoxes {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		// System.setProperty("webdriver.chrome.silentOutput", "true");

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.seleniumeasy.com/test/basic-checkbox-demo.html";
		driver.get(url);
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
		
		for(WebElement list: checkboxes) {
			list.click();
			Thread.sleep(2000);
		}
		
		driver.quit();
	}
}
