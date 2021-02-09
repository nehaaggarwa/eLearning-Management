Feature: Compose and send email to other account in system
Scenario: User is able to login and send email
Given The user is a registered user
When Enter valid Name "<user>" 
And Enter valid password "<pwd>"
And User clicks on Compose
And user enters send to "<To>"
And user enters subject "<Subject>"
And user enters message "<Message>"
And user click on Send button
Then I should see message sent

Examples:
|user 			 |pwd   			|
|neha.agrwl08|neha.agrwl08|

Examples:
|To 									 |Subject   			|Message  											 |
|Test User|Hi for Testing	|HI Mr Yogesh, Thanks for Testing|
