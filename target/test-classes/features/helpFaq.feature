@infoScenarios
Feature: INFO related scenarios

  Background: Navigate to Homepage
    Given I open url of homepage

  @US21
  Scenario Outline: Verify titles of 1."TAKE MOVIES TOUR" and 2."TAKE LIST TOUR" pages
    When I click on "Info" button
    And I click on the "Help/FAQ" button
    And I click on "<buttons>"
    Then Verify "<titles>" of that pages
    Examples:
      | buttons          | titles |
      | Take movies tour | Movies |
      | Take lists tour  | Lists  |

