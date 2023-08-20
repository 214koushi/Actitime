package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

@FindBy(xpath="//a[text()='Logout']")
private WebElement lgout;

public Homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}

public WebElement getLgout() {
	return lgout;
}

public void logout() {
	
	lgout.click();
}
}
	