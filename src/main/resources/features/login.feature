Feature: Login Web Shop Demo
#  TCC.SD.002
  Scenario: Login valid test
    Given User enter url web shop demo
    When User click my account
    And User input valid username
    And User input valid password
    And User click button login
    Then User get text tittle page dashboard
#  TCC.SD.003
  Scenario: Login invalid password null test
    Given User logout
    When User input valid username
    And User delete password
    And User click button login
    Then User get text tittle error
#TCC.SD.004
  Scenario: Login invalid username null test
    Given User delete username
    When User input valid password
    And  User click button login
    Then User get text tittle error
