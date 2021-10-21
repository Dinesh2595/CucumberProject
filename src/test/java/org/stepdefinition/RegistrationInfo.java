package org.stepdefinition;

import org.baseclass.BaseClass;
import org.loginpage.FacebookLogin;
import org.loginpage.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationInfo extends BaseClass {
	RegistrationPage r;
	FacebookLogin l;

	@Given("the user navigate to the facebook home page")
	public void the_user_navigate_to_the_facebook_home_page() {
		launchBrowser("chrome");
		implicitywait(10);
		launchurl("https://en-gb.facebook.com/");

	}

	@When("user click the create new account")
	public void user_click_the_create_new_account() {
		r = new RegistrationPage();
		click(r.getCreate());

	}

	@When("user fill following details")
	public void user_fill_following_details() {
		fillTextBox(r.getFirst(), "Dinesh");
		fillTextBox(r.getLast(), "Kumar");
		fillTextBox(r.getEmail(), "dinesh@gmail.com");
		select("value", r.getDay(), "16");
		select("value", r.getMonth(), "6");
		select("visibletext", r.getYear(), "1998");
		click(r.getGender());

	}

	@Then("user  click the  signup button")
	public void user_click_the_signup_button() {
		click(r.getSignup());
		System.out.println("Registered With Invalid Credential");
	}

//                 "Scenario 2"
	
	@When("the user fill the username and password")
	public void the_user_fill_the_username_and_password() {
		l = new FacebookLogin();
		fillTextBox(l.getUser(), "kumar");
		fillTextBox(l.getPass(), "787878");
	}

	@When("the user click the login button")
	public void the_user_click_the_login_button() {
		click(l.getLogin());

	}

	@Then("user navigate to the invalid login page")
	public void user_navigate_to_the_invalid_login_page() {

		quitBrowser();
		System.out.println("Login in invalid credintials");
	}

}
