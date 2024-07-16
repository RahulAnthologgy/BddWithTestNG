@Demo
Feature: feature to test google search functionality
  Scenario Outline:Validate google search
    Given open the browser
    And user is on google page
    When user enter "<text>" in search box
    And click on search button
    Then user is navigate to search results
    Examples:
      |  text|
    |      flipkart|
    |Amozone       |
    |Snapdeal      |

