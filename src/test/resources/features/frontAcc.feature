Feature: Login Functionality
Scenario Outline: To do data driven testing on Login Functionality
Given user is on login page
When user enters usename as "<userName>" & password as "<passWord>" & clicks on login
Then login "<loginType>" be happen

Examples:
   | userName | passWord | loginType |
   | demouser | password | should    |
   | hr       | hr123    | shouldNot |
   | demo     | demo123  | shouldNot |
    