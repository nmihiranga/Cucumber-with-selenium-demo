package stepDefinition;

import io.cucumber.java.en.Then;
import static pages.registrationPage.*;

public class registrationPage {

    @Then("User is able to view the Registration page")
    public void User_is_able_to_view_the_Registration_page() {
        visibility_userRegistrationPage();
    }
}
