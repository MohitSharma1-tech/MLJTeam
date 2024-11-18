package Com.pages;

import Com.StepDefination.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginPageStep {
	
	loginPage login = new loginPage();
	
	@Given("user launch url site")
	public void user_launch_url_site() {
	   login.launchUrl();
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
     login.enterusernameandpassword();
	}

	@When("user click on Login button")
	public void user_click_on_login_button() {
     login.clickonbutton();
	}

	

}
