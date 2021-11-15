
@WebCRM_PROJECT
Feature: CRM APPLICATION LOGIN TEST


  @login_CRM
  Scenario Outline: Validate CRM Login page with validate usernamae and password
    Given Usershould open BASE URL
    When Usershould enter validate "<username>" and "<password>"
    Then Usershould should click login button
    Then Validate URL
    
    Examples:
			|username		|password		|
			| Reddy77077|Saibaba77 	|
			
