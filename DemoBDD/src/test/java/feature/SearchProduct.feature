Feature: Serach and place the order for product

Scenario: Search for product in home and offer page

Given User is on Greencart landing page
When User searched with shortname "tom" and extracted actual name of product
Then uesr searched for same "tom" in offers page to check for if product exist
And Validate product name in offers page matches with landing page 

