package Core;

import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class commonFunctions extends testBase {
	
	public testBase objtestBase = new testBase();
	
	public void waitForElementPresence(By locator, int waitInSeconds) 
	{
		try 
		{
			WebDriverWait wait = (WebDriverWait) new WebDriverWait(objtestBase.getDriver(), waitInSeconds).ignoring(StaleElementReferenceException.class);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} 
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}

	public void quitBrowser() {
		objtestBase.getDriver().quit();
		

	}
	
	public boolean brokenLink() {
		
		/*List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = links.iterator();
		String url = it.next().getAttribute("href");
		if(url == null || url.isEmpty()){
            System.out.println("URL is either not configured for anchor tag or it is empty");continue;
        }*/
		return false;
		
	}
	
	public void selectListValue(By locator) {
		waitForElementPresence(locator, 10);
		WebElement webElement = objtestBase.getDriver().findElement(locator);
		try
		{
			// replace the text
			List <WebElement> listings = driver.findElements(By.cssSelector("body .ui-front:nth-child(25)"));
			//System.out.println(listings.size());
			
			for (WebElement element: listings) {
			     // System.out.println(element.getText());
			      Random r = new Random();
			      int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
			      listings.get(randomValue).click(); //Clicking on the random item in the list.
			
			}
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			
		}
		
	}
	
	public boolean addSpace(By locator) {
		waitForElementPresence(locator, 10);
		WebElement webElement = objtestBase.getDriver().findElement(locator);
		try
		{
			// replace the text
			JavascriptExecutor executor = (JavascriptExecutor)objtestBase.getDriver();
			executor.executeScript("arguments[0].click();", webElement);
			webElement.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			webElement.sendKeys(Keys.DELETE);
			webElement.clear();
			webElement.sendKeys(Keys.SPACE);
			return true;
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
		
	}
	
	public String  getPageTitle() 
	{
		 return objtestBase.getDriver().getTitle();
		
	}
	public String getText(By locator) {
		waitForElementPresence(locator, 10);
		WebElement webElement = objtestBase.getDriver().findElement(locator);
		return webElement.getText();
	}
	
	public Actions doubleClick(By locator) {
		waitForElementPresence(locator, 10);
		Actions action = new Actions((WebDriver) objtestBase.getDriver().findElement(locator));
		action.doubleClick().build().perform();
		return action;
	}
	
	public Actions clickAndHold(By locator) {
		waitForElementPresence(locator, 10);
		Actions action = new Actions((WebDriver) objtestBase.getDriver().findElement(locator));
		action.clickAndHold().build().perform();
		return action;
	}
	
	/*
	 * public Actions dragAndDrop(By locator) { waitForElementPresence(locator, 10);
	 * Actions action = new Actions((WebDriver)
	 * objtestBase.getDriver().findElement(locator)); action.dragAndDrop(null,
	 * null); return action; }
	 */
	
	/*
	 * public Actions moveToElement(By locator) { waitForElementPresence(locator,
	 * 10); Actions action = new Actions((WebDriver)
	 * objtestBase.getDriver().findElement(locator)); action.moveToElement(locator,
	 * 0, 0); return action; }
	 */
public Actions rightClick(By locator) {
	waitForElementPresence(locator, 10);
	Actions action = new Actions((WebDriver) objtestBase.getDriver().findElement(locator));
	action.contextClick().build().perform();
	return action;
	
}
	
	
	public String getPageSource()
	{
		return objtestBase.driver.getPageSource();
	}
	
	public boolean clearText(By locator) 
	{
		waitForElementPresence(locator, 10);
		WebElement webElement = objtestBase.getDriver().findElement(locator);
		try
		{
			// replace the text
			JavascriptExecutor executor = (JavascriptExecutor)objtestBase.getDriver();
			executor.executeScript("arguments[0].click();", webElement);
			webElement.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			webElement.sendKeys(Keys.DELETE);
			webElement.clear();
			return true;
		} 
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}
	
	
	public boolean setText(By locator, String fieldValue) 
	{
		waitForElementPresence(locator, 10);
		WebElement webElement = objtestBase.getDriver().findElement(locator);
		try
		{
			// replace the text
			JavascriptExecutor executor = (JavascriptExecutor)objtestBase.getDriver();
			executor.executeScript("arguments[0].click();", webElement);
			webElement.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			webElement.sendKeys(Keys.DELETE);
			webElement.clear();
			webElement.sendKeys(fieldValue);
			//webElement.sendKeys(Keys.TAB);
			return true;
		} 
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}
	
	public void click(WebElement locator) {
		// waitForElementPresence(locator, 10);
		// WebElement webElement = objStepBase.getDriver().findElement(locator);
		locator.click();

	}
	
	public boolean click(By locator) 
	{
		waitForElementPresence(locator, 10);
		WebElement webElement = objtestBase.getDriver().findElement(locator);
		try
		{
			JavascriptExecutor executor = (JavascriptExecutor)objtestBase.getDriver();
			executor.executeScript("arguments[0].click();", webElement);
			return true;
		} 
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}
	
	public void ThreadSleep(int millisecond)
	{
		try 
		{
			Thread.sleep(millisecond);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	
	

	
	
}
