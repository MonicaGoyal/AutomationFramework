package com.swaglabs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglabs.qa.base.TestBase;

public class HomePage extends TestBase {

	String productName = "Sauce Labs Backpack";
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	WebElement saucelabsBackpack;

	@FindBy(xpath = "//a[@class=\"shopping_cart_link\"]")
	WebElement addtocartlink;

	@FindBy(xpath = "(//div[text()='Sauce Labs Backpack']//ancestor::div[@class='inventory_item_description']//following::button[1])[1]")
	WebElement addToCart;

	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	WebElement cartItem;

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	public String addingproductocart() {

		String productname = saucelabsBackpack.getText();
		addToCart.click();
		return productname;
	}

	public int getItemCount() {
		return Integer.parseInt(cartItem.getText());

	}

	public CartPage clicktoCart() {
		saucelabsBackpack.click();
		addtocartlink.click();
		return new CartPage();

	}

}
