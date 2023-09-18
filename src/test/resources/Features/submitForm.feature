Feature: form

  Scenario: Signup new user new
    Given user open practice form
    When user input firstName and LastName
    And input email
    And user choose gender
    And input mobile number
    And input date of birth
    And user click submit
    Then user validation pop up

