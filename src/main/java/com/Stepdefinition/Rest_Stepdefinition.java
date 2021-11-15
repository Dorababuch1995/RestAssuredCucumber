package com.Stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Rest_Stepdefinition {

	
	public static String url;
	public static Response response;
	
	@Given("^User should open reqres website \"([^\"]*)\"$")
	public void user_should_open_reqres_website(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("API Testing on "+arg1);
	url =	RestAssured.baseURI=arg1;
	}

	@When("^Parameters$")
	public void parameters() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Dorababu");
		
		System.out.println("Find parameters");
		
		
	}


	@Then("^Path$")
	public void path(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		//RestAssured.baseURI=url;
		
		Response response = given().param("page", "2").header("Content-Type",
                "application/json").when().get("/api/users");
	  int statusCode = response.getStatusCode();
	}

	@Then("^validate Status code \"([^\"]*)\"$")
	public void validate_Status_code(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode, arg1);
		
		System.out.println(statusCode);
	    
	}

	
}
