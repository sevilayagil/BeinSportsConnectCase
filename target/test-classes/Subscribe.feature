Feature: subscribe
  Background:
    Given a web browser is at the BeinSportsConnect home page
    @subs
  Scenario: User navigate to site and fills user form after fills card detail and show popup
      When user clicks subscribe button and selects Monthly Pass with One Week Free Trial
    And user fills user information detail and click create account button
    And  user fills card detail and clicks confirm payment method
    Then user shows error popup