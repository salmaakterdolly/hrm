package com.os.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	WebDriver driver;
	
	@Test
	public void dropDown() {
		System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		List<WebElement>element= select.getOptions();
		System.out.println(element.size());
		for (int i=0; i<element.size(); i++) {
			System.out.println(element.get(i).getText());
			
			
			select.selectByVisibleText("Men");
			WebElement selected = select.getFirstSelectedOption();
			System.out.println(selected.getText()); 
		}
		
		
		
	}
	
	

}
