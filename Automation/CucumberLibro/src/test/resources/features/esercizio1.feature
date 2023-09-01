Feature: checkout

Scenario: Two bananas scanned separately

Given the price of a "banana" is 40 c
When I checkout 1 "banana"
And I checkout again 1 "banana"
Then the total price should be 80 c