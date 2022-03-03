package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLogin {
	public WebDriver driver;
	
	
	
	

@Given("I am on the OpenMRS login page")
public void i_am_on_the_open_mrs_login_page() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.openmrs.org/openmrs/login.htm");
	
    
}

@When("I choose location as Registration Desk")
public void i_choose_location_as_registration_desk() {
	driver.findElement(By.id("Registration Desk")).click();
	
    
}

@When("I login using {string} and {string}")
public void i_login_using_and(String userID, String pass) {
	driver.findElement(By.id("username")).sendKeys(userID);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.id("loginButton")).click();
	
  
}

@Then("I should Logged in as admin at registration desk.")
public void i_should_logged_in_as_admin_at_registration_desk() {
Assert.assertTrue(	driver.findElement(By.xpath("//div[@class='container-fluid']/div[2]/div/h4")).isDisplayed());

    
}

@Then("I should see admin on the top")
public void i_should_see_admin_on_the_top() {
Assert.assertTrue(	driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']/ul/li/i")).isDisplayed());
    
}

@Then("My Location should be Registration desk")
public void my_location_should_be_registration_desk() {
	Assert.assertTrue(driver.findElement(By.id("selected-location")).isDisplayed());
	driver.quit();
    
}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
