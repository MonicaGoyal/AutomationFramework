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

public class HomePageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	CheckoutPage checkoutpage;
	CartPage cartpage;

	public HomePageTest() {

		super();

	}

	@BeforeMethod
	public void setup() {

		initialization();

		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 1)
	public void addtoCartTest() {
		homepage.addingproductocart();

	}

	@Test(priority = 2)
	public void clicktoCarTTest() {

		cartpage = homepage.clicktoCart();
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.saucedemo.com/cart.html";
		Assert.assertEquals(expectedURL, actualURL);

	}

	@AfterMethod
	public void teardown() {
		driver.quit();

	}

}