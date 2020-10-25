Feature: Verify the Pagantis Simulator for calculating Installment amount

Scenario Outline: Test scenario for Pagantis

Given user launched the pagantis
Then verify the title of page
When user enters 2 months for installment
Then verify the installment amount
Then Close the browser


Examples:
	| username | password |
	| naveenk  | test@123 |

		