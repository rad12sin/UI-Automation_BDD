Feature: Verify the Pagantis Simulator for calculating Installment amount

Scenario Outline: Test scenario for Pagantis

Given user launched the Swag labs
Then verify the title of page
When login with valid user
Then verify the header
And verify the sort filter
When add product in cart
Then validate the cart functionality
When remove the product from cart
Then validate the cart functionality after removing the product
When open cart page
Then validate the cart page
Then verify the header
Then Close the browser


Examples:
	| Sanity| Test Case Count |
	|  Swag Labs Sanity | 5|

		