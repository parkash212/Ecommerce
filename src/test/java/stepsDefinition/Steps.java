package stepsDefinition;

import java.time.Duration;
import java.util.ResourceBundle;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectClass.DeleteAccount;
import PageObjectClass.HomePage;
import PageObjectClass.Login;
//import io.cucumber.core.logging.Logger;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class Steps {
	WebDriver driver;
	HomePage hp;
	Login li;
	DeleteAccount Da;      
	Logger logger; // for logging
	ResourceBundle rb; // for reading properties files
	String br; // for store browser name
	
	@Before
	public void setup() { // Junit hook - executes once before starting
		//for logginf
		logger = LogManager.getLogger(this.getClass());
		// readingconfig.properties ( for browser)
		rb = ResourceBundle.getBundle("config");
		
		//macc = new MyAccountPage(driver);
	}
    @After
    public void tearDown(Scenario scenario) {
        System.out.println("Scenario status ======>"+scenario.getStatus());
        if(scenario.isFailed()) {
        	
        	TakesScreenshot ts=(TakesScreenshot) driver;
        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName());
        	            
        }
       driver.quit();
    }
	@Given("User Launch Browser")
	public void user_launch_browser() {
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Given("opens URL {string}")
	public void opens_url(String string) {
		driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
	}
	@When("User click on Login")
	public void user_click_on_login()  {
		li = new Login(driver);
		li.ClickLogin();  
	}
	@When("User Enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String string, String string2) {
		li.setEmail("parkash@mailinator.com");
		li.setpassword("1234567890"); 
	}
	@When("Click on Login Button")
	public void click_on_login_button() {
		li.ClickButton();  
	}
	@Then("User navigates to MyAccount page")
	public void user_navigates_to_my_account_page() {
	    
	}

}
