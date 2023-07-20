package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleToFormAuthenticationTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        // Imposta il percorso del driver di Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\imaiorino\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // Inizializza il driver di Chrome
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        // Chiudi il browser dopo ogni test
        driver.quit();
    }
    @Test
    public void testGoogleToYouTubeNavigation() {
        // Apre la homepage di Google
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        driver.get("https://www.google.com");

        // Esegue una ricerca su Google
        googleHomePage.search("the-internet.herokuapp");
        GoogleSearchResult ricerca = new GoogleSearchResult(driver);
        ricerca.clickTheInternetLink("https://the-internet.herokuapp.com/");

        HerokuappHomePage pagina = new HerokuappHomePage(driver);
        pagina.search("/login");
        FormAuthenticationPage paginaForm = new FormAuthenticationPage(driver);
        paginaForm.login("tomsmith", "SuperSecretPassword!");
    }
}
