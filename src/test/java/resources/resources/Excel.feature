Feature: To Download, Edit and Upload Excel from the Application

Scenario Outline: To download the Excel from “Download All Products” in Application

Given To launch the Chrome Browser and Maximise window
When To launch the URL of the ShopDot Application and Complete the login Flow
And To User Clicks on the Products 
And User clicks on “Download All Products” from Products Main,
And ShopDot downloads all of the brand’s products on an xls file
And User clicks on Upload file on Products Main
And User Uploads the file
Then confirmation screen is displayed

