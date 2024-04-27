## Master Plan Test

---
This document contains a general test plan for the project


## General information

---
We are testing the USSD code and checking everything works correctly.

## About the Test Target 

---
(For test engineer)
We are using a phone app calling the *1# and try to buy an internet package.

## Schedule

---
Until now there is no scheduling for our test plan.

## Tested Features and priorities

---
| Feature     | priority |
| ----------- | ----------- |
| [feature1](https://github.com/amirzib/USSD-Test/blob/main/appium/src/test/resources/feature/USSD.feature)      | red       |
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
We are using ***Appium*** with *** cucumber (gherklin)*** syntax based on java.

<br>
<br>
<br>

For more information click [here](https://github.com/amirzib/USSD-Test/blob/main/README.md).
