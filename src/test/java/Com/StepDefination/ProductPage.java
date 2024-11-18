package Com.StepDefination;

import org.openqa.selenium.By;

import Com.Myntra.Com.Myntra.Base;


public class ProductPage extends Base {
	
	
	By addTocart = By.xpath("((//button[@class='btn_primary btn_inventory'])[1])");
	
	By carticon = By.xpath("(//a[@class='shopping_cart_link fa-layers fa-fw'])");
	By btn = By.xpath("(//a[@class='btn_action checkout_button'])");
	
//btn_action checkout_button

	public void addToCart () {
		
     clickonelement(driver.findElement(addTocart));		
	}
	public void clickonCartIcon() {
		
		clickonelement(driver.findElement(carticon));
	}
	public void clickonbutton() {
	clickonelement(driver.findElement(btn));
		
	}
	
}