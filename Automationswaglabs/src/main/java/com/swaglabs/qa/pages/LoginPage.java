package com.swaglabs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglabs.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id = "user-name")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(name = "login-button")
	WebElement Loginbutton;

	@FindBy(xpath = "//div[@class='login_logo']")
	WebElement Swaglogo;

	@FindBy(id = "react-burger-menu-btn")
	WebElement Menubutton;

	@FindBy(id = "logout_sidebar_link")
	WebElement Logoutbutton;

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	public boolean swaglogodisplay() {
		return Swaglogo.isDisplayed();

	}

	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		Loginbutton.click();
		return new HomePage();

	}

	public void clicklogoutlink() {

		Menubutton.click();

	}

}
