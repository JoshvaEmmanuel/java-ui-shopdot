Feature: To Validate Security menu from the Setting Page

Scenario Outline: To Change the Password with the Valid Credantials

Given To launch the Chrome Browser and Maximise window
When To launch the URL of the ShopDot Application and Complete the login Flows
And To User Clicks on the Security menu from Settings
And User enters the Data in "<Old Password>" in the Change Password Field
And The User enters the Data in "<New Password>" in the Change Password Field
And Again User enters the Data in "<Confirm Password>" in the Change password Field
And User Clicks on the Save button
Then ShopDot Saves the new password and Display the Message Password Sucessfully Changed and Close the Window

Examples:
|Old Password |New Password|Confirm Password|
|Welcome6@321 |Welcome6@123|Welcome6@123    |


Scenario Outline: To Valid the security with invalid credantials

Given To launch the Chrome Browser and Maximise window
When To launch the URL of the ShopDot application and complete the login Flow
And The User Clicks on the Security menu from Settings
And The User enters the Invalid Data in "<Old Password>" in the Change Password Field
And The User enters the Valid Data in "<New Password>" in the Change Password Field
And The User enters the  Valid Data in "<Confirm Password>" in the Change password Field
And The User Click on the Save button
Then  Display the Message Invalid Password and Close the Window

Examples:
|Old Password |New Password|Confirm Password |
|Welcome      |Welcome6@321|Welcome6@321     |


Scenario Outline: To Valid the security with invalid credantials

Given To launch the Chrome Browser and Maximise window
When To launch the URL of  ShopDot application and complete the login Flow
And  User Clicks on the Security menu from the Settings
And the User enters the Correct Data in "<Old Password>" in the Change Password Field
And the User enters the Data in "<New Password>" in the Change Password Field
And the User enters the  Invalid Data in "<Confirm Password>" in the Change password Field
And then User Click on the Save button
Then  Error Message Display Passwords do not match and Close the Window

Examples:
|Old Password |New Password |Confirm Password |
|Welcome6@123 |Welcome6@321 |Welcome6@213     |

Scenario Outline: To Valid the security with invalid credantials

Given To launch the Chrome Browser and Maximise window
When launch the URL of the ShopDot application and complete the loginFlow
And  User Click on the Security menu from Settings Page
And User enters the required Data in "<Old Password>" in the Change Password Field
And User enters the Data which is not met the requirement in "<New Password>" in the Change Password Field
And User enters the  required Data in "<Confirm Password>" in the Change password Field
And then the User Click on the Save button
Then  Error Message Display New Password requirements not met and Close the Window

Examples:
|Old Password |New Password |Confirm Password |
|Welcome6@123 |welcome6@321 |Welcome6@213     |





