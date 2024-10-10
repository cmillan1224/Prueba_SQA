package co.sqasa.stepdefinitions;

import co.sqasa.tasks.NavigateTo;
import co.sqasa.hooks.TheActor;
import co.sqasa.questions.VerifyCart;
import co.sqasa.tasks.AddProducts;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;

public class CartStepDefinition {
    @Given("the user is on the page")
    public void theUserIsOnThePage() {
        TheActor.actor.attemptsTo(NavigateTo.flowerShop());
    }

    @When("add a products to cart")
    public void addAProductsToCart() {
        TheActor.actor.attemptsTo(AddProducts.toCart());
    }

    @Then("you should see the products and their quantities in the cart")
    public void youShouldSeeTheProductsAndTheirQuantitiesInTheCart() {
        TheActor.actor.should(GivenWhenThen.seeThat(VerifyCart.products()));
    }

}
