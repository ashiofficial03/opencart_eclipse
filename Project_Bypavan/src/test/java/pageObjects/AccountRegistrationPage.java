package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
@FindBy(xpath="//input[@id='input-firstname']") WebElement txt_FirstName;
@FindBy(xpath="//input[@id='input-lastname']") WebElement txt_LastName;
@FindBy(xpath="//input[@id='input-email']") WebElement txt_email;
@FindBy(xpath="//input[@id='input-telephone']") WebElement txt_phone;
@FindBy(xpath="//input[@id='input-password']") WebElement txt_Password;
@FindBy(xpath="//input[@id='input-confirm']") WebElement txt_ConfirmPassword;
@FindBy(xpath="//input[@value='0']") WebElement rbutton_radiobutton;
@FindBy(xpath="//input[@name='agree']") WebElement chk_checkBox;
@FindBy(xpath="//input[@value='Continue']") WebElement btn_Continue;
@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement msgConfirmation;

public void firstName(String fname){
	
	txt_FirstName.sendKeys(fname);
	
}
public void lastName(String lname){
	
	txt_LastName.sendKeys(lname);
	
}
public void email(String email){
	
	txt_email.sendKeys(email);
	
}
public void phonenumber(String phone){
	
	txt_phone.sendKeys(phone);
	
}
public void passWord(String pwd){
	
	txt_Password.sendKeys(pwd);
	
}
public void ConfirmpassWord(String pwd){
	
	txt_ConfirmPassword.sendKeys(pwd);
	
}
public void radiobtn(){
	
	rbutton_radiobutton.click();
	
}
public void checkBox(){
	
	chk_checkBox.click();
	
}
public void Continue(){
	
	btn_Continue.click();;
	
}
public String Confirmatiom() {
	try {
	return msgConfirmation.getText();
	}catch(Exception e)
	{
		return e.getMessage();
	}
}
}