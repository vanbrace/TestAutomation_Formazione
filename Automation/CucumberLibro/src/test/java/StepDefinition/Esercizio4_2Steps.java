package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Esercizio4_2Steps {

    @Given("I have deposited {int} in my {string}")
    public void i_have_deposited_in_my_account(int amountDeposited, String account) {
        System.out.println("Ho depositato: \t" + amountDeposited + "$ \t sul mio \t" + account);
    }

    @When("I transfer {int} from my {string} into my {string}.")
    public void i_transfer_from_my_account_into_my_account(int amountTransferred, String account1, String account2) {
        System.out.println("Ho trasferito: \t" + amountTransferred + "$ \t dal mio \t" + account1 + "\t al mio \t" + account2);
    }
}
