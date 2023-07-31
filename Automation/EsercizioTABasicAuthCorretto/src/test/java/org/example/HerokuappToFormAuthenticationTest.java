package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HerokuappToFormAuthenticationTest {
    WebDriver driver;
    String username = "tomsmith";
    //String username = "abcdefg";
    String password = "SuperSecretPassword!";
    String url = "http://the-internet.herokuapp.com/";
    int numberAdd = 4;
    int numberRemove = 3;

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
    public void testHerokuappToFormAuthentication() {

        //Test1 test1 = new Test1();
        //test1.testLoginErrataHerokuapp();

        //Apro Herokuapp
        HerokuappHomePage herokuappHomePage1 = new HerokuappHomePage(driver);
        herokuappHomePage1.openHerokuapp();

        //Cerco il link relativo al Form Authentication e lo apro
        herokuappHomePage1.searchformAuthentication();

        //Inserisco le credenziali ed effettuo il login
        FormAuthenticationPage paginaFormAuthentication1 = new FormAuthenticationPage(driver);
        paginaFormAuthentication1.login(username, password);

        //faccio la logout
        paginaFormAuthentication1.logOut();

        //torno indietro alla pagina principale
        driver.navigate().to(url);

        //Cerco il link relativo al search add and remove elements
         herokuappHomePage1.searchAddAndRemoveElements();
         AddAndRemoveElements addAndRemoveElements = new AddAndRemoveElements(driver);
         addAndRemoveElements.addAndRemove(numberAdd, numberRemove);

        //torno indietro
        driver.navigate().to(url);

        //Cerco il link relativo alle checkboxes
        herokuappHomePage1.searchCheckboxes();
        Checkboxes checkbox = new Checkboxes(driver);

        // spunto la checkbox1
        checkbox.checkbox1();
        // spunto la checkbox
        checkbox.checkbox2();

        //torno indietro
        driver.navigate().to(url);

        // Cerco il link relativo al Disappearing Elements
        herokuappHomePage1.searchDisappearingElements();
        DisappearingElements disappearingElements = new DisappearingElements(driver);
        disappearingElements.home();

        //torno indietro
        driver.navigate().to(url);

        // Cerco il link relativo al Dynamic Content
        herokuappHomePage1.searchDynamicContent();
        DynamicContent dynamicContent = new DynamicContent(driver);
        dynamicContent.clickHere();

        //torno indietro
        driver.navigate().to(url);

        // Cerco il link relativo al Dynamic Loading
        herokuappHomePage1.searchDynamicLoading();
        DynamicLoading dynamicLoading = new DynamicLoading(driver);
        dynamicLoading.example1();

        //torno indietro
        driver.navigate().to(url);

        // Cerco il link relativo allo Shifting Content
        herokuappHomePage1.searchShiftingContent();
        ShiftingContent shiftingContent = new ShiftingContent(driver);
        shiftingContent.menuElement();

        //torno indietro
        driver.navigate().to(url);

        // Cerco il link relativo al File download
        herokuappHomePage1.searchFileDownload();
        FileDownload fileDownload = new FileDownload(driver);
        fileDownload.downloadTest1();
        fileDownload.dowloadTest2();

        //torno alla pagina principale
        driver.navigate().to(url);

        //Cerco il link relativo alla multiple window
        herokuappHomePage1.searchMultipleWindow();
        MultipleWindow multipleWindow = new MultipleWindow(driver);
        multipleWindow.openNewWindow();

        //torno alla pagina principale
        driver.navigate().to(url);
    }
}

