Feature: Background Demo
  Background: user is logged in to sauce demo Application
    Given user access the sauce demo login pge
    When user enters valid "<username>" and "<password>"
    Then user should be navigated to home page


    Scenario: Test Menu items
      When user clicks on breadcrumb icon
      Then user should be able to see the menu items


      Scenario: Verify Add to card Functionality
        when user clicks on add to cart button
        Then item should be aded to the cart
