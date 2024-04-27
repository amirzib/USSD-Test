## Master Plan Test

---
This document contains general test plan for project


## General information

---
We are testing the USSD code and checking everything work correctly.

## About the Test Target 

---
(For test engineer)
We are using phone app calling the *1# and try to buy a internet package.

## Schedule

---
Untill now there is no scheduling for our test plan.

## Tested Features and prioritys

---
| Feature     | priority |
| ----------- | ----------- |
| [feature1](http://192.168.2.20/test-script/ussd-test/-/blob/dev/appium/src/test/resources/feature/USSD.feature?ref_type=heads)      | red       |
|     |      |

feature1 is about calling *1#.
```
Feature: USSD

Scenario: testing *1#
Given I open phone app
When I open the key pad
And I enter code and call
And I choose internet
And I choose hamrah aval
And I choose CIP
Then It should not available

```

## Testing Environments

---
We are using ***Appium*** with ***cucmber(gherklin)*** syntax based on java.

<br>
<br>
<br>

For more information click [here](http://192.168.2.20/test-script/ussd-test/-/blob/dev/README.md?ref_type=heads).
