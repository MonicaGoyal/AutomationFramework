package com.swaglabs.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.swaglabs.qa.base.TestBase;
import com.swaglabs.qa.pages.CartPage;
import com.swaglabs.qa.pages.CheckoutPage;
import com.swaglabs.qa.pages.HomePage;
import com.swaglabs.qa.pages.LogOutPage;
import com.swaglabs.qa.pages.LoginPage;

public class LogOutPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	CartPage cartpage;
	CheckoutPage checkoutpage;
	LogOutPage logoutpage;

	public LogOutPageTest() {

		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();

		loginpage = new LoginPage();
		homepage = new HomePage();
		logoutpage = new LogOutPage();

	}

	@Test(priority = 2)
	public void VerifyinglogoutbtnTest() {

		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		cartpage = homepage.clicktoCart();
		checkoutpage = cartpage.clickingcheckoutLink();
		logoutpage = checkoutpage.enteringcheckoutdetails("Monica", "Goyal", "452001");
		logoutpage.clicklogout();
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.saucedemo.com/";
		Assert.assertEquals(actualURL, expectedURL);

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}