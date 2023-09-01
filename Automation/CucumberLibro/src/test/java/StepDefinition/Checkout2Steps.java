package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Checkout2;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Checkout2Steps {
    Checkout2 checkout;
    int bananaPrice = 0;

    @Given("the price of a {string} is {int} c")
    public void the_price_of_a_banana_is_x(String name, int price) throws Throwable {
        System.out.println("Oggetto: \t" + name + "\t - \t prezzo: \t" + price);
        bananaPrice = (int) price;
    }

    @When("I checkout {int} {string}")
    public void iCheckout(int amount, String itemName) throws Throwable {
        System.out.println("Numero  " + itemName + ": \t" + amount);
        checkout = new Checkout2();
        checkout.add(amount, bananaPrice);
        System.out.println("Per  " + amount + "  " + itemName + "  " + "ho un costo totale di: " );
    }

    @Then("the total price should be {int} c")
    public void theTotalPriceShouldBeC(Integer total) throws Throwable {
        assertEquals(total, checkout.total());
        System.out.println(checkout.total());
    }
}