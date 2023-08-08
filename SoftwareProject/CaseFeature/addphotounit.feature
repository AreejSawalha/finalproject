Feature: owner add photo unit

Scenario: Owner adds photo
    Given I am an owner
    When I add a photo to unit
    Then the photo unit should be added 