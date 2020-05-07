package com.class5;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class WindowsHandling {
	/* TC 1: Windows Handling
	1. Open chrome browser
	2. Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
	3. Click on “Javascript Alerts” link
	4. Click on “Window Popup Modal” link
	5. Click on the “ Follow On Instagram” button
	6. Verify title of the page is “Syntax Technologies (@syntaxtechs) • Instagram photos and videos”
	7. Click on the “Like us On Facebook ” button
	8. Verify title of the page is “Go to Facebook Home”
	9. Quit the browser
		NOTE: Selenium execution could be too fast, please use
				Thread.sleep */
	
	public static void main(String[] args) throws InterruptedException {
		
	//	setUp("chrome", JIRAVM_URL);
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
		driver.get(url);
		
		
		driver.findElement(By.linkText("Alerts & Modals")).click();
		driver.findElement(By.linkText("Window Popup Modal")).click();
		
		String mainPageHandle=driver.getWindowHandle();
		
		System.out.println(mainPageHandle);
		
		driver.findElement(By.linkText("Follow On Instagram")).click();
		
		Thread.sleep(5000);
		Set<String> handles=driver.getWindowHandles();
		
//		int i=1;
//		for(String handle:handles) {
//			System.out.println("Window "+i+" : "+handle);
//			i++;
//		}
		
		Iterator<String> handleIt=handles.iterator();
		String window1=handleIt.next();
		String window2=handleIt.next();
		
		driver.switchTo().window(window2);
		
		String expTittle="Syntax Technologies (@syntaxtechs) • Instagram photos and videos";
		
		String actTittle=driver.getTitle();
		
		System.out.println(actTittle);
		
		if(expTittle.equals(actTittle)) {
			System.out.println("Popup window tittle test PASS");
		}else {
			System.out.println("Popup window tittle test FAIL");
		}
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
