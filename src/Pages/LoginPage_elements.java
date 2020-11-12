package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_elements {

	public LoginPage_elements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
 
	@FindBy(id = "username")
	private WebElement Username;

	@FindBy(xpath = ("//input[@id='password']"))
	private WebElement Password;

	@FindBy(xpath = ("//input[@name='login']"))
	private WebElement Submit_button;

	public void enter_name(String UN) {

		Username.sendKeys(UN);
	}

	public void enter_password(String PS) {

		Password.sendKeys(PS);
	}

	public void click_submit() {
		Submit_button.click();
	}

	public void clear_data() {
		Username.clear();
	}

}
