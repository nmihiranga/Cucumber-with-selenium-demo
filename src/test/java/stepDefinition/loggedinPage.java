package stepDefinition;

import io.cucumber.java.en.Then;
import static pages.loggedinPage.*;

public class loggedinPage {

    @Then("User should be able to view the product category page")
    public void User_should_be_able_to_view_the_product_category_page() {
        visibilityProductCategory_formalShoes();
        visibilityProductCategory_sportsShoes();
        visibilityProductCategory_sneakersShoes();
    }
}