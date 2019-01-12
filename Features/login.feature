@Login
Feature: As a site visitor 
I want to login to the page
so that i can see all the services provided

Scenario Outline: login to the page successfully
Given As a user i am on home page
When i entered "<username>" "<password>"
And i clicked on submit button
Then i was able to log in

Examples:
         |username| |password|
         |Admin   | |admin123|