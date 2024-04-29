Feature: What did anon say under Leanne's post??
  Did anon delete their comment under Leanne's post

  Scenario: Retrieve the controversial comment left under Leanne's post
    Given list of users
    When I confirm "Leanne Graham"'s user ID of 1
    Then I should find the comment titled "eum et est occaecati" 