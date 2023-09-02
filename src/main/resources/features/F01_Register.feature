@smoke
Feature: F01_Register | users could register with new accounts

  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user select gender type
    And  user enter firstName "automation"
    And  user enter lastName "tester"
    And  user enter date of birth
    And  user enter email "test@example.com" field
    And  user fills password field "P@ssw0rd"
    And  user fills confirmPassword field "P@ssw0rd"
    And  user clicks on register button
    Then success message is displayed
