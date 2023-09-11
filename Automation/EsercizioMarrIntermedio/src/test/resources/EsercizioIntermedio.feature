Feature: Create an account

  Scenario Outline: Create an account on magento
    Given Browser is open on the homepage
    And User clicks on Create an Account
    When Users enters the information about <name>, <surname>, <email>, <password> and <conferma password>
    And User clicks Create an account
    Then User is navigated to the home page

    Examples:
    | name | surname | email | password | conferma password |
    | Prova2 | Test  | esempio4@esempio.it | AB12345678! | AB12345678! |

