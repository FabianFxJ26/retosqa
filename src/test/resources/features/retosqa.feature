#Autor: Elkin Fabian Alfonso Bermudez
@stories
Feature: Select two products of the category "Amor" for add them to the buycar
    #First scenario with two steps.
  @scenario1
  Scenario: Add two products to buy car
    Given Open page
    When the customer selects amor category and add two products
    #Second scenario with tree steps.
  @scenario2
  Scenario: Select one product of the category "Cumpleanios" add and delete to the buycar
    Given select the product
    When it add the product to the buy car
    And  it is deleting to the buy car

