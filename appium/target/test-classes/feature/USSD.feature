Feature: USSD

Scenario: testing *1#
Given I open phone app
When I open the key pad
And I enter code and call
And I choose internet
And I choose hamrah aval
And I choose CIP
Then It should not available
