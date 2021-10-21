Feature: the user validate the facebook functionality

  Scenario: the user register the facebook page
    Given the user navigate to the facebook home page
    When user click the create new account
    And user fill following details
    Then user  click the  signup button

  Scenario: user Check the login credintials
    Given the user navigate to the facebook home page
    When the user fill the username "Dinesh"and password"45454"
    And the user click the login button
    Then user navigate to the invalid login page
