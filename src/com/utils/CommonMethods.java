package com.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {
public static WebDriver driver;
	
	public static final String FACEBOOK_URL="https://www.facebook.com/";
	public static final String  MERCURY_TOURS_URL="http://newtours.demoaut.com/";
	
	public static final String HRMS_URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";	
	public static final String HRMS_USERNAME="Admin";
	public static final String HRMS_PASSWORD="Hum@nhrm123";
	
	public static final String CHROME_DRIVER_FILEPATH="drivers/chromedriver.exe";
	public static final String GECKO_DRIVER_FILEPATH="drivers/geckodriver.exe";
	
	public static final String JIRAVM_URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static final String AMAZON_URL="https://www.amazon.com/";
	public static final String SELENIUM_TEST="https://www.seleniumeasy.com/test/";
	
	public static void setUp(String browser, String URL) {		
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}else {
			System.out.println("Invalid browser type");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30,  TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		
		driver.get(URL);
	}
	
	public static void sendText(String locatorType, String locator, String str) {
		WebElement element = null;
		locatorType=locatorType.toLowerCase();
		
		switch (locatorType) {
		case "xpath":
			element=driver.findElement(By.xpath(locator));
			break;
			
		case "id":
			element=driver.findElement(By.id(locator));
			break;
			
		case "classname":
			element=driver.findElement(By.className(locator));
			break;	
		
		case "name":
			element=driver.findElement(By.name(locator));
			break;
			
		case "tagname":
			element=driver.findElement(By.tagName(locator));
			break;
			
		case "linktext":
			element=driver.findElement(By.linkText(locator));
			break;
			
		case "partiallinktext":
			element=driver.findElement(By.partialLinkText(locator));
			break;
			
		case "css":
			element=driver.findElement(By.cssSelector(locator));
			break;
		default:
			System.out.println("Invalid value");
			break;
		}
		element.sendKeys(str);
	}
	

}
