Feature: Login Action

  Scenario: Login to the application
    #TC-1
    Given Launch the application
    Then Validate user is on home page
    #TC-2
    And Click on registration button
    And Fill the mandatory field for registration
    #TC-3
    And Validate registration is completed successfully
    And quit the application






