Feature: Simple addition test

  Scenario: Adding a and b
    Given I have variable "1"
    And I have another variable "2"
    When I add them
    Then I display the sum
