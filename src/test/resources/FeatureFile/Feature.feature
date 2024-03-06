Feature: Insurance Application

  Scenario: Navigate to Insurance
    Given User is on the insurance website
    When User enters the studentInsurance Details
    Then Display the Top 3 Lowest Insurance Plans

  Scenario: Display Error Message
    Given User navigates to car insurance Page
    When User provides car Insurance Details
    Then Display the Error Message

  Scenario: Get Insurance Quotes
    Given User Navigates to HomePage
    When User clicks on Insurance Products
    Then Display the List of Insurance Items List
    And Close the browser
