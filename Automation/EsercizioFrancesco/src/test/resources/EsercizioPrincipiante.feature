Feature: Testing login functionality

  Scenario: Check login is successful with valid credentials
    Given Browser is open on the home page
    And User clicks on sign in
    When User enters iolanda.maiorino@alten.it and A12345678!
    And User clicks on login
    Then User is logged