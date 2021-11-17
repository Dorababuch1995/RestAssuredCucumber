$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Web_Login.feature");
formatter.feature({
  "line": 3,
  "name": "CRM APPLICATION LOGIN TEST",
  "description": "",
  "id": "crm-application-login-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@WebCRM_PROJECT"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Validate CRM Login page with validate usernamae and password",
  "description": "",
  "id": "crm-application-login-test;validate-crm-login-page-with-validate-usernamae-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@login_CRM"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Usershould open BASE URL",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Usershould enter validate \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Usershould should click login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Validate URL",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "crm-application-login-test;validate-crm-login-page-with-validate-usernamae-and-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "crm-application-login-test;validate-crm-login-page-with-validate-usernamae-and-password;;1"
    },
    {
      "cells": [
        "Reddy77077",
        "Saibaba77"
      ],
      "line": 15,
      "id": "crm-application-login-test;validate-crm-login-page-with-validate-usernamae-and-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Validate CRM Login page with validate usernamae and password",
  "description": "",
  "id": "crm-application-login-test;validate-crm-login-page-with-validate-usernamae-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@WebCRM_PROJECT"
    },
    {
      "line": 6,
      "name": "@login_CRM"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Usershould open BASE URL",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Usershould enter validate \"Reddy77077\" and \"Saibaba77\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Usershould should click login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Validate URL",
  "keyword": "Then "
});
formatter.match({
  "location": "Web_Stepdefinition.usershould_open_BASE_URL()"
});
formatter.result({
  "duration": 46906068300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Reddy77077",
      "offset": 27
    },
    {
      "val": "Saibaba77",
      "offset": 44
    }
  ],
  "location": "Web_Stepdefinition.usershould_enter_validate_and(String,String)"
});
formatter.result({
  "duration": 695778600,
  "status": "passed"
});
formatter.match({
  "location": "Web_Stepdefinition.usershould_should_click_login_button()"
});
formatter.result({
  "duration": 5595406000,
  "status": "passed"
});
formatter.match({
  "location": "Web_Stepdefinition.validate_URL()"
});
formatter.result({
  "duration": 908259600,
  "status": "passed"
});
});