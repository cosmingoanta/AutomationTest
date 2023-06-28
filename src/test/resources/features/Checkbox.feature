Feature: contains all of the checkbox page tests

  Background:
    Given the user opens the checkbox page

  Scenario: The user can click the first checkbox and mark it as checked
    When the user clicks on the first checkbox
    Then the first checkbox is checked


  Scenario: The user can click on the 2nd checkbox and mark it as unchecked
      When the user clicks on the second checkbox
      Then the second checkbox is unchecked