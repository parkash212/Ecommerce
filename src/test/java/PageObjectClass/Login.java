package PageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends HomePage {
	WebDriver driver;
	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy (xpath = "//a[text() = ' Signup / Login']")
	WebElement txt_Login;
	
	@FindBy(name = "email")
	WebElement txt_Email;
	
	@FindBy (name = "password")
	WebElement txt_password;
	
	@FindBy (xpath = "//button[text() = 'Login']")
	WebElement txt_click;
	
	public void ClickLogin() {
		txt_Login.click();
	}
		public void setEmail(String email) {
			txt_Email.sendKeys(email);
		}
		public void setpassword(String password) {
			txt_password.sendKeys(password);
		}
		public void ClickButton() {
			txt_click.click();
		}
		
		
	}

