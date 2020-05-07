package com.class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.utils.CommonMethods;

public class AlertPopUpsRecap extends CommonMethods{
public static void main(String[] args) throws InterruptedException {
		
		/* UnhandledAlertException: Modal dialog present
		 * 
		 * Alert alert=driver.switchTo().alert();
		 * 
		 * 	alert.accept();
		 * 	alert.dismiss();
		 * 	alert.getText();
		 * 	alert.sendKeys();
		 */
		
		/* TC 1: JavaScript alert text verification
		1. Open chrome browser
		2. Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
		3. Click on “Alerts & Modals” links
		4. Click on “Javascript Alerts” links
		5. Click on button in “Java Script Alert Box” section
		6. Verify alert box with text “I am an alert box!” is present
		7. Click on button in “Java Script Confirm Box” section
		8. Verify alert box with text “Press a button!” is present
		9. Click on button in “Java Script Alert Box” section
		10. Enter text in the alert box
		11. Quit browser */

		// From Mr. Hasan's Common Methods (IMPORTANT. Common Methods class is in utils package!!!)
		setUp("chrome", SELENIUM_TEST);
		
		driver.findElement(By.linkText("Alerts & Modals")).click();
		driver.findElement(By.linkText("Javascript Alerts")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
		Thread.sleep(1000);
		
		Alert alert=driver.switchTo().alert();
		String alertBoxText=alert.getText();
		
		System.out.println(alertBoxText);
		
		String name="John Smith";
		alert.sendKeys(name);
		
		alert.accept();
		
		WebElement promptMsg=driver.findElement(By.id("prompt-demo"));
		
		String msg=promptMsg.getText();
		
		if(msg.contains(name)) {
			System.out.println("Test PASS");
		}else {
			System.out.println("Test FAIL");
		}
		
		Thread.sleep(3000);
		driver.quit();		
	}
}
