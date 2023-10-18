@browseListsScenarios
  Feature: Browse Lists Page Related Scenarios

    Background: Navigate to homepage
      Given I open url of homepage

    @US07
    Scenario: Verify the title of Browse lists page
      When I click on Browse Lists button
      Then Verify the title of Browse Lists page is "Movieo"