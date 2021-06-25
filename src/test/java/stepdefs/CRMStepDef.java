package stepdefs;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;


public class CRMStepDef extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	@Given("User is already on login page")
	public void usloginPageer_is_already_on_login_page() {
	initialize();
	
	}
		@When("User enters login credential")
		public void user_enters_login_credential(DataTable userCred) {
			loginPage = new LoginPage();
			List<Map<String, String>> data = userCred.asMaps();
			loginPage.login(data.get(0).get("uname"),data.get(0).get("pwd"));
		
		}
		
		@Then("User is on Home Page")
		public void user_is_on_home_page() {
			homePage = new HomePage();
			boolean isValid = homePage.isUserLoggedIn();
			Assert.assertTrue(isValid);
		}
		@Then("Close Browser")
		public void close_browser() {
			driver.close();
}
}
