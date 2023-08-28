package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

//Test di Herokuapp su più pagine
public class TestHerokuappHomePageEFormAuthetication {
    WebDriver driver;
    String username = "tomsmith";
    String password = "SuperSecretPassword!";
    String url = "http://the-internet.herokuapp.com/";
    String csvPathHerokuappHomePage = "C:\\Users\\imaiorino\\Desktop\\Java\\Test automation\\Locator_HerokuappHomePage.csv";
    String csvPathFormAuthenticationPage = "C:\\Users\\imaiorino\\Desktop\\Java\\Test automation\\Locator_FormAuthenticationPage.csv";
    // AddAndRemoveElements ha una classe di test apposita
    //String csvPathAddAndRemoveElements = "C:\\Users\\imaiorino\\Desktop\\Java\\Test automation\\Locator_AddAndRemoveElements.csv";
    String csvPathCheckboxes = "C:\\Users\\imaiorino\\Desktop\\Java\\Test automation\\Locator_Checkboxes.csv";
    String csvPathDisappearingElements = "C:\\Users\\imaiorino\\Desktop\\Java\\Test automation\\Locator_DisappearingElements.csv";
    String csvPathDynamicContent = "C:\\Users\\imaiorino\\Desktop\\Java\\Test automation\\Locator_DynamicContent.csv";
    String csvPathDynamicLoading = "C:\\Users\\imaiorino\\Desktop\\Java\\Test automation\\Locator_DynamicLoading.csv";
    String csvPathShiftingContent = "C:\\Users\\imaiorino\\Desktop\\Java\\Test automation\\Locator_ShiftingContent.csv";
    //Non testiamo la parte che riguarda il download dei file in quanto vengono apportate quotidianamente modifiche alla pagina e richiede continua manutenzione
    //String csvPathFileDownload = "C:\\Users\\imaiorino\\Desktop\\Java\\Test automation\\Locator_FileDownload.csv";
    
    // MultipleWindow ha una classe di test apposita
    //String csvPathMultipleWindow = "C:\\Users\\imaiorino\\Desktop\\Java\\Test automation\\Locator_MultipleWindow.csv";

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
        try {
            List<List<String>> locatorDataList1 = CsvDataReader.readLocatorData(csvPathHerokuappHomePage);

            //Apro Herokuapp
            HerokuappHomePage herokuappHomePage1 = new HerokuappHomePage(driver, locatorDataList1);
            herokuappHomePage1.openHerokuapp();
            herokuappHomePage1.searchformAuthentication();

            List<List<String>> locatorDataList2 = CsvDataReader.readLocatorData(csvPathFormAuthenticationPage);

            FormAuthenticationPage formAuthenticationPage = new FormAuthenticationPage(driver, locatorDataList2);
            formAuthenticationPage.login(username, password);
            formAuthenticationPage.logOut();

            // Torna alla pagina principale alla fine del test
            driver.navigate().to(url);

            herokuappHomePage1.searchCheckboxes();

            //herokuappHomePage1.searchCheckboxes();
            List<List<String>> locatorDataList3 = CsvDataReader.readLocatorData(csvPathCheckboxes);

            Checkboxes checkbox = new Checkboxes(driver, locatorDataList3);
            // spunto la checkbox1
            checkbox.checkbox();

            //torno indietro
            driver.navigate().to(url);

            // Cerco il link relativo al Disappearing Elements
            herokuappHomePage1.searchDisappearingElements();
            List<List<String>> locatorDataList4 = CsvDataReader.readLocatorData(csvPathDisappearingElements);
            DisappearingElements disappearingElements = new DisappearingElements(driver, locatorDataList4);
            disappearingElements.home();

            //torno indietro
            driver.navigate().to(url);

            // Cerco il link relativo al Dynamic Content
            herokuappHomePage1.searchDynamicContent();
            List<List<String>> locatorDataList5 = CsvDataReader.readLocatorData(csvPathDynamicContent);
            DynamicContent dynamicContent = new DynamicContent(driver,locatorDataList5);
            dynamicContent.clickHere();

            //torno indietro
            driver.navigate().to(url);

            // Cerco il link relativo al Dynamic Loading
            herokuappHomePage1.searchDynamicLoading();
            List<List<String>> locatorDataList6 = CsvDataReader.readLocatorData(csvPathDynamicLoading);
            DynamicLoading dynamicLoading = new DynamicLoading(driver,locatorDataList6);
            dynamicLoading.example1();

            //torno indietro
            driver.navigate().to(url);

            // Cerco il link relativo allo Shifting Content
            herokuappHomePage1.searchShiftingContent();
            List<List<String>> locatorDataList7 = CsvDataReader.readLocatorData(csvPathShiftingContent);
            ShiftingContent shiftingContent = new ShiftingContent(driver,locatorDataList7);
            shiftingContent.menuElement();

            //torno indietro
            driver.navigate().to(url);

        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file CSV: " + e.getMessage());
        }
    }
}