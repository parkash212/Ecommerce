Feature: Login with valid credentials

  # cntl+shift+f
  @sanity
  Scenario: Successful with valid credential
    Given User Launch Browser
    And opens URL "https://automationexercise.com/"
    When User click on Login
    And User Enter Email as "parkash@mailinator.com" and Password as "1234567890"
    And Click on Login Button
    Then User navigates to MyAccount page
