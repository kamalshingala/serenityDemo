@serenityFeature
Feature: Google Feature

  @serenity-1
  Scenario Outline: google search test
    Given User launches serenity reference page
    When User Navigates to section2
    Then User is taken to '<section2>'

    Examples:
      | section2 |
      | 2. Basic Concepts |