@feturedScenarios
Feature: Featured Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage

  @US-05
  Scenario: Verify the title of the featured page
    When I click on the FEATURED link button on the top of the Home page
    Then I verify the title of the featured page "Featured"
