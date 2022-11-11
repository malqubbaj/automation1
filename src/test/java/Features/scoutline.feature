
Scenario Outline: Login with correct username and password
Given I navigate to the login page
And I enter <Username> and <Password>
And I click login button
Then I should see userform page

Examples:
| Username | Password      |
| admin    | adminpassword |
| test     | qa            |
