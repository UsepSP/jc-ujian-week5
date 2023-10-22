Feature: Login Web Shop Demo
  #TCC.SD.001
  Scenario: Dashboard Login
    Given User enter url web shop demo
    When User click my account
    And User input valid username
    And User input valid password
    And User click button login
    Then User get text tittle page dashboard
