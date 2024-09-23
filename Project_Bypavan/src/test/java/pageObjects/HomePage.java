package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
@FindBy(xpath="//a[@title='My Account']") WebElement Myaccount;
@FindBy(xpath="//a[normalize-space()='Register']") WebElement Register;
@FindBy(xpath="//a[normalize-space()='Login']") WebElement Login;
public void clickOnMyacc() {
	Myaccount.click();
}
public void clickOnRegister() {
	Register.click();
}
public void clickOnLogin() {
	Login.click();
}
}