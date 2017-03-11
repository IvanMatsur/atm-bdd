Feature: Add to cart

Scenario: Adding to cart found item
  Given I set search request "Playstation 4 pro"
  When I perform search
  And I open the top offer
  And I add the item to cart
  Then the item "Playstation 4 pro" should be added to my cart

Scenario Outline: Adding to cart found item
  Given I set search request "<item>"
  When I perform search
  And I open the top offer
  And I add the item to cart
  Then the item "<item>" should be added to my cart

  Examples:
    | item                |
    | Asus z170m-plus     |
    | Pentium g4520       |
    | Xbox One            |
    | Samsung T24E390EW   |