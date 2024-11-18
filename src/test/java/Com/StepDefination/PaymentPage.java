package Com.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Myntra.Com.Myntra.Base;

public class PaymentPage extends Base {
	
	
	By firstname = By.xpath("//input[@id='first-name']");
	By lastname = By.xpath("//input[@id='last-name']");
	By postalcode = By.xpath("//input[@id='postal-code']");
	//a[@class='btn_action cart_button']
	By finishbtn = By.xpath("//a[@class='btn_action cart_button']");
	//input[@class='btn_primary cart_button']
	By continuebtn = By.xpath("//input[@class='btn_primary cart_button']"); 
	//By thankyoumessage = By.xpath(null)
	public void enterUserDetials () {
		
		clearandentertext(driver.findElement(firstname), "mohit");
		clearandentertext(driver.findElement(lastname), "sharma");
		clearandentertext(driver.findElement(postalcode), "123456");
	}
	
	
	public void finishbutton()
	{
		
		WebElement finishbutton= driver.findElement(finishbtn);
		clickonelement(finishbutton);
	}
	public void continuebutton()
	{
		
		WebElement continuebutt= driver.findElement(continuebtn);
		clickonelement(continuebutt);
	}
	
}
