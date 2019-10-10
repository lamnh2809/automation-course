package auto.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{


	private static final By BTN_SUBMIT_LOGIN = By.name("btnLogin");
	private static final By BY_PASSWORD = By.name("password");
	private static final By BY_USERNAME = By.name("uid");

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	
}
	
	public void enterUsername (String username) {
		driver.findElement(BY_USERNAME).sendKeys(username);

	}
	
	public void enterPassword(String password) {
		driver.findElement(BY_PASSWORD).sendKeys("password");
		
	}
	
	public void clickSubmitButton () {
	 	driver.findElement(BTN_SUBMIT_LOGIN).click();

	}
	
	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickSubmitButton();
	}
}