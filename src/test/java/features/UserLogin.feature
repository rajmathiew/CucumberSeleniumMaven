Feature: Login to OrangeHRM

  Scenario: Login with valid credentials
    Given Valid username and password
    When I entered username and password on the Orange HRM login page
    Then I should successfully login to the OrangeHRM homepage

