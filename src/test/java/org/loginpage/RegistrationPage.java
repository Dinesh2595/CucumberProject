package org.loginpage;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass {
	public RegistrationPage() {
		PageFactory.initElements(d, this);
	}

	@FindBy(xpath = "(//div[@class='_6ltg'])[2]")
	private WebElement create;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement first;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement last;
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement email;
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement password;
	@FindBy(xpath = "//select[@aria-label='Day']")
	private WebElement day;
	@FindBy(xpath = "//select[@aria-label='Month']")
	private WebElement month;
	@FindBy(xpath = "//select[@aria-label='Year']")
	private WebElement year;
	
	@FindBy(xpath="(//label[@class='_58mt'])[2]")
	private WebElement gender;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement signup;

	public WebElement getCreate() {
		return create;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getSignup() {
		return signup;
	}


}
