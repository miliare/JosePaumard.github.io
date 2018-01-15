Feature: Minesweeper game

  Scenario: An empty 1x1 field
    Given The following field
    """
    1 1
    .
    """
    When The resulting field is computed
    Then The result is the following
    """
    0
    """

  Scenario: An mined 1x1 field
    Given The following field
    """
    1 1
    *
    """
    When The resulting field is computed
    Then The result is the following
    """
    *
    """

  Scenario: An mined 1x2 field
    Given The following field
    """
    1 2
    ..
    """
    When The resulting field is computed
    Then The result is the following
    """
    00
    """