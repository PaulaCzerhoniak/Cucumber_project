Feature: Amazon Logo
  Scenario: Logo presence on Amazon HomePage
    Given user launch chrome browser
    When user open amazon homepage
    Then user verify that logo is present on homepage
    And close browser