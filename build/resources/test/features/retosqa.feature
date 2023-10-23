#Autor: Elkin Fabian Alfonso Bermudez
  @stories
  Feature: Select two products of the category "Amor" and add them to the buycar
  @scenario1
  Scenario: Add two products to buy car
    Given Open page
    When the customer selects amor category and add two products
    Then those products are adding to the buycar
