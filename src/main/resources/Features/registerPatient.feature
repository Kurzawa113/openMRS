Feature: OpenMRS login
login to OpenMRS as admin 

Scenario: 

Given I am on the OpenMRS login page
When  I choose location as Registration Desk
When  I login using "admin" and "Admin123"
And   I should see admin on the top
When I click 'patientRegister link'
Then I should see Register patient header
When I enter given name
And  I enter family name
And I click next icon
Then I should see patient's gender section
When I click male 
And I click next icon
Then I should see patients birthday section
When I enter day into the text box
And I click month select dromdown
And I enter year into text box
And I click next button icon
Then I should see patients address section
And I enter address into address text field 
And I enter city into city text field 
And I enter state into state text field 
And I enter country into country text field 
And I enter postal code into postalCode text field 
And I should click next icon
Then I should see patient phone number section
When I enter phone number
And I click next icon
Then I should see patient relate section
When I click onthe select relation type 
And I select patient
And I enter patient name
And I click next icon
And I click confirm button
Then I should patient's full name









