package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class WebElementCommands {

	public static void main(String[] args) {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		// System.setProperty("webdriver.chrome.silentOutput", "true");

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";

		driver.get(url);

		// sendKeys()

		WebElement userName= driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");

		// clear()
		userName.clear();
		userName.sendKeys("Hello");

		// isDisplayed()

//		boolean loginBtnDisp = driver.findElement(By.id("btnLogin")).isDisplayed();
//		System.out.println(loginBtnDisp);

		// isEnabled()
		
//		boolean loginBtnenabled = driver.findElement(By.id("btnLogin")).isEnabled();
//		System.out.println(loginBtnenabled);
//		
//		// isSelected()
//		
//		boolean loginBtnSelected= driver.findElement(By.id("btnLogin")).isSelected();
//		System.out.println(loginBtnSelected);
		
		// getText() visible text
		
		
		driver.findElement(By.id("btnLogin")).click();
		String errorMsg= driver.findElement(By.id("spanMessage")).getText();
		System.out.println(errorMsg);
		
		if(errorMsg.equalsIgnoreCase("Vous devez remplir le champ Mot de passe")) {
			System.out.println("Correct message displayed");
		}else {
			System.out.println("Wrong message displayed");
		}
		
		// getAttribute() 
		
		String loginValue= driver.findElement(By.id("btnLogin")).getAttribute("value");
		
		System.out.println(loginValue);
		
		//FindElement vs FindElements
		//radio button- check box
		//drop downs
		//webtable
		
		// submit()
		
		
		
		
		
		
	}

}
