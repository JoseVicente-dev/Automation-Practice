Feature: Login the page

  Scenario: UA user authenticates with valid credentials
    Given that a registered user is on the login page
    When he tries to login with valid credentials "tomsmith" and "SuperSecretPassword!"
    Then should see the message "You logged into a secure area!"