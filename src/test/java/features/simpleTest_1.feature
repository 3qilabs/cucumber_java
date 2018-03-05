Feature: Simple addition test1

  Scenario: Adding a and b
    Given I have variable "2"
    And I have another variable "2"
    When I add them
    Then I display the sum
