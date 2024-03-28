Feature: MagicBrick  App Login
Scenario: Login successful
Given I am on MagicBrick  page
Given I am on Magic Bricks App Login
When I enter email as "bonelaharipriya2001@gmail.com"
And I click on  email next
And I enter password as "Priya@123"
And I click Login
And I click on Continue
Then I am Logged in Successfully

Scenario: Select the Property Services
Given I am on MagicBrick  page
Given I am on Magic Bricks App Login
When I enter email as "bonelaharipriya2001@gmail.com"
And I click on  email next
And I enter password as "Priya@123"
And I click Login
And I click on Continue
Then I am Logged in Successfully
When I click on PropertyServices 
And I click on Rent Agreement 
Then I am on get free Rent agreement page

Scenario: Select the Property Services
Given I am on MagicBrick  page
Given I am on Magic Bricks App Login
When I enter email as "bonelaharipriya2001@gmail.com"
And I click on  email next
And I enter password as "Priya@123"
And I click Login
And I click on Continue
Then I am Logged in Successfully
When I click on PropertyServices 
And I click on Rent Agreement 
When I am on get free agreement 
And I click on owner 
And I click next button 
Then I get Invalid credentials

Scenario: Select the Property Services
Given I am on MagicBrick  page
Given I am on Magic Bricks App Login
When I enter email as "bonelaharipriya2001@gmail.com"
And I click on  email next
And I enter password as "Priya@123"
And I click Login
And I click on Continue
Then I am Logged in Successfully
When I click on PropertyServices 
And I click on Rent Agreement 
When I click on get free agreement 
And I click on owner Basic details
And I enter address as "chennai"
And I enter pincode as "402342"
And I enter city as "Chenna"
And I enter state as "Chhattisgarh"
And I click on Next
Then Tenent page apprears
@SanityTest
Scenario: Select the Property Services
Given I am on MagicBrick  page
Given I am on Magic Bricks App Login
When I enter email as "bonelaharipriya2001@gmail.com"
And I click on  email next
And I enter password as "Priya@123"
And I click Login
And I click on Continue
Then I am Logged in Successfully
When I click on PropertyServices 
And I click on Rent Agreement 
When I click on get free agreement
When  I click on tenant Basic details
And I enter tenant address as "Chennai"
And I enter tenant pincode as "402342"
And I enter tenant city as "Chenna"
And I enter tenant state as "Chhattisgarh"
And I click on Next
Then the agreement will appear
