package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;

//Test della sezione AddAndRemove elements di HerokuApp con numero di remove superiore al numero di add. Tale classe più essere modificata e utilizzata con un numero di remove inferiore.
public class TestRemoveMoreThanAdd {
    WebDriver driver;
    String url = "http://the-internet.herokuapp.com/";
    String csvPathHerokuappHomePage = "C:\\Users\\imaiorino\\Desktop\\Java\\Test automation\\Locator_HerokuappHomePage.csv";
    String csvPathAddAndRemoveElements = "C:\\Users\\imaiorino\\Desktop\\Java\\Test automation\\Locator_AddAndRemoveElements.csv";

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
            herokuappHomePage1.searchAddAndRemoveElements();

            List<List<String>> locatorDataList2 = CsvDataReader.readLocatorData(csvPathAddAndRemoveElements);

            // Esegui le operazioni sugli elementi della pagina
            AddAndRemoveElements addAndRemoveElements = new AddAndRemoveElements(driver, locatorDataList2);
            addAndRemoveElements.addAndRemove(2, 5);
            //funziona anche il caso positivo
            //addAndRemoveElements.addAndRemove(2, 1);

            // Torna alla pagina principale alla fine del test
            driver.get(url);

        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file CSV: " + e.getMessage());
        }
    }
}

