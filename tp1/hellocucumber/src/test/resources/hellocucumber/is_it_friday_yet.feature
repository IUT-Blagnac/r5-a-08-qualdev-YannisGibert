# language: en
Feature: Is it Friday yet?
  Everybody wants to know if it's Friday yet.

  Scenario Outline: Determine if it's Friday
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

    Examples:
      | day            | answer |
      | Friday         | TGIF   |
      | Sunday         | Nope   |
      | anything else! | Nope   |
