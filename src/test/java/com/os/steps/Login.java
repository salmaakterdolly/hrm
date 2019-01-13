package com.os.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.os.pages.HomePage;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	
	WebDriver driver;
	@Given("^As a user i am on home page$")
	public void as_a_user_i_am_on_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	  
	}

	@When("^i entered \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_entered(String Admin, String admin123) throws Throwable {
		driver.findElement(By.name("txtUsername")).sendKeys(Admin);
		driver.findElement(By.name("txtPassword")).sendKeys(admin123);
	   
	}

	@When("^i clicked on submit button$")
	public void i_clicked_on_submit_button() throws Throwable {
	    
	}

	@Then("^i was able to log in$")
	public void i_was_able_to_log_in() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	  
	}


}
