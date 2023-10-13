Feature: Google Search bar

Scenario: Search for something

Given I am on the google search page
When I enter a search criteria
And Click on the search button
Then The results match the criteria

