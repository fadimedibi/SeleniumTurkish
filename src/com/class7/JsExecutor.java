package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;

public class JsExecutor extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", "https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");

		WebElement loginBtn = driver.findElement(By.className("button"));

		// Lets pretend click is not working
		// driver.findElement(By.className("button")).click();

		// to click we need JSExecutor interface in Selenium

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// highlighting
		js.executeScript("arguments[0].style.backgroundColor='Purple'", loginBtn);

		Thread.sleep(3000);

		// click
		js.executeScript("arguments[0].click();", loginBtn);

		// we can scroll up and down
		js.executeScript("window.scrollBy(0,25000)");
		driver.quit();

	}

}
