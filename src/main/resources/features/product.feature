Feature: Add Product Web Shop Demo
#  TCC.SD.005
  Scenario: Add Product
    Given User login
    When User click demo site
    And User select product
    And User select color product
    And User select size product
    And User click button add to cart
    Then User get text tittle add to cart
#    TCC.SD.006
  Scenario: Add Product 2
    Given User click product
    When User select product 2
    And User select color product
    And User select size product
    And User click button add to cart
    Then User get text tittle add to cart
#    TCC.SD.007
  Scenario: Checkout
    Given User click cart
    When User click proceed to checkout
    And User click alert
    And User click button place order
    Then User get text tittle checkout
