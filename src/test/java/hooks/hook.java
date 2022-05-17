package hooks;


import Core.testBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hook extends testBase {
	testBase objtestbase = new testBase(); 

	@Before
	public void setup() {
		//System.out.println("Before Scenario");
		objtestbase.setUp();
	}
	
	@After
	public void tearDown() throws Exception {
		//System.out.println("After Scenario");
		objtestbase.tearDown();
		
	}
}
