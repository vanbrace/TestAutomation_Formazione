package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

//Test della sezione MultipleWindow di HerokuApp
public class TestMultipleWindow {
    WebDriver driver;
    String url = "http://the-internet.herokuapp.com/";
    String csvPathHerokuappHomePage = "C:\\Users\\imaiorino\\Desktop\\Java\\Test automation\\Locator_HerokuappHomePage.csv";
    String csvPathMultipleWindow = "C:\\Users\\imaiorino\\Desktop\\Java\\Test automation\\Locator_MultipleWindow.csv";

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
        try {
            List<List<String>> locatorDataList1 = CsvDataReader.readLocatorData(csvPathHerokuappHomePage);

            //Apro Herokuapp
            HerokuappHomePage herokuappHomePage1 = new HerokuappHomePage(driver, locatorDataList1);
            herokuappHomePage1.openHerokuapp();
            herokuappHomePage1.searchMultipleWindow();

            List<List<String>> locatorDataList2 = CsvDataReader.readLocatorData(csvPathMultipleWindow);

            // Esegui le operazioni sugli elementi della pagina
            MultipleWindow multipleWindow = new MultipleWindow(driver, locatorDataList2);
            multipleWindow.openNewWindow();

            // Torna alla pagina principale alla fine del test
            driver.get(url);

        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file CSV: " + e.getMessage());
        }
    }
}
