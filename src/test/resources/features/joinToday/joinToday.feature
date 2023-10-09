#language: en

#This feature provides a description of the necessary steps for
#a user to register in the system. Additionally, it provides a
#series of test cases to evaluate the system's quality.
@JOIN
Feature: Register
  As a Utest user
  I want to access the Utest site
  To register a user

  Scenario: Register a New User
    Given I am on the Utest site
    When I click on the Join Today button
    Then I should see the registration form

    When Enter the following information:
      | firstName           | lastName     | email                   | month    | day | year   |
      | Adrian              | Hernandez    | adrianhd789880@gmail.com  | December | 13  | 1996   |

    And I click the Next:Devices button
    And I click the Next:Last Step button
    And Enter the credentials in the fields:
      | createYourUTestpassword | confirmPassword |
      | SANfernando*2012      | SANfernando*2012 |
    Then I should be successfully registred "Participate in the uTest Academy"


