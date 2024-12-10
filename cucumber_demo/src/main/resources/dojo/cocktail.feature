Feature: Cocktail Ordering

  As a customer, I want to order drinks for someone, so that we can enjoy a great time together.

  Scenario: Creating an empty order
    Given "Romeo" who wants to buy a drink
    When an order is declared for "Juliette"
    Then there are 0 cocktails in the order

  Scenario: Ordering multiple cocktails
    Given "Alice" who wants to buy a drink
    When an order is declared for "Bob"
    And "Alice" adds the cocktail "Mojito"
    And "Alice" adds the cocktail "Pina Colada"
    Then there are 2 cocktails in the order
