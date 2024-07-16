@Login
Feature: Login page verification
  Scenario Outline: Login by enter valid username and password
    Given User navigate to login page
    When Enter "<username>" and "<password>"
    And Click on Login button
    Then Navigate to Home Page

    Examples:
    |username|password|
    |Automation|Password#1|