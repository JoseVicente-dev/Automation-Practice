Feature: create a user

  Scenario: Create a user
    When the actor creates a user with name "morpheus" and job "leader"
    Then the response code will be 201
    And the id of the response will not be null