Feature: Searching by brand on Amazon
  Scenario: The displayed products have the selected brand
    Given user open amazon homepage
    When user chooses category
    And chooses featured brand
    Then user verify that displayed products have the selected brand