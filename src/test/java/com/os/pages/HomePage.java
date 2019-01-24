package com.os.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}//end of constructor
	
	@FindBy(name="txtUsername")
	WebElement Admin;
	
	public WebElement username() {
		return Admin;
	}

	@FindBy (name="txtPassword")
	WebElement admin123;
	
	public WebElement password() {
		return admin123;
	}
   //@FindBy (xpath="//*[@class='quickLinkText' and contains(text(),'Leave List')]");
   WebElement Leave;


public WebElement getLeave() {
	return Leave;
}
   
   
}
