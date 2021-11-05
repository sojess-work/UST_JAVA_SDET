Feature: This test the MercuryTours website

  Scenario: Test the passwords doesnt match warning
    Given the user navigates to "http://demo.guru99.com/test/newtours/register.php"
    When Enter email "abcde@gmail.com" in "email" and password "pass" in "password"
    And Enter confirm password "password"
    And click on "submit"
    Then verify "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/span" is displayed

  Scenario: Test Register
    Given the user navigates to "http://demo.guru99.com/test/newtours/register.php"
    When Enter email "abcde@gmail.com" in "email" and password "password" in "password"
    And Enter confirm password "password"
    And click on "submit"
    Then verify "sign-in" by linktext is displayed

  Scenario: Test sign in
    Given the user navigates to "http://demo.guru99.com/test/newtours/login.php"
    When Enter email "abcde@gmail.com" in "userName" and password "password" in "password"
    And click on "submit"
    Then verify "SIGN-OFF" by linktext is displayed

  Scenario: Test sign in failure
    Given the user navigates to "http://demo.guru99.com/test/newtours/login.php"
    When Enter email "abcde@gmail.com" in "userName" and password "pa" in "password"
    And click on "submit"
    Then verify "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/span" is displayed

    Scenario: Test country selectbox is working 
    Given the user navigates to "http://demo.guru99.com/test/newtours/register.php"
    Then check select "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select/option"