Feature: Money transfer

  Scenario: Transfer funds from savings into checking account
    Given I have deposited 1000 in my "Checking Account"
    When I transfer 500 from my "Savings Account" into my "Checking Account".