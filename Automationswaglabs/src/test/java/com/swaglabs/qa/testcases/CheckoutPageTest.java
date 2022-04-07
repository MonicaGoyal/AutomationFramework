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

public class CheckoutPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	CartPage cartpage;
	CheckoutPage checkoutpage;

	public CheckoutPageTest() {

		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		checkoutpage = new CheckoutPage();
	}

	@Test(priority = 1)

	public void enteringcheckoutDetailsTest() {

		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.addingproductocart();
		cartpage = homepage.clicktoCart();
		checkoutpage = cartpage.clickingcheckoutLink();
		checkoutpage.enteringcheckoutdetails("Monica", "Goyal", "452010");
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.saucedemo.com/checkout-step-two.html";
		Assert.assertEquals(actualURL, expectedURL);

	}

	@AfterMethod
	public void teardown() {
		driver.quit();

	}
}