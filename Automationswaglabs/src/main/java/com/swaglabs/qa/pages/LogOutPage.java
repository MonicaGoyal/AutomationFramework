package com.swaglabs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.swaglabs.qa.base.TestBase;

public class LogOutPage extends TestBase{
	
	@FindBy(id = "react-burger-menu-btn")
	WebElement Menubutton;

	@FindBy(id = "logout_sidebar_link")
	WebElement Logoutbutton;
	
	public LogOutPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void clicklogout()  {
		
		Menubutton.click();

		WebDriverWait wait = new WebDriverWait(driver, 40);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id=\"logout_sidebar_link\"]"))).click();

	
	}

}
