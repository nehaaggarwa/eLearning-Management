Feature: Login Feature
This Application includes:
1) Login to application 
2) Compose an email

@Login
Scenario: Login as a registered User
Given Login application present
When Enter valid Name "<user>"
And Enter valid password "<pwd>"
And click on submit validButton
Then I should see Compose

Examples:
|user 			 |pwd   			|
|neha.agrwl08|neha.agrwl08|

@ComposeEmail
Scenario: To compose an email
Given User is logged into the application
When User clicks on Compose
When user enters send to "<To>"
And user enters subject "<Subject>"
And user enters message "<Message>"
And user click on Send button
Then I should see message sent "<Ack>"

Examples:
|To 			|Subject   			|Message  				               | Ack												  |
|Test User|Hi for Testing	|HI Mr Yogesh, Thanks for Testing| Test user user (username0987)|
