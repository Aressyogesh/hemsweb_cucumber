package pageObjects;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Core.commonFunctions;
import Core.testBase;
import pageData.loginData;

public class LoginPage extends testBase {

	commonFunctions objcommon = new commonFunctions();
	loginData objlogin = new loginData();
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public static By txtuserName = By.xpath("/html//input[@id='UserName']");
	public static By txtpassword = By.xpath("/html//input[@id='Password']");
	public static By btnLogin = By.xpath("//section[@id='loginForm']/form[@role='form']//input[@value='Log in']");
	public static By linkLogout = By.linkText("Log off");
	public static By errorMessage = By.xpath("//section[@id='loginForm']/form[@role='form']//li[.='Invalid username or password.']");
			
	
	public void setUsername() {
		objcommon.clearText(txtuserName);
		objcommon.setText(txtuserName, objlogin.textusername);
		objcommon.ThreadSleep(3000);
		
	}
	
	public void setUsername(String username) {
		objcommon.clearText(txtuserName);
		objcommon.setText(txtuserName, username);
		objcommon.ThreadSleep(3000);
		
	}
	
	public void setPassword() {
		objcommon.clearText(txtpassword);
		objcommon.setText(txtpassword , objlogin.textpassword);
		objcommon.ThreadSleep(3000);
	}
	
	public void setPassword(String password) {
		objcommon.clearText(txtpassword);
		objcommon.setText(txtpassword , password);
		objcommon.ThreadSleep(3000);
	}
	
	
	public void clickLogin() {
		objcommon.click(btnLogin);
		objcommon.ThreadSleep(3000);
	}
	
	public void errMessage(String errmessage) {
		String errmsg= objcommon.getText(errorMessage);
		Assert.assertEquals(errmessage, errmsg);
	}
	
	public void verify_dashboardPageTitle(String actualdashboardPageTitle) {
		// System.out.println(objwrapper.getPageTitle());
		actualdashboardPageTitle = objcommon.getPageTitle();
		assertEquals(objlogin.dashboardPageTitle, actualdashboardPageTitle);
	}
	
	public void clickLogout() {
		objcommon.click(linkLogout);
		objcommon.ThreadSleep(5000);
	}
	
	public void verify_loginPageTitle(String actualloginPageTitle) {
		
		actualloginPageTitle = objcommon.getPageTitle();
		assertEquals(objlogin.loginPageTitle, actualloginPageTitle);
	}
	public void quitBrowser() {
		objcommon.quitBrowser();
	}
}
