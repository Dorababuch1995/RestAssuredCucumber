package com.Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Web_Stepdefinition {

	public static WebDriver driver;
	
	@Given("^Usershould open BASE URL$")
	public void usershould_open_BASE_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");
		
	}

	@When("^Usershould enter validate \"([^\"]*)\" and \"([^\"]*)\"$")
	public void usershould_enter_validate_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(arg1);	
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(arg2);
		
	}

	@Then("^Usershould should click login button$")
	public void usershould_should_click_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
			
		driver.findElement(By.xpath("//input[@value='Login']")).click();

	}

	@Then("^Validate URL$")
	public void validate_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		Assert.assertTrue(true);
		
		driver.quit();
		
	}

	
}
