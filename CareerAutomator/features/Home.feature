Feature: Testing Assignment 1

  Scenario: Sending a message and verifying inbox
    Given I am on the Home page with url "https://basecopy5.staging.pg-test.com/hub/newhub503949860203/home-v3"
    When I navigate to Career > Jobs
    And I click on any job
    And I message any recommended user as "Sanjeeda Pathan 01th Sep 2023 3-YOE"
    And I navigate to the inbox
    Then I should see the sent message in my inbox as "Sanjeeda Pathan 01th Sep 2023 3-YOE"

  

