Feature: A Movie window related scenarios

  Background: Navigate to Homepage
    Given I open url of homepage

  @US35
  Scenario: As a user I click on Comments button, then click on “Share your thoughts” input field, verify if Facebook,Twitter,Google buttons are displayed
    When I click on Browse Movies button
    And I click on first movie window
    And I click on comment field
    And I click on Share your thoughts field
    Then Verify "You need to sign in before doing that." is displayed
