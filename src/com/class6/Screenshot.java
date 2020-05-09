package com.class6;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class Screenshot extends CommonMethods {
	public static void main(String[] args) {

		setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		

		
		
		driver.findElement(By.className("button")).click();

		String userName = "Admin";

		String welcomeText = driver.findElement(By.id("welcome")).getText();
		if (welcomeText.contains(userName)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("test Failed");
		}

		// lets take a screenshot of the test case

		// 1. Downcast the driver to TakesScreenShot

		TakesScreenshot ts = (TakesScreenshot) driver;

		// 2. getScreenshotAs() outputType
		File screen = ts.getScreenshotAs(OutputType.FILE);

		// 3. FileUtils library

		try {
			FileUtils.copyFile(screen, new File("screenshots/ORANGE/ValidLogin.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
