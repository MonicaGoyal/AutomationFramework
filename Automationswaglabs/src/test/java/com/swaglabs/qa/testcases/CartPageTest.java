package com.swaglabs.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.swaglabs.qa.base.TestBase;
import com.swaglabs.qa.pages.CartPage;
import com.swaglabs.qa.pages.CheckoutPage;
import com.swaglabs.qa.pages.HomePage;
import com.swaglabs.qa.pages.LoginPage;

public class CartPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	CheckoutPage checkoutpage;
	CartPage cartpage;

	public CartPageTest() {

		super();

	}

	@BeforeMethod
	public void setup() {

		initialization();

		loginpage = new LoginPage();
		homepage = new HomePage();
		cartpage = new CartPage();

	}

	@Test(priority = 1)

	public void clickingcheckoutLinkTest() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.addingproductocart();
		cartpage = homepage.clicktoCart();
		cartpage.clickingcheckoutLink();
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.saucedemo.com/checkout-step-one.html";
		Assert.assertEquals(expectedURL, actualURL);
	}

	@Test(priority = 2)
	public void addedproductTest() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		String productname = homepage.addingproductocart();
		int count = homepage.getItemCount();
		Assert.assertEquals(count, 1);
		cartpage = homepage.clicktoCart();
		String addedproductname = cartpage.matchaddedproduct();
		Assert.assertEquals(productname, addedproductname);

	}

	@AfterMethod
	public void teardown() {
		driver.quit();

	}
}