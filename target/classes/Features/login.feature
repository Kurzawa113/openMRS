Feature: OpenMRS login
login to OpenMRS as admin 

Scenario: login to the application as admin 

Given I am on the OpenMRS login page
When  I choose location as Registration Desk
When  I login using "admin" and "Admin123"
Then  I should Logged in as admin at registration desk.
And   I should see admin on the top
And   My Location should be Registration desk 



