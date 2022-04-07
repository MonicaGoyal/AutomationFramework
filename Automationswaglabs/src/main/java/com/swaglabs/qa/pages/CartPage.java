package com.swaglabs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglabs.qa.base.TestBase;

public class CartPage extends TestBase {

	

	@FindBy(xpath = "//button[@class=\"btn btn_action btn_medium checkout_button\"]")
	WebElement CheckOutLink;

	@FindBy(xpath = "//div[@class=\"inventory_item_name\"]")
	WebElement Addedproductnameinthecart;

	@FindBy(xpath = "//div[@class=\"cart_quantity\"]")
	WebElement Addedproductquaninthecart;

	public CartPage() {

		PageFactory.initElements(driver, this);

	}

	public String matchaddedproduct() {

		String addedproductname = Addedproductnameinthecart.getText();
		return addedproductname;
       
	}

	public CheckoutPage clickingcheckoutLink()  {

		CheckOutLink.click();
	
		return new CheckoutPage();

	}

}
