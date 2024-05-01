package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static pages.onlineProductsPage.*;

public class onlineProductsPage {

    @When("User clicks on Formal shoes dropdown")
    public void User_clicks_on_Formal_shoes_dropdown() {
        click_formalShoesDropdown();
    }

    @Then("User should be able to view the products")
    public void User_should_be_able_to_view_the_products() {
        getText_FormalShoesFirstValue();

    }
}
