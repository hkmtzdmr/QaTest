@login
Feature: login

  @UPGN-844
  Background: User enter the website
    Given User go to website
    Then User should see web title Login

    @UPGN-738
  Scenario: Users can log in with valid credentials
    When User enter valid credentials salesmanager
    And User click the login button
    Then User should see web title Odoo


  Scenario: Users can log in with valid credentials
    When User enter valid credentials posmanager
    And User click the login button
    Then User should see web title Odoo

  @UPGN-840
  Scenario: invalid username will not be login
    When User enter invalid username
    And User enter valid password
    And User click the login button
    Then User should see "Wrong login/password" alert

  @UPGN-841
  Scenario: invalid username will not be login
    When User enter valid username
    And User enter invalid password
    And User click the login button
    Then User should see "Wrong login/password" alert

  @UPGN-842
  Scenario: Please fill out this field" message should be displayed if the username is empty
    When User enter nothing as username
    And User enter invalid password
    And User click the login button
    Then User should see "Please fill out this field" alert

@UPGN-843
  Scenario: Please fill out this field" message should be displayed if the password is empty
    When User enter valid username
    And User enter nothing as password
    And User click the login button
    Then User should see "Please fill out this field" alert

  Scenario: Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.






