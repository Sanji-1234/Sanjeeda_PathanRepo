 Feature: Testing Assignment 1
 Scenario: Login with Valid Credentials
    Given I launch Chrome browser
    
    When I open url "https://basecopy5.staging.pg-test.com/auth/sign-in"
    And I enter email as "sanjeedap7218@gmail.com" and password as "Automation@123"
    And I click on login button
    Then I land on the home page and page title should be "PeopleGrove for career and Alumni"
    


