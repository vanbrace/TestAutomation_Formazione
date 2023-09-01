
Feature: checkout

  Scenario: Checkout a banana

    Given the price of a "banana" is 40 c
    When I checkout a "banana"
    Then The total price should be 40 c