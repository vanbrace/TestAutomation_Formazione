package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class HerokuappHomePage {
    private WebDriver driver;
    private By formAuthenticationButtonLink;
    private By addAndRemoveElementsButtonLink;
    private By checkboxesButtonLink;
    private By disappearingElementsButtonLink;
    private By dynamicContentButtonLink;
    private By dynamicLoadingButtonLink;
    private By fileDownloadButtonLink;
    private By shiftingContent;
    private By multipleWindowbutton;
    private final String url = "http://the-internet.herokuapp.com/";

    public HerokuappHomePage(WebDriver driver, List<By> locatorDataList) {
        this.driver = driver;

        System.out.println("LocatorDataList size: " + locatorDataList.size());

        for (By locator : locatorDataList) {
            String locatorType = getLocatorType(locator);
            System.out.println("Nel costruttore HerokuappHomePage nel for \t" + locatorType);
            String locatorValue = getLocatorValue(locator);
            System.out.println("Nel costruttore HerokuappHomePage nel for \t" + locatorValue);
            ConvertitoreDaStringheABy convertitoreDaStringheABy = new ConvertitoreDaStringheABy();

            if (locatorValue.contains("login")) {
                formAuthenticationButtonLink = convertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("add")) {
                addAndRemoveElementsButtonLink = convertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("Checkboxes")) {
                checkboxesButtonLink = convertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("Disappearing")) {
                disappearingElementsButtonLink = convertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("Dynamic Content")) {
                dynamicContentButtonLink = convertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("Dynamic Loading")) {
                dynamicLoadingButtonLink = convertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("Download")) {
                fileDownloadButtonLink = convertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("Shifting")) {
                shiftingContent = convertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("windows")) {
                multipleWindowbutton = convertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
                System.out.println("Nel costruttore \t" + multipleWindowbutton.toString());
            }
        }
    }

    private String getLocatorType(By locator) {
        String locatorString = locator.toString();
        return locatorString.split(":")[0].substring(3);
    }

    private String getLocatorValue(By locator) {
        String locatorString = locator.toString();
        return locatorString.split(":")[1].trim();
    }

    // Metodo per aprire la pagina di Herokuapp
    public void openHerokuapp() {
        driver.get(url);
    }

    //Metodo per la ricerca del buttonlink relativo al Form Authentication
    public void searchformAuthentication() {
        cliccaBottone(formAuthenticationButtonLink);
    }

    public void searchAddAndRemoveElements() {
        cliccaBottone(addAndRemoveElementsButtonLink);
    }

    public void searchCheckboxes() {
        cliccaBottone(checkboxesButtonLink);
    }

    public void searchDisappearingElements() {
        cliccaBottone(disappearingElementsButtonLink);
    }

    public void searchDynamicContent() {
        cliccaBottone(dynamicContentButtonLink);
    }

    public void searchDynamicLoading() {
        cliccaBottone(dynamicLoadingButtonLink);
    }

    public void searchFileDownload() {
        cliccaBottone(fileDownloadButtonLink);
    }

    public void searchShiftingContent() {
        cliccaBottone(shiftingContent);
    }

    public void searchMultipleWindow() {
        cliccaBottone(multipleWindowbutton);
    }

    public void cliccaBottone(By button){
        driver.findElement(button).click();
    }
}
