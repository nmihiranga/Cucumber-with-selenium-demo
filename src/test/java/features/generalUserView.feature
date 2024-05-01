Feature: General view

  Scenario: Validate general user is able to view products without login in
    Given User navigates to the Online products page
    When User clicks on Formal shoes dropdown
    Then User should be able to view the products