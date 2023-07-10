Feature: Login Data Driven with Excel

@UserLogin
  Scenario Outline: Login Data Driven Excel
    When User in on login page
    #And click on Login
    Then check User navigates to HomePage Page by passing Email and Password with excel row "<row_index>"

    Examples:
      |row_index|
      |1|
      |2|
      |3|
    