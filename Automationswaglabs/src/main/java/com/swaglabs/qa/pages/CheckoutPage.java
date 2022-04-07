package com.swaglabs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglabs.qa.base.TestBase;

public class CheckoutPage extends TestBase {

	@FindBy(id = "first-name")
	WebElement firstname;

	@FindBy(id = "last-name")
	WebElement lastname;

	@FindBy(id = "postal-code")
	WebElement postalcode;

	@FindBy(id = "continue")
	WebElement continuebtn;

	@FindBy(id = "continue")
	WebElement checkoutoverview;
	
	@FindBy(id = "cancel")
	WebElement cancellink;

	
	public CheckoutPage() {

		PageFactory.initElements(driver, this);

	}

	public LogOutPage enteringcheckoutdetails(String fname, String lname, String pcode){
		
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		postalcode.sendKeys(pcode);
		continuebtn.click();
		return new LogOutPage();

	}

	
	
	 
	}

