Feature: To the Check the functionalities of the Retailer Sign up/Sign in

Scenario: To Validate the Retailer Sign up
Given To launch the Chrome Browser and Maximise window  
When launch the URL of the ShopDot Application
And Complete the Signup Flows
And Retailer clicks Sign Up button
And ShopDot displays the screen Retailer or Brand Supplier
And user clicks on “Retailer” and clicks on Next
Then the Url Should Contain "retailer-onboarding" Retailer Onboarding Screen will be displayed
 
Scenario: To Check Mandatory fields validation
Given To launch the Chrome Browser and Maximise window
When  launch the URL of the ShopDot Application
And The User Left  mandatory fields blank in Sign Up Screen
Then Sign Up button in Sign Up Screen will be disabled
 
 
Scenario: Password has invalid format
Given To launch the Chrome Browser and Maximise window 
When To launch the URL of the ShopDot Application and Complete the Signup Flow
And enters a password that has an invalid format
Then  error message is displayed

Scenario: Email address is already registered and verified
Given To launch the Chrome Browser and Maximise window
When To launch the URL of the ShopDot Application and Complete the Signup Flow
And enters an email address that is already registered and verified
Then the error message is displayed

Scenario: Terms link
Given  To launch the Chrome Browser and Maximise window
When To launch the URL of the ShopDot Application
And user clicks on the “Terms” link from the checkbox in Sign Up Screen
Then Terms of Use Screen will be displayed on a separate tab

Scenario: Privacy Policy link
Given  To launch the Chrome Browser and Maximise window
When To launch the URL of the ShopDot Application
And  user clicks on the “Privacy Policy” link from the checkbox in Sign Up Screen
Then Privacy Policy Screen will be displayed on a separate tab

Scenario: Sign in 
Given  To launch the Chrome Browser and Maximise window
When To launch the URL of the ShopDot Application
And Retailer Enters email address
And Retailer Enters Password 
Then Retailer goes directly to the Dashboard

Scenario: Email address has invalid format
Given  To launch the Chrome Browser and Maximise window
When To launch the URL of the ShopDot Application
And user enters an email "gmail.com" address in invalid format
Then the following error message is displayed below the Email Address field: “Email address must be in correct format”

Scenario: Login when user is not yet verified
Given Launch the URL of Shopdot
When user enters email address
And user enters email password
And clicks on Sign In button from Login Screen
Then ShopDot resends the verification email to the entered email address

Scenario: Forgot Password
Given Launch  Shopdot URL
When User clicks on Forgot Password from Login Screen
And Email Address Input Screen will be displayed
And  Enter Email Address in Email Input
And Click on the Send Email button
Then displays the following message on screen: “We have sent instructions on how to change your password to your registered email”

Scenario: Email is NOT a registered user in ShopDot
Given Launch  Shopdot URL
When User clicks on Forgot Password from Login Screen
And User enters his email address and clicks on Send email button from Email Address Input Screen
And ShopDot verifies that entered email address is NOT a registered email
Then displays the following message on screen

Scenario: Change Password from Link
When User clicks on “Reset Password” link from the email sent
And Reset Password Screen is displayed
And User enters mandatory fields and clicks on Confirm button from Reset Password Screen
Then ShopDot saves the new password and displays the  message on screen: “Your password is successfully changed”

Scenario: Passwords do not match
When User enters mandatory fields and clicks on Confirm button from Reset Password Screen
And ShopDot verifies that the new password and confirm new password are not the same
Then ShopDot displays the error message below the Confirm New Password field: “Passwords do not match” 

Scenario: New Password requirements are not met 
When User enters the new password
And ShopDot verifies that it does not meet the password requirements
Then an error message will be displayed below the New Password field













