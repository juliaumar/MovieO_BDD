@homeScenarios
Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage

    @M-01
    Scenario: Verify the Title of the page
      Then Verify Title of Home page is "Movieo"

