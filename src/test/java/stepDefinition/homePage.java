package stepDefinition;

import io.cucumber.java.en.Given;
import static pages.homePage.*;

public class homePage {

    @Given("User navigates to the Login page")
    public void User_navigates_to_the_Login_page() throws InterruptedException {

        click_humbergerMenu();
        click_signinLink();
    }
}
