package testcases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testbase.BaseClass;

public class TC_002LoginTest extends BaseClass {

@Test	
public void loginTestcase() {
	
	logger.info("Starting Lpogin Test CAses");
	HomePage hp=new HomePage(driver);
	
	hp.clickOnMyacc();
	
	hp.clickOnLogin();
	;
	LoginPage lp=new LoginPage(driver);
	lp.userName(null);
	lp.userpassword(null);
	
}	
	
	
	
	
	
	
}
