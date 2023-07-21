package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuappHomePage {
    private WebDriver driver;
    private By formAuthenticationButton = By.cssSelector("a[href='/login']");
    private final String url = "http://the-internet.herokuapp.com/";


    public HerokuappHomePage(WebDriver driver){
        this.driver = driver;

    }

    // Metodo per aprire la pagina di Herokuapp
    public void openHerokuapp(){
        driver.get(url);
    }

    //Metodo per la ricerca del buttonlink relativo al Form Authentication
    public void search(){
        driver.findElement(formAuthenticationButton).click();
    }
}