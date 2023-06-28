Feature: This page contains all of the tests done on the Add Remove Element page

  Scenario: User navigates to the Add Remove Element page, clicks on the Add Element button twice, and 2 Delete button appear
    Given the user opens the Add Remove Elements page
    When the user clicks on the Add Element button
    Then the first delete button is displayed
    And the user clicks on the Add Element button
    Then the second delete button is displayed


  Scenario: User navigates to the Add Remove Element page, adds 2 Delete buttons, then deletes them
    Given the user opens the Add Remove Elements page
    And the user clicks on the Add Element button
    And the user clicks on the Add Element button
    Then the first delete button is displayed
    And the second delete button is displayed
    When the user clicks on the second delete button
    Then the first delete button is displayed
    And the second delete button is not displayed
