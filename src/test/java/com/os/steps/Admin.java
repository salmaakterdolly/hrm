package com.os.steps;

import org.openqa.selenium.By;

import com.os.common.userBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Admin extends userBase{
	
	@Before
	public void openbrowser() {
		launchBrowser();
	}//end of before hooks
	
	@After
	public void closebrowser() {
		tearDown();
	}//end of After hooks
	
	
	@Given("^as a user i am on admin page$")
	public void as_a_user_i_am_on_admin_page() throws Throwable {
	  launchBrowser();
	}

	@When("^i clicked on admin$")
	public void i_clicked_on_admin() throws Throwable {
	 // driver.findElement(By.id("manu_admin_UserManagment")).click();
	}

	@When("^i clicked on user managment$")
	public void i_clicked_on_user_managment() throws Throwable {
		driver.findElement(By.id("manu_admin_UserManagment")).click();  
	}

	@When("^i clicked on user$")
	public void i_clicked_on_user() throws Throwable {
	 driver.findElement(By.id("manu_admin_viewSystemUsers")).click();  
	}

	@Then("^i saw an error occured$")
	public void i_saw_an_error_occured() throws Throwable {
	   
	}

}
