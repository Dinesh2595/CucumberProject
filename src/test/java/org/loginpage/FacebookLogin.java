package org.loginpage;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin extends BaseClass {
	public FacebookLogin() {

		PageFactory.initElements(d, this);
	
	
	}
	@FindBy(id="email")
	private WebElement user;
	@FindBy(id="pass")
	private WebElement pass;
	@FindBy(name="login")
	private WebElement login;
	
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
	

}
