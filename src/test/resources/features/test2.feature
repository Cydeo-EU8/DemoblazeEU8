Feature: Purchase Functionality of Demoblaze Application
  As a buyer, I should be able navigate through products
  so that I can purchase from application online
  @wip
  Scenario: Adding product to cart
    Given buyer is on the homepage of demoblaze
    When buyer adds from "Phones" category "Samsung galaxy s6" product to cart
    And buyer clicks on "Cart" link
    Then buyer should see "Samsung galaxy s6" is added to cart