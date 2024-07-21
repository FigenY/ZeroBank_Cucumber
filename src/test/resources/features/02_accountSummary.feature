Feature: Account Summary Tests

  Background:
    Given The user is on the home page
    When The user clicks on the Signin button
    When The user enters valid credentials: "username" and "password"
    Then The user should be able to see "username" on the home page

  @wip
  Scenario: Account Summary Test
    When The user navigates to tab: "Online Banking"
    When The user navigates to transaction type: "Account Summary"
    Then The user should verify page title: "Zero - Account Summary"
    And The account summary page account types should be as follows
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |
    And The Credit Accounts column names should be as follows
      | Account     |
      | Credit Card |
      | Balance     |