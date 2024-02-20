Feature: Login page Automation of saucedemo App
  Scenario Outline: Check login is successful with data creds
   
    Given User is on login page

    When User enters valid "<username>" and "<password>"
    And Clicks on Login Button
    Then User is navigated to Hpme Page
    And Close the browser
    
    

    Examples: 
      | username  | password |
      | standard_user |secret_sauce| 
      | locked_out_user|secret_sauce|
			|problem_user|secret_sauce|
			|performance_glitch_user |secret_sauce| 
