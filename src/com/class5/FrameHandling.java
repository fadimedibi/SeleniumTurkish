package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class FrameHandling {
	/* TC 1: Syntax Frame verification
	1. Open chrome browser
	2. Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
	3. Click on “Others” link
	4. Click on “Iframe” link
	5. Click on the “Home” link inside the frame one
	6. Verify “Syntax logo” is displayed in another frame
	7. Quit browser */
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		// System.setProperty("webdriver.chrome.silentOutput", "true");

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
		driver.get(url);
		
		driver.findElement(By.linkText("Others")).click();
		
		driver.findElement(By.linkText("Iframe")).click();
		
		Thread.sleep(15000);
		driver.switchTo().frame("FrameOne");
		
		driver.findElement(By.linkText("Home")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(15000);
		
		WebElement frameTwo=driver.findElement(By.xpath("//iframe[@name='FrameTwo']"));
		driver.switchTo().frame(frameTwo);
		
		WebElement logo=driver.findElement(By.xpath("//a[@class='custom-logo-link']"));
		
		boolean isLogoDisplayed=logo.isDisplayed();
		
		if(isLogoDisplayed) {
			System.out.println("Test PASS");
		}else {
			System.out.println("Test FAIL");
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
