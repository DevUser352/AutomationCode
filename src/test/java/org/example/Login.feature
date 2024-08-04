Feature: User Login
  Registered users should be able to login to access account details

  Scenario: Login with valid credentials
    Given User navigates to the Login page
    When User enters a valid email address "amotooricap9@gmail.com"
    And User enters a valid password "12345"
    And User clicks on the Login button
    Then User should login successfully

  Scenario: Login with invalid credentials
    Given User navigates to the Login page
    When User enters an invalid email address "ssssss@gmail.com"
    And User enters an invalid password "2243"
    And User clicks on the Login button
    Then User should get a proper warning message

  Scenario: Login with a valid email address and an invalid password
    Given User navigates to the Login page
    When User enters a valid email address "amotooricap9@gmail.com"
    And User enters an invalid password "1234"
    And User clicks on the Login button
    Then User should get a proper warning message

  Scenario: Login with an invalid email address and a valid password
    Given User navigates to the Login page
    When User enters an invalid email address "fjajlj@gmail.com"
    And User enters a valid password "12349u5u"
    And User clicks on the Login button
    Then User should get a proper warning message

  Scenario: Login without providing any credentials
    Given User navigates to the Login page
    When User does not enter any credentials
    And User clicks on the Login button
    Then User should get a proper warning message
