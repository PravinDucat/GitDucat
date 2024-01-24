Feature: Login

Scenario: Successful Login with Valid Credentials

Given user Launch Chrome Browser
When User open Reddiffmail URL 
Then user enters Email and Password
Then Click on Login
When User click on Log out button
Then close browser