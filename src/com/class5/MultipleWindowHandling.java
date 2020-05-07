package com.class5;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class MultipleWindowHandling {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
		driver.get(url);

		driver.findElement(By.linkText("Alerts & Modals")).click();
		driver.findElement(By.linkText("Window Popup Modal")).click();

		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();

		Thread.sleep(3000);

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> handleIt = handles.iterator();

		String mainWindow = handleIt.next();

		String popup1 = handleIt.next();

		String popup2 = handleIt.next();

		String mainTitle = driver.getTitle();

		driver.switchTo().window(popup1);
		String popup1Tittle = driver.getTitle();

		driver.switchTo().window(popup2);
		String popup2Tittle = driver.getTitle();

		System.out.println(mainTitle);
		System.out.println(popup1Tittle);
		System.out.println(popup2Tittle);

		Thread.sleep(3000);
		driver.quit();
	}
}
