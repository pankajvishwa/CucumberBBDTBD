Feature: Login Page Automation of Sauce Demo Login page.

 Scenario Outline: Check login is successful with valid credentials.
    Given  user is on login page.
    When user enters valid "<username>" and "<password>"
    And  click on login button
    Then  user should be navigated to homepage
    And  close the browser.
   Examples:
     | username        | password     |
     | standard_user   | secret_sauce |
     | locked_out_user | secret_sauce |
     | problem_user    | secret_sauce |
     | visual_user     | secret_sauce |