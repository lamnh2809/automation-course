package auto.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void openHomePage() {
    driver.navigate().to("http://demo.guru99.com/Agile_Project/Agi_V1/");
	}
	
	//%s replace for static name
	public void clickMenu(String name) {
		driver.findElement(By.xpath(String.format("//ul[@class=\"menusubnav\"]/li/a[text()=\"%s\"]", name)));
	}

}
