package stepDefinitions;

import org.junit.Assert;

import Core.commonFunctions;
import Core.testBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class loginSteps extends testBase {

	LoginPage objlogin = new LoginPage();
	commonFunctions objcommon = new commonFunctions();
	
	
	@When("User enters Username")
	public void user_enters_username() {
	   objlogin.setUsername();
	}
	
	@When("^User enters Username (.*)$")
	public void enters_username_invalid(String username) {
		objlogin.setUsername(username);
	}
	@When("^User enters Password (.*)$")
	public void enters_password_super(String password) {
		objlogin.setPassword(password);
	}


	@When("User enters Password")
	public void user_enters_password() {
	   objlogin.setPassword();
	}

	@When("Click on Login")
	public void click_on_login() {
	    objlogin.clickLogin();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) throws Exception {
	    if (objcommon.getPageSource().contains("Invalid username or password.")) {
	    	tearDown();
	    	Assert.assertTrue(false);
	    }else {
	    	Assert.assertEquals(title, objcommon.getPageTitle());
	    }
	}
	
	@Then("^Error Message should be (.*)$")
	public void display_error_message(String errmessage) {
		objlogin.errMessage(errmessage);
	}


	@When("User click on Logout link")
	public void user_click_on_logout_link() {
	   objlogin.clickLogout();
	}

	
	/*
	 * @Then("Close Browser") public void close_browser() throws Exception {
	 * tearDown(); }
	 */
	@Given("User enters {string}")
	public void user_enters(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
}
