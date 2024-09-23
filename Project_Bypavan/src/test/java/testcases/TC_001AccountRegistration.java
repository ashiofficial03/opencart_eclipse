package testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testbase.BaseClass;

public class TC_001AccountRegistration extends BaseClass {

@Test
public void verifyregisteraccount() {
	logger.info("Starting the Test Case");
	HomePage hp=new HomePage(driver) ;
	hp.clickOnMyacc();
	logger.info("Clicking on MyAccount");
	hp.clickOnRegister();
	logger.info("Clicking on Register");
	AccountRegistrationPage regpage=new AccountRegistrationPage(driver);{
		regpage.firstName(randomstring());
		regpage.lastName(randomstring());
		regpage.email(randomstring()+"@"+randomstring()+".com");
		regpage.phonenumber(randomnumber());
		String pass=randomnAphanumeric();

		regpage.passWord(pass);
		regpage.ConfirmpassWord(pass);
		regpage.checkBox();
		regpage.Continue();
	String confmsg=regpage.Confirmatiom();
	Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		
		}
}
}