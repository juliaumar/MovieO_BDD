@homeScenarios
Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage

  @M-01
  Scenario: Verify the Title of the page
    Then Verify Title of Home page is "Movieo"

  @M-06
  Scenario: Verify the Title of the Browse Movies page
    When Click in the Browse Movies button
<<<<<<< HEAD
    Then Verify the Title of Browse Movies page is "Movies"
=======
    Then Verify the Title of Browse Movies page is "Movies"
>>>>>>> 8296894d5c123044b6a8d47533027f86405d52ea
