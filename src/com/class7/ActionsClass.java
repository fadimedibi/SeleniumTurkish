package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;

public class ActionsClass extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", "https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");

		// lets pretend click is not working
		// driver.findElement(By.className("button")).click();

		// to perform mouse and keybord operations:
		// Use Actions class to login

		Actions act = new Actions(driver);
		WebElement loginBtn = driver.findElement(By.className("button"));

		// right click
		//	act.moveToElement(loginBtn).contextClick().perform();

		// double click
		// act.moveToElement(loginBtn).doubleClick().perform();

		// click
		act.moveToElement(loginBtn).click().perform();
		Thread.sleep(2000);

		// hover over

		WebElement leave = driver.findElement(By.linkText("Leave"));
		WebElement leaveList = driver.findElement(By.linkText("Leave List"));

//	act.moveToElement(leave).click().perform();

		Thread.sleep(2000);
//	act.moveToElement(leaveList).click().perform();

		WebElement pim = driver.findElement(By.linkText("PIM"));
		WebElement addEmp = driver.findElement(By.linkText("Add Employee"));
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement middleName = driver.findElement(By.id("middleName"));

		Thread.sleep(2000);
		act.moveToElement(pim).click().perform();
		Thread.sleep(2000);
		act.moveToElement(addEmp).click().perform();

		driver.quit();

	}

}
