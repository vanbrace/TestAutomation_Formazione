package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FormAuthenticationPage {
    private WebDriver driver;

    private By usernameBox;
    private By passwordBox;
    private By confirmButton;
    private By logOut;
    private By logOutButton;
    List<By> locatorDataList;

    public FormAuthenticationPage(WebDriver driver, List<List<String>> locatorDataList){
        this.driver = driver;
        //System.out.println("LocatorDataList size: " + locatorDataList.size());
        //System.out.println(" \t Classe Form Authentication \t");

        for (List<String> locator : locatorDataList) {
            String locatorName = locator.get(0);
            //System.out.println(locatorName);
            String locatorType = locator.get(1);
            //System.out.println(locatorType);
            String locatorValue = locator.get(2);
            //System.out.println(locatorValue);

            if (locatorName.contains("username")) {
                usernameBox = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorName.contains("password")) {
                passwordBox = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorName.contains("confirm")) {
                confirmButton = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorName.contains("LogOut")) {
                logOut = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorName.contains("logOutButton")) {
                logOutButton = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            }
            }
        }


    //Metodo che inserisce username, password e conferma
    public void login(String username, String password){
        try {
            //System.out.println("USERNAME, PASSWORD E CONFIRM BUTTON \t" + usernameBox + "\t" + passwordBox + "\t" + confirmButton);
            driver.findElement(usernameBox).sendKeys(username);
            driver.findElement(passwordBox).sendKeys(password);
            driver.findElement(confirmButton).click();
            //System.out.println("LogOut \t" + logOut + "\n logOutButton \t" + logOutButton);

            // Controllo se l'accesso è avvenuto con successo
            if (isLoginSuccessful()) {
                System.out.println("Accesso riuscito per l'utente: " + username);
            } else {

                throw new Exception("Username o password errati. Accesso non riuscito.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    // Metodo per controllare se l'accesso è avvenuto con successo
    private boolean isLoginSuccessful() {
        try {
            WebElement logoutButton = driver.findElement(logOutButton);
            return logoutButton.isDisplayed();
        } catch (NoSuchElementException e) {
            //System.out.println("LOGIN NON RIUSCITA");
            return false; // Pulsante di logout non trovato, l'accesso non è riuscito.
        }
    }

    public void logOut(){
        if(isLoginSuccessful())
        {driver.findElement(logOutButton).click();}
        else
            System.out.println("Non è possibile effettuare il logout");


    }

}