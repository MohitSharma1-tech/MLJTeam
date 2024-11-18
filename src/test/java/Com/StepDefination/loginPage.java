package Com.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Myntra.Com.Myntra.Base;





public class loginPage extends Base {
	By username = By.xpath("//input[@id='user-name']");

	By password = By.xpath("//input[@id='password']");
	By loginbutton = By.xpath("//input[@id='login-button']");

	public void launchUrl() {
		setup();
	}  

	public void enterusernameandpassword() {
		
		// WebElement username =  driver.findElement(By.xpath("//input[@id='user-name']"));
	     // username.sendKeys("standard_user");
	    //  WebElement passsword =  driver.findElement(By.xpath("//input[@id='password']"));
	    //  passsword.sendKeys("secret_sauce");

		WebElement user = driver.findElement(username);
		clearandentertext(user, prop.getProperty("username"));
		WebElement pass = driver.findElement(password);
		clearandentertext(pass, prop.getProperty("password"));
	}

	public void clickonbutton() {
		WebElement loginbut = driver.findElement(loginbutton);
		clickonelement(loginbut);
		
	}
}