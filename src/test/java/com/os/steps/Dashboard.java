package com.os.steps;

import org.openqa.selenium.By;

import com.os.common.userBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dashboard extends userBase {
	

@Given("^After login in can see the dashboard$")
public void after_login_in_can_see_the_dashboard() throws Throwable {
  launchBrowser();
    
}
@When("^i click on leave list$")
public void i_click_on_leave_list() throws Throwable {
	driver.findElement(By.xpath("//*[@class='quickLinkText' and contains(text(),'Leave List')]")).click(); 
	 Thread.sleep(5000);   
}


@When("^i clicked on search button$")
public void i_clicked_on_search_button() throws Throwable {
	
    
}

@Then("^i was able to see the leave list$")
public void i_was_able_to_see_the_leave_list() throws Throwable {
    
    
}
	
	
	
	
	
	

}
