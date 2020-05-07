package com.class4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class RadioButton {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		// System.setProperty("webdriver.chrome.silentOutput", "true");

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.seleniumeasy.com/test/basic-radiobutton-demo.html";
		driver.get(url);
		
		List<WebElement> radioGender=driver.findElements(By.xpath("//input[@name='optradio']"));
		System.out.println(radioGender.size());
		Thread.sleep(2000);
		for (int i = 0; i < radioGender.size(); i++) {
		String valueGen=radioGender.get(i).getAttribute("value");

		if(valueGen.equalsIgnoreCase("Male")) {
			radioGender.get(i).click();
			Thread.sleep(2000);
		}
			
		}
		driver.quit();
}
}
