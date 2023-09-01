package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Checkout4;

public class Esercizio2Steps {
 Checkout4 checkout = new Checkout4();
    int bananaPrice = 0;
    int applePrice = 0;
    int totale;

    @Given("the price of a {string} is {int} c")
    public void the_price_of_a_is_c(String name, int price) throws Throwable{
        System.out.println("Oggetto: \t" + name + "\t - \t prezzo: \t" + price);
        bananaPrice = price;
    }

    @And("{int} c is the price of an {string}")
    public void is_the_price_of_an(int price, String name) {
        System.out.println("Oggetto: \t" + name + "\t - \t prezzo: \t" + price);
        applePrice = price;
    }

    @When("I checkout {int} {string}")
        public void i_checkout(int amount, String name) {
        checkout.add(amount, bananaPrice);
    }


    @And("Now I checkout {int} {string}")
        public void i_checkout_again(int amount, String name) {
            checkout.add(amount, applePrice);
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