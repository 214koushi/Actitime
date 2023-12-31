package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(name="username")
	private WebElement untbx;
	@FindBy(name="pwd")
	private WebElement pwtbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgin;
	
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getUntbx() {
		return untbx;
	}


	public WebElement getPwtbx() {
		return pwtbx;
	}


	public WebElement getLgin() {
		return lgin;
	}
	
	
	//business library
	
	public void login(String username,String password) {
		untbx.sendKeys(username);
		pwtbx.sendKeys(password);
		lgin.click();
	}
}


