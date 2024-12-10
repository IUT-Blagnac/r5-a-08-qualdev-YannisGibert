package dojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CocktailSteps {
    private Order order;

    @Given("{string} who wants to buy a drink")
    public void person_who_wants_to_buy_a_drink(String buyer) {
        order = new Order(); 
        order.declareOwner(buyer); 
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for(String target) {
        order.declareTarget(target); 
    }

    @Then("there are {int} cocktails in the order")
    public void there_are_cocktails_in_the_order(int expectedCocktailsCount) {
        List<String> cocktails = order.getCocktails();
        assertEquals(expectedCocktailsCount, cocktails.size());
    }

    @And("{string} adds the cocktail {string}")
    public void person_adds_the_cocktail(String buyer, String cocktail) {
        if (!order.getOwner().equals(buyer)) {
            throw new IllegalArgumentException(buyer + " is not the owner of the order!");
        }
        order.addCocktail(cocktail); 
    }
}
