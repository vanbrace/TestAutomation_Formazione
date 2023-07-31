package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//login con credenziali errate
public class Test1 {
    WebDriver driver;
    String username = "abcdefg";
    String password = "SuperSecretPassword!";
    String url = "http://the-internet.herokuapp.com/";

    @BeforeMethod
    public void setUP(){
        //Imposto il path del ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\imaiorino\\Downloads\\chromedriver_win32\\chromedriver.exe");

        //Inizializzo il driver di Chrome
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown(){
        //Faccio in modo che il browser venga chiuso alla fine di ogni test
        driver.quit();
    }

    @Test
    public void testLoginErrataHerokuapp() {
        //Apro Herokuapp
        HerokuappHomePage herokuappHomePage1 = new HerokuappHomePage(driver);
        herokuappHomePage1.openHerokuapp();

        //Cerco il link relativo al Form Authentication e lo apro
        herokuappHomePage1.searchformAuthentication();

        //Inserisco le credenziali ed effettuo il login
        FormAuthenticationPage paginaFormAuthentication1 = new FormAuthenticationPage(driver);
        paginaFormAuthentication1.login(username, password);

        //torno indietro alla pagina principale
        driver.navigate().to(url);
    }
}
