@TES-4
Feature: Test as a admin , I can launch the App and login successfully

	@TEST_TES-1
	Scenario: verify user can launch app successfully 
		Given Launch chrome browser
		When Navigate to demoAPP url
	@TEST_TES-2
	Scenario: verify user can login successfully
		Given Enter username and password
		When Click Login button
	@TEST_TES-3
	Scenario: Close a browser
		Given I close a browser
