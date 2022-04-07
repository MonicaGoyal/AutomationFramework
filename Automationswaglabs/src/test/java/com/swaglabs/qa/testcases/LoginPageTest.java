package com.swaglabs.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.swaglabs.qa.base.TestBase;
import com.swaglabs.qa.pages.HomePage;
import com.swaglabs.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() {

		super();

	}

	@BeforeMethod

	public void Setup() {
		initialization();
		loginpage = new LoginPage();

	}

	@Test(priority = 1)

	public void swaglogodisplaytest() {

		boolean flag = loginpage.swaglogodisplay();
		Assert.assertTrue(flag);

	}

	@Test(priority = 2)
	public void loginTest() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		String URL = driver.getCurrentUrl();
		String expectedurl = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(expectedurl, URL);

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
