
Feature: Testing API endpoints on sportyshoe page

 Scenario: get the details from sportyshoe page
 
  When I get all shoes from sportyshoe page
  Then  I list the  all registered users
  Then  I Add the product to cart
  And I Update the product
  Then I Delete the product
  