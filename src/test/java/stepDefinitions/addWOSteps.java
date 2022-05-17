package stepDefinitions;

import Core.commonFunctions;
import Core.testBase;
import io.cucumber.java.en.Then;
import pageObjects.workOrderPage;

public class addWOSteps extends testBase {

	workOrderPage objWO = new workOrderPage();
	commonFunctions objcommon = new commonFunctions();
	
	
	@Then("Click WO link")
	public void click_wo_link() {
	    objWO.clickWO();
	}
	@Then("Click Add Work Order link")
	public void click_add_work_order_link() {
	    objWO.clickaddWO();
	}
	
	@Then("Select Department")
	public void select_department() {
	 objWO.selectDepartment();
	}

	
}
