package stepDefs;

import io.cucumber.java.en.Given;
import pages.loginPage;

public class stepDefs {
	loginPage login;
	
	@Given("User is logged in")
	public void login_Page() {
		login = new loginPage();
		login.loginToApp();
	}
}
