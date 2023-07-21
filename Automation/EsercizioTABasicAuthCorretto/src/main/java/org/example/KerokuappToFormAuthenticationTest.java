package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KerokuappToFormAuthenticationTest {
    WebDriver driver;
    String username = "tomsmith";
    String password = "SuperSecretPassword!";

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
    public void testHerokuappToFormAuthentication(){
        //Apro Herokuapp
        HerokuappHomePage herokuappHomePage = new HerokuappHomePage(driver);
        herokuappHomePage.openHerokuapp();

        //Cerco il link relativo al Form Authentication e lo apro
        herokuappHomePage.search();

        //Inserisco le credenziali ed effettuo il login
        FormAuthenticationPage paginaFormAuthentication = new FormAuthenticationPage(driver);
        paginaFormAuthentication.login(username, password);
    }
}

