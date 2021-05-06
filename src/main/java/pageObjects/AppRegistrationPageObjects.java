package pageObjects;

import org.openqa.selenium.By;

public class AppRegistrationPageObjects {
	
	By DD_MY_ACCOUNT = By.cssSelector("span.caret");
	By TXT_BOX_FIRSTNAME = By.id("input-firstname");
	By TXT_BOX_LASTNAME = By.id("input-lastname");
	By TXT_BOX_EMAIL = By.id("input-email");
	By TXT_BOX_TELEPHONE = By.id("input-telephone");
	By TXT_BOX_PASSWORD = By.id("input-password");
	By TXT_BOX_confirm_password =By.id("input-confirm");
	By SELECT_REGISTER = By.xpath("//a[contains(text(),'Register')]");
	By SELECT_LOGIN = By.xpath("//a[contains(text(),'Login')]");
	By TEXT_SUCCESS = By.xpath("//a[contains(text(),'Success')]");
	By MESSAGE_YOUR_ACCOUNT_HAS_BEEN_CREATED = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
	By TEXT_YOUR_STORE = By.xpath("//a[contains(text(),'Your Store')]");
	
	String actualYourStoreText = "Your Store";
	String actualSuccessText = "Success";
	String actualText = "Your Account Has Been Created!";
	
	public void clickOnMyAccountDD() {
		
	}
	
	public void selectRegisterOrLogin(String selectionType) {
		
	}
}
