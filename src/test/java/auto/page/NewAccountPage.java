package auto.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountPage extends BasePage{

	public NewAccountPage(WebDriver driver) {
		super(driver);
		//Alert
	      
//	      Alert alert = driver.switchTo().alert();
//	      String alertText = alert.getText();
//	      String customerID = alertText.substring(alertText.lastIndexOf(":") + 1);
//	      alert.accept();
//	      //Input Account
//	        driver.findElement(By.xpath("//a[@href='addAccount.php']")).click();
//			driver.findElement(By.name("cusid")).sendKeys(customerID);
//			driver.findElement(By.xpath("//select[@name=\"selaccount\"]/option[@value=\"Current\"]"));
//
//		    //driver.findElement(By.xpath("//option[@value=\"Savings\"]")).click();
//			driver.findElement(By.name("inideposit")).sendKeys("100");
//			driver.findElement(By.xpath("//input[@type=\"submit\"and@value=\"submit\"]")).click();	}

}
}