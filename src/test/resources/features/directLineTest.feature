Feature: Find the vehicle
  As a user I want to find the vehicle with registration number

  @validate-vehicle
  Scenario Outline: Validate the registartion number for a vehicle
    Given the user is navigated to the Insurance Portal
    When the user enters the vehicle <registration number>
    And the user clicks on Find vehicle button
    Then the user gets the results back

    Examples:
    |registration number|
    |"OV12UYY"          |
    |"dhf879"           |
    |"ov12uyy"          |
