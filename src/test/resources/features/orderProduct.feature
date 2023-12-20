#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Order a product
  @tag1
  Scenario: Add items to cart
    Given User is logged in
    When User adds items to cart      
    Then Item should be added to the cart
    
  @tag2
  Scenario: Delete an item
    Given User is on carts page
    When User deletes an item
    Then Item should be deleted from the cart
    
  @tag2
  Scenario: Place order
    Given User is on carts page
    When User places order
    Then Order should be placed

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
