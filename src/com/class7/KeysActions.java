package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;

public class KeysActions extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", "https://opensource-demo.orangehrmlive.com/");

		WebElement userN = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.name("txtPassword"));

		Actions act = new Actions(driver);

		act.keyDown(Keys.SHIFT).click(userN).sendKeys("hello").perform();

		password.sendKeys("merhaba", Keys.SHIFT);
		driver.quit();
		

	}
}
