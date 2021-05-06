#Application=http://tutorialsninja.com/demo/index.php
Feature: Register for an account in TutorialsNinja application

@register
Scenario: Register for the application by providing valid user details
Given I navigate to Register page
When I enter the below details
		|firstName	|Aaaaa						|
		|lastName	|Bbbbb						|
		|email				|abc@xyz.com	|
		|telephone	|1234567890		|
		|password	|test@123				|
And I select the privacy policy option
#And I click on Continue button
#Then I should be able to successfully register