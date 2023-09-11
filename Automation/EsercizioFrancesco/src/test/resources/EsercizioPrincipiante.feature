Feature: Testing login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open on the home page
    And User clicks on sign in
    When User enters <email> and <password>
    And User clicks on login
    Then User is logged

    Examples:
      | email | password|
      | prova01@example.com | AB12345678! |