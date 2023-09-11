Feature: Edit an account

  Scenario Outline: Edit an account on magento
    Given Browser is open on the homepage
    And User is logged in with credentials <email> and <password>
    When Users clicks on My Account
    And clicks on edit
    And User changes the information about <name>, <surname>, <new email>, <actual password> and <new password>
    And clicks on save
    Then User is logged to the home page with a recapitulation of the new information

    Examples:
    | email | password | name | surname | new email | actual password | new password |
    | prova01@example.com | AB12345678! | prova1 | Test1 | prova01@example.com | AB12345678! | AB12345678! |
