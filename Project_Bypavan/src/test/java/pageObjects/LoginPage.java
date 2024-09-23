package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	
@FindBy(xpath="//input[@id='input-email']") WebElement txt_UserName;
@FindBy(xpath="//input[@id='input-password']") WebElement txt_UserPassword;
@FindBy(xpath="//div[@class='form-group']//a[normalize-space()='Forgotten Password']") WebElement lnk_ForgetPassword;
@FindBy(xpath="//input[@value='Login']") WebElement btn_login;



public void userName(String fname){
	
	txt_UserName.sendKeys(fname);}
public void userpassword(String pwd){
	
	txt_UserPassword.sendKeys(pwd);}
public void forgetpassword(String fname){
	
	lnk_ForgetPassword.click();}
public void loginbutton(String fname){
	
	btn_login.click();}
}

//input[@id='input-password']
//input[@id='input-email']
//div[@class='form-group']//a[normalize-space()='Forgotten Password']
//input[@value='Login']