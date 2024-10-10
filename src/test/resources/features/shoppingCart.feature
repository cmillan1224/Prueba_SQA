Feature: I as a customer of floristeria san angel
  I need to purchase products on your web site.

  Scenario: Add 2 products to the shopping cart.
    Given the user is on the page
    When add a products to cart
    Then you should see the products and their quantities in the cart