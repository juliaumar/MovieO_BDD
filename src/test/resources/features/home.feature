@homeScenarios
Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage

  @M-01
  Scenario: Verify the Title of the page
    Then Verify Title of Home page is "Movieo"

  @M-06
  Scenario: Verify the Title of the Browse Movies page
    When Click on the Browse Movies button
    Then Verify the Title of Browse Movies page is "Movies"

  @US-08
  Scenario: Verify the Title of the Create a List page
    When Click on the +CREATE A LIST button
    Then Verify the Title of Create A List page is "Movieo"