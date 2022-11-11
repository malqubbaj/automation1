Feature: DragAndDropFeature

  Scenario: user drags and drops element from one place to another
    Given user navigates to wanted site "drag_and_drop"
    And verifies that all elements are present with headers on each box
    Then user drags box A to position of box b
    And makes sure that the boxes ahve been replaced
    Then user redrags box A to its initial postion
    And makes sure its back

