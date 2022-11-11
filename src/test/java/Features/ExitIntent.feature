Feature: ExitIntentFeature

  Scenario: user tries to move mouse out of viewport
    Given user navigates to wanted site "exit_intent"
    And verifies that it is the wanted site
    When user places mouse cursor Text written and then moves it out of viewport
    Then user should see a pop up message appear
    When user clicks on close
    Then user should be back to homepage