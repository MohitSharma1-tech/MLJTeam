Feature: Payment functionality
@test
Scenario:verify user is able to place an order
Given user launch url site
When user enter username and password
And user click on Login button
When user add product into the basket 
And user navigate to checkout 
And user enter user detials 
Then validate the sucess message
