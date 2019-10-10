package auto.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPage extends BasePage {

	public NewCustomerPage(WebDriver driver) {
		super(driver);
		//driver.findElement(By.xpath("//input[@type=\"date\"and @name=\"dob\"]")).sendKeys("02081989");
		//driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).sendKeys("abc");
//		driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"city\"]")).sendKeys("HCM");
//		driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"state\"]")).sendKeys("BT");
//		driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"pinno\"]")).sendKeys("123456");
//		driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"telephoneno\"]")).sendKeys("84382882955");
//		;
//		driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"emailid\"]")).sendKeys("phantram124@gmail.com");
//		driver.findElement(By.xpath("//input[@type=\"submit\" and @name=\"sub\"]")).click();
	}



	public void EnterCustomerName(String CustomerName) {
		driver.findElement(By.xpath("//input[@type=\"text\"and@onkeyup=\"validatecustomername();\"]"))
				.sendKeys(CustomerName);
		;

	}

	public void SelectGender() {
		driver.findElement(By.xpath("//input[@type=\"radio\" and @name=\"rad1\"][2]")).click();
	}
}