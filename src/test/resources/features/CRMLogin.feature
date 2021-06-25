Feature: CRM Login

  Scenario: Valid Login Scenario
     	Given User is already on login page
   		When User enters login credential
   		|uname|pwd|
   		|shrashtisingh@gmail.com | Shrashti|
   		Then User is on Home Page
      Then Close Browser