
@RestAssured_Project
Feature: Run RestAssured in this website https://reqres.in

  @RestAssured_On_https://reqres.in
  Scenario Outline: Validate the Status for reqres
    Given User should open reqres website "<BaseUlr"
    When Parameters 
    Then Path
    Then validate Status code "<statuscode>"
    
    Examples:
		|BaseUrl					|statuscode	|
		|https://reqres.in||200				|
