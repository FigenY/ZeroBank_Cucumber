@regression @smoke
Feature: Login Functionality

  Background:
    Given The user is on the home page
    When The user clicks on the Signin button


  Scenario: Positive Login Tests
    When The user enters valid credentials: "username" and "password"
    Then The user should be able to see "username" on the home page


  Scenario Outline: Negative Login Tests "<username>"
    When The user enters invalid credentials: "<username>" and "<password>"
    Then The user should see error message: "<message>"
    Examples:
      | username | password | message                          |
      | username | wrong    | Login and/or password are wrong. |
      | wrong    | password | Login and/or password are wrong. |
      |          | password | Login and/or password are wrong. |
      | username |          | Login and/or password are wrong. |
      |          |          | Login and/or password are wrong. |
