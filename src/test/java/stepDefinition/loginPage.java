package stepDefinition;

import io.cucumber.java.en.When;
import static pages.loginPage.*;

public class loginPage {

    @When("User successfully enters the login details")
    public void User_successfully_enters_the_login_details() {
        sendkeys_username();
        sendkeys_password();
        click_loginBtn();
    }

    @When("User clicks on New Registration button")
    public void User_clicks_on_New_Registration_button() {
        click_newRegisterBtn();
    }
}
