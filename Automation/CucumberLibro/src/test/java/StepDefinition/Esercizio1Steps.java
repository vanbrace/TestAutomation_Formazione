package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Checkout3;

public class Esercizio1Steps {
    Checkout3 checkout = new Checkout3();
    int bananaPrice = 0;
    int totale;
    @Given("the price of a {string} is {int} c")
    public void the_price_of_a_is_c(String name, int price) throws Throwable{
        System.out.println("Oggetto: \t" + name + "\t - \t prezzo: \t" + price);
        bananaPrice = price;
    }

    @When("I checkout {int} {string}")
    public void i_checkout(int amount, String name) {
        checkout.add(amount, bananaPrice);
    }


    @And("I checkout again {int} {string}")
    public void i_checkout_again(int amount, String name) {
        checkout.add(amount, bananaPrice);
    }


    @Then("the total price should be {int} c")
    public void the_total_price_should_be_c(int total) {
        totale = checkout.getTotal();
        System.out.println("Il totale è:  " + checkout.getTotal());
        if(totale == total){
            System.out.println("Il conto è stato effettuato correttamente");}
            else{
                System.out.println("Ci sono errori nel conto");}
    }

}
