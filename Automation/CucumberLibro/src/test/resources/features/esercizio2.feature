Feature: checkout

Scenario: A banana and an apple

Given the price of a "banana" is 40 c
And  25 c is the price of an "apple"
When I checkout 1 "banana"
And Now I checkout 1 "apple"
Then the total price should be 65 c
