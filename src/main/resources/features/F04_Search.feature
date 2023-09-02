@smoke
Feature:  F04_user could use search functionality
  Scenario Outline: user could search using product name
    Given user insert productName "<productName>" in search field
    And   user press on search button
    Then  user get the result of search correctly "<productName>"
    Examples:
      |productName|
      |book|
      |laptop|
      |nike|
  Scenario Outline: user could search using serial number of the product
    Given  user insert serial "<sku>" in search field
    And  user press on search button
    Then  user get the search result successfully "<sku>"
    Examples:
      |sku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|