package PageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAccount extends HomePage {
WebDriver driver;
DeleteAccount(WebDriver driver) {
	super(driver);
}
@FindBy (xpath = "//a[text() = ' Delete Account']")
WebElement txt_Delete;

public void delete() {
	txt_Delete.click();
}


}
