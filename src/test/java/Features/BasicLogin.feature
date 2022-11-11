Feature: BasicLoginFeature

  Scenario: user has to log in with correct credentials to pass
    Given user navigates to wanted site "basic_auth"
    And user enters the following given credentials
        |Username | Password |
        |admin    |admin     |
    And user click on the login on button
    Then user should see confirmation page