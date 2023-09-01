Feature: research on google page

  Scenario: Validate research on google page works well

    Given I have my browser opened on "www.google.it"
    And I accept the cookies
    When I enter a text in the search box
    And I press enter
    Then I have navigated to the search result page