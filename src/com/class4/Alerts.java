package com.class4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
			
			
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

			// System.setProperty("webdriver.chrome.silentOutput", "true");

			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			String url = "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html";
			driver.get(url);
			driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
			Thread.sleep(2000);
			Alert alert=driver.switchTo().alert();
			String  alertVal= alert.getText();
			System.out.println(alertVal);
			Thread.sleep(2000);
			alert.accept();
			driver.quit();
		
			
			
			
		}
	}


