package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Core.commonFunctions;
import Core.testBase;

public class workOrderPage extends testBase{

	commonFunctions objcommon = new commonFunctions();
	
		
	public workOrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public By linkWO = By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul[@class='nav navbar-nav']/li[2]/a[@href='/hemsweb/Workord/Index']");
	public By imgAddWO = By.xpath("/html//section[@id='hemstoolbar']//img[@alt='Add New']");
	public By selectDepartment = By.cssSelector("[data-role='tabstrip'] #dptname");
	//public By departmentList = By.cssSelector("body > ul:nth-of-type(2)");
	public By departmentList = By.cssSelector("body .ui-front:nth-child(25)");
	
	public void clickWO() {
		objcommon.click(linkWO);
		objcommon.ThreadSleep(3000);
	}
	
	public void clickaddWO() {
		objcommon.click(imgAddWO);
		objcommon.ThreadSleep(3000);
	}
	
	public void selectDepartment() {
		objcommon.addSpace(selectDepartment);
		objcommon.ThreadSleep(3000);
		objcommon.selectListValue(departmentList);
		objcommon.ThreadSleep(3000);
		
		
	}
	
}
