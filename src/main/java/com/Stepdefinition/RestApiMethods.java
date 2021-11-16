package com.Stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestApiMethods {
	
	

@Given("^Users should call  api with GET Method$")
public void users_should_call_api_with_GET_Method() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	RestAssured.baseURI="https://reqres.in/";
	Response response = given().param("page", "2").header("Content-Type",
                "application/json").when().get("/api/users");
	
	ResponseBody body = response.getBody();
	String asString = body.asString();
	System.out.println(asString);
	
	int statusCode = response.statusCode();
	System.out.println(statusCode);
	
}

@When("^Users should call api with POST Method$")
public void users_should_call_api_with_POST_Method() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	RestAssured.baseURI="https://reqres.in/";
	Response post = given().header("Content-Type",
            "application/json").body("{\n" +
                    "    \"name\": \"morpheus\",\n" +
                    "    \"job\": \"leader\"\n" +
                    "}").when().post("/api/users");
	int statusCode = post.getStatusCode();
	System.out.println(statusCode);
	
	String asString = post.getBody().asString();
	
	System.out.println(asString);
	
	

}

@When("^Users should call api with PUT Method$")
public void users_should_call_api_with_PUT_Method() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	
	
	Response put = given().header("Content-Type",
            "application/json").body("{\n" +
                    "    \"name\": \"morpheus\",\n" +
                    "    \"job\": \"zion resident\"\n" +
                    "}").when().put("/api/users/2");
	
	int statusCode = put.getStatusCode();
	System.out.println(statusCode);
	
	String asString = put.getBody().asString();
	System.out.println(asString);
	
	Assert.assertFalse(true);
}

@Then("^User should call api with Delate Method$")
public void user_should_call_api_with_Delate_Method() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	Response delete = given().header("Content-Type",
            "application/json").when().delete("/api/users/2");
	
	String asString = delete.getBody().asString();
	
	System.out.println(asString);
	
	int statusCode = delete.statusCode();
	
	System.out.println(statusCode);
	
	
	
  
}

}
