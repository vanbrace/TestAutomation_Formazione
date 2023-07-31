package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Add and remove elements con numero di Remove superiore al numero di add
public class Test2 {
    WebDriver driver;
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

        herokuappHomePage1.searchAddAndRemoveElements();
        AddAndRemoveElements addAndRemoveElements = new AddAndRemoveElements(driver);
        addAndRemoveElements.addAndRemove(2, 7);
        //torno indietro alla pagina principale
        driver.navigate().to(url);
    }
}

