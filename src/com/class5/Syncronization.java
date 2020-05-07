package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class Syncronization extends CommonMethods {

	/*	It is the process of matching the speed of action and reaction.
	Selenium does the action and web application shows the reaction. 
	We cannot alter the speed of the application, so we must slow down selenium 
	
	● pageLoadTimeout	--> to prevent TimeOutException exception
						--> applicable only to driver.get() and driver.navigate().to() methods
						--> Page load timeout is not applicable when user clicks a link to open a page.
	
				--> driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	There are two types of wait Selenium provides
		● ImplicitWait
			-- will tell driver to wait until specified time before throw NoSuchElementException
			-- It work with .findElement() & .findElements()
			
			-- It implicitly wait for everyelement in your program.
			-- If element is found within 2 seconds--> rest of time will be ignored
			-- if not found program will wait specified amount of time and ONLY then throw NoSuchElementException
			
			--	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
		● ExplicitWait
			-	WebdriverWait
				-- used for specific element
				-- If there any slow elements in your application we do not want to increase implicit wait , 
			so for that particular element we can call explicit wait Explicit wait works with ExpectedConditionsClass 
			and wait until condition becomes true or max amount of time is reached
​
				-- What type expectedconditions we have?
					-- visibilityOfTheElement - wd will wait until element 		becomes visible
					-- elementToBeClickable  - wd will wait until element 		becomes clickable
					-- elementToBeSelected  - wd will wait until element 	becomes selected
					-- textToBePresentInElement()	- waits for an element to have particular text,
													- after finding the specified text selenium moves to the next li
					-- alertIsPresent()		-- waits for an alert to be present	
					
				--	WebDriverWait wait = new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.visibilityOfElementLocated (By.id("statedropdown")));
​
					
			-	FluentWait
					-- define the maximum amount of time to wait for a specific condition and frequency with 
				which to check the condition before throwing an “ElementNotVisibleException” exception.
				
					-- when we have web elements which sometimes visible in few seconds and 
				sometimes take more time than usual.
				
					-- Mainly in Ajax applications. We could set the default polling period based on our requirement. 
				We could ignore any exception while polling an element.
				
					--	FluentWait wait = new FluentWait(driver);
						wait.withTimeout(45, TimeUnit.SECONDS);
						wait.pollingevery(5, TimeUnit.SECONDS);
						wait.ignoring(NoSuchElementException.class);
			
			-- When we have implicit and explicit waits:
			* first - implicit wait will be applied then
			* second - explicit wait will be executed
	*/

public static void main(String[] args) throws InterruptedException {
	
	setUp("chrome", JIRAVM_URL);
	
	driver.findElement(By.linkText("Alerts & Modals")).click();
	
	driver.findElement(By.linkText("Javascript Alerts")).click();
	
	WebElement alertBoxButton=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
	
	WebDriverWait wait=new WebDriverWait(driver, 10);
	
	wait.until(ExpectedConditions.elementToBeClickable(alertBoxButton));
	
	alertBoxButton.click();
	
	Thread.sleep(3000);
	
		driver.quit();
	}

}
