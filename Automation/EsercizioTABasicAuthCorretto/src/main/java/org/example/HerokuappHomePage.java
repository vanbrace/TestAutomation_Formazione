package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuappHomePage {
    private WebDriver driver;
    private By formAuthenticationButtonLink = By.cssSelector("a[href='/login']");
    private By addAndRemoveElementsButtonLink = By.cssSelector("a[href='/add_remove_elements/']");
    private By checkboxesButtonLink = By.xpath("//a[contains(text(),'Checkboxes')]");
    private By disappearingElementsButtonLink = By.xpath("//a[contains(text(),'Disappearing Elements')]");
    private By dynamicContentButtonLink = By.xpath("//a[contains(text(),'Dynamic Content')]");
    private By dynamicLoadingButtonLink = By.xpath("//a[contains(text(),'Dynamic Loading')]");
    private By fileDownloadButtonLink = By.cssSelector("a[href='/download']");
    private By shiftingContent = By.xpath("//a[contains(text(),'Shifting Content')]");
    private final String url = "http://the-internet.herokuapp.com/";


    public HerokuappHomePage(WebDriver driver){
        this.driver = driver;

    }

    // Metodo per aprire la pagina di Herokuapp
    public void openHerokuapp(){
        driver.get(url);
    }

    //Metodo per la ricerca del buttonlink relativo al Form Authentication
    public void searchformAuthentication(){
        driver.findElement(formAuthenticationButtonLink).click();
    }

    public void searchAddAndRemoveElements(){
        driver.findElement(addAndRemoveElementsButtonLink).click();
    }

    public void searchCheckboxes(){
        driver.findElement(checkboxesButtonLink).click();
    }

    public void searchDisappearingElements(){
       driver.findElement(disappearingElementsButtonLink).click();
    }

    public void searchDynamicContent(){
        driver.findElement(dynamicContentButtonLink).click();
    }

    public void searchDynamicLoading(){
        driver.findElement(dynamicLoadingButtonLink).click();
    }

    public void searchFileDownload(){
        driver.findElement(fileDownloadButtonLink).click();
    }

    public void searchShiftingContent(){
        driver.findElement(shiftingContent).click();
    }
}