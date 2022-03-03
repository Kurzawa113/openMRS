package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterNewPatient {
	WebDriver driver;
	


@When("I click {string}")
public void i_click(String pateintRegister) {
	
	
	driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")).click();
	
	

}

@Then("I should see Register patient header")
public void i_should_see_register_patient_header() {
   
	
}

@When("I enter given name")
public void i_enter_given_name() {
   
	
}

@When("I enter family name")
public void i_enter_family_name() {
   
	
}

@When("I click next icon")
public void i_click_next_icon() {
   
}

@Then("I should see patient's gender section")
public void i_should_see_patient_s_gender_section() {
   
}

@When("I click male")
public void i_click_male() {
   
}

@Then("I should see patients birthday section")
public void i_should_see_patients_birthday_section() {
    
}

@When("I enter day into the text box")
public void i_enter_day_into_the_text_box() {
    
}

@When("I click month select dromdown")
public void i_click_month_select_dromdown() {
    
}

@When("I enter year into text box")
public void i_enter_year_into_text_box() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("I click next button icon")
public void i_click_next_button_icon() {
   
}

@Then("I should see patients address section")
public void i_should_see_patients_address_section() {
   
    throw new io.cucumber.java.PendingException();
}

@Then("I enter address into address text field")
public void i_enter_address_into_address_text_field() {
   
}

@Then("I enter city into city text field")
public void i_enter_city_into_city_text_field() {

}

@Then("I enter state into state text field")
public void i_enter_state_into_state_text_field() {
   
}

@Then("I enter country into country text field")
public void i_enter_country_into_country_text_field() {
   
}

@Then("I enter postal code into postalCode text field")
public void i_enter_postal_code_into_postal_code_text_field() {
   
}

@Then("I should click next icon")
public void i_should_click_next_icon() {
    
}

@Then("I should see patient phone number section")
public void i_should_see_patient_phone_number_section() {
   
}

@When("I enter phone number")
public void i_enter_phone_number() {
   
}

@Then("I should see patient relate section")
public void i_should_see_patient_relate_section() {
 
}

@When("I click onthe select relation type")
public void i_click_onthe_select_relation_type() {
   
}

@When("I select patient")
public void i_select_patient() {
   
}

@When("I enter patient name")
public void i_enter_patient_name() {
   
}

@When("I click confirm button")
public void i_click_confirm_button() {
   
}

@Then("I should patient's full name")
public void i_should_patient_s_full_name() {
  
}

















}
