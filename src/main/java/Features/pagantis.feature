Feature: Verify the Pagantis Simulator for calculating Installment amount

Scenario Outline: Test scenario for Pagantis

Given user launched the pagantis
Then verify the title of page
When installment of 12 months verify the installment amount
Then verify the installment amount of 11 months
Then verify the installment amount of 10 months
Then verify the installment amount of 9 months
Then verify the installment amount of 8 months
Then verify the installment amount of 7 months
Then verify the installment amount of 6 months
Then verify the installment amount of 5 months
Then verify the installment amount of 4 months
Then verify the installment amount of 3 months
Then verify the installment amount of 2 months

Then Close the browser


Examples:
	| Emi_installment | Amount |
	| Verify for various installment  | values |

		