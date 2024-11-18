package Com.pages;


import Com.StepDefination.PaymentPage;
import Com.StepDefination.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentSteps {
	
	ProductPage pp =new ProductPage();
	PaymentPage pay = new PaymentPage();
	
	@When("user add product into the basket")
	public void user_add_product_into_the_basket() {
		
	pp.addToCart();
	   
	}

	@When("user navigate to checkout")
	public void user_navigate_to_checkout() {
	   
		pp.clickonCartIcon();
		pp.clickonbutton();
		
	}

	@When("user enter user detials")
	public void user_enter_user_detials() {
		
		pay.enterUserDetials();
		pay.continuebutton();
		pay.finishbutton();
	   
	}

	@Then("validate the sucess message")
	public void validate_the_sucess_message() {
	    
	}

}
