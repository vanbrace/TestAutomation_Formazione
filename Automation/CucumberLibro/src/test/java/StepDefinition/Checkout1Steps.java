package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Checkout;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Checkout1Steps {
    Checkout checkout;
    double bananaPrice1 = 0;

    @Given("the price of a {string} is {double} c")
    public void the_price_of_a_banana_is(String name, double price) throws Throwable {
        System.out.println("Oggetto: \t" + name);
        bananaPrice1 = price;
    }

    @When("I checkout a {string}")
    public void iCheckout(String itemName) throws Throwable {
        checkout = new Checkout();
        double itemCount=0;
        checkout.add1(itemCount, bananaPrice1);
    }

    @Then("The total price should be {double} c")
    public void theTotalPriceShouldBeC(double total) throws Throwable {
        assertEquals(total, checkout.total1());
    }
}
