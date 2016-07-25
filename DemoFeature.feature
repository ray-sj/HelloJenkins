Feature: test demo
	as a business user
	i want to be able to login to my application
	in order to perform a set task
	
Scenario: a successful login process
	Given the user is on the login page and entered valid credentials
	When they click on the Login button
	Then the Landing page is displayed
