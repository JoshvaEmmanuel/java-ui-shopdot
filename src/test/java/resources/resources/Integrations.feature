Feature: To Check the Functionality of the Integrations

Scenario: To check the Integration scetion in the ShopDot Application

Given To launch the Chrome Browser and Maximise window
When To launch the URL of the ShopDot Application and Complete the login Flows
And To User Clicks on the Integration menu from Settings
And User enters the store name and clicks on Connect Shopify button
And It routed to the Shopify pages for authentication and granting of permission to ShopDot in accessing the Brand’s Shopify Store
Then ShopDot displays in Integration screen that Shopify integration is connected

Scenario: User to Check integration with Shopify has been disconnected
When User clicks on the disconnected button
Then  Should error message: “Your brand profile is not visible to retailers because your Shopify store is disconnected

Scenario: integration with Shopify has again connected
When User clicks on Reconnect Shopify button
Then ShopDot displays in Integration screen that Shopify integration is connected

Scenario: Entres Incorrect format when entering Shopify store
When Brand enters an incorrect format when entering Shopify store
And User clicks on Connect
Then error message is displayed: “Please only enter the name of your store”

Scenario: when Disconnect from Shopify
When clicks on “Disconnect from Shopify”
And ShopDot displays the confirmation message on a pop up
And User clicking on Cancel will just close the pop up
Then ShopDot disconnects the integration with Brand’s Shopify store

