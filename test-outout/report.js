$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RestCalls.feature");
formatter.feature({
  "line": 5,
  "name": "Definite all the RestAssured API Calls",
  "description": "",
  "id": "definite-all-the-restassured-api-calls",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@RestAssured_API_CALLS"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Use all API Calls for given URL",
  "description": "",
  "id": "definite-all-the-restassured-api-calls;use-all-api-calls-for-given-url",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Users should call  api with GET Method",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Users should call api with POST Method",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Users should call api with PUT Method",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should call api with Delate Method",
  "keyword": "Then "
});
formatter.match({
  "location": "RestApiMethods.users_should_call_api_with_GET_Method()"
});
formatter.result({
  "duration": 4998727500,
  "status": "passed"
});
formatter.match({
  "location": "RestApiMethods.users_should_call_api_with_POST_Method()"
});
formatter.result({
  "duration": 626422300,
  "status": "passed"
});
formatter.match({
  "location": "RestApiMethods.users_should_call_api_with_PUT_Method()"
});
formatter.result({
  "duration": 620369400,
  "status": "passed"
});
formatter.match({
  "location": "RestApiMethods.user_should_call_api_with_Delate_Method()"
});
formatter.result({
  "duration": 587081700,
  "status": "passed"
});
});