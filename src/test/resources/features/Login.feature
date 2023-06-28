Feature: All login tests.

  Scenario: The user can not log in with a right username
    Given the user opens the Login page
    When the user enters a username "tomsmith"
    And the user enters a valid password "SuperSecretPassword!"
    And the user clicks on the Login button
    Then the user is successfully logged in

  Scenario: The user can not log in with a wrong username
    Given the user opens the Login page
    When the user enters a username "123"
    And the user enters a valid password "SuperSecretPassword!"
    And the user clicks on the Login button
    Then the user is successfully logged in