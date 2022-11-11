Feature: HorizentalSliderFeature

  Scenario: user checks if the slider works as intedned
    Given user navigates to wanted site "horizontal_slider"
    And verifies that it is the wanted site
    When user slides the slider by "0.5" points
    Then Checks the range