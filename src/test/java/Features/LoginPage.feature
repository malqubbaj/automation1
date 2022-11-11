Feature: LoginPageFeature

  Scenario: user navigates to log in page and logs in using the right and wrong credentials
    Given user navigates to wanted site "login"
    And verifies that it is the wanted site
    When user enters the right credentials
    |username      |password            |
    |tomsmith      |SuperSecretPassword!|
    And submits
    Then user should see if the credentials used are correct and logs out
    When user enters "test" and "fails" as wrong credentials
    And submits wrong form
    Then checks if the right error message appears
