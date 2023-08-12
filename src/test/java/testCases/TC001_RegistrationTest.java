package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.RegistrationPage;
import testBase.BaseClass;



public class TC001_RegistrationTest extends BaseClass{

	
	@Test
	void loginTest() {
		
		logger.info("TC001_Registration Test Started");
		RegistrationPage rp=new RegistrationPage(driver);
		rp.clickMyAccount();
		rp.clickRegister();
		
		logger.info("Test Case successfully executed");
		
	}
	
	
}
