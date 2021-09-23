Feature: Addition
 
 Scenario: Addition of two number
 Given I have two numbers as "98" & "12"
 When I do Addition
 Then Result should display in console
 
 
 Scenario: Addition of two number with List
 Given I have two numbers as below List
 |10|
 |20|
 When I do Addition
 Then Result should display in console
 
 Scenario: Addition of two number with Map
 Given I have two numbers as below Map
 |num1|60|
 |num2|40|
 When I do Addition
 Then Result should display in console
 