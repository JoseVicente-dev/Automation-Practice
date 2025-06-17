Scenario: create a user
  When he creates a user with name "morpheus" and job "leader"
  Then the response code will be 201
  And the id of the response will not be null