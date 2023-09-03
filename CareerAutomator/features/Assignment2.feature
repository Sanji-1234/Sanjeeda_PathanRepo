Feature: Verify Career Paths Functionality

  Scenario: Verify Career Path Selection and Recently Viewed Careers
    Given I am on the Home page using url "https://basecopy5.staging.pg-test.com/hub/newhub503949860203/home-v3"
    When I navigate to Career Paths
    And I click on 3 career paths from the "Inspiration from You" section with "index"
    And I store the names of the selected career paths
    And i am on home using "url" page option three is pre-selected in the Career Stage section on home page 
    And I go back to the homepage and refresh
    Then I verify that the "Recently viewed careers" list is reversed compared to step 2
