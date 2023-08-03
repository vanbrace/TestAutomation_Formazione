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

            if (locatorValue.contains("login")) {
                formAuthenticationButtonLink = convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("add")) {
                addAndRemoveElementsButtonLink = convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("Checkboxes")) {
                checkboxesButtonLink = convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("Disappearing")) {
                disappearingElementsButtonLink = convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("Dynamic Content")) {
                dynamicContentButtonLink = convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("Dynamic Loading")) {
                dynamicLoadingButtonLink = convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("Download")) {
                fileDownloadButtonLink = convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("Shifting")) {
                shiftingContent = convertStringToBy(locatorType, locatorValue);
            } else if (locatorValue.contains("windows")) {
                multipleWindowbutton = convertStringToBy(locatorType, locatorValue);
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

    private By convertStringToBy(String locatorType, String locatorValue) {
        switch (locatorType) {
            case "xpath":
                return By.xpath(locatorValue);
            case "cssSelector":
                return By.cssSelector(locatorValue);
            case "id":
                return By.id(locatorValue);
            case "classname":
                return By.className(locatorValue);
            default:
                throw new IllegalArgumentException("Tipo di locator non supportato: " + locatorType);
        }
    }

    // Metodo per aprire la pagina di Herokuapp
    public void openHerokuapp() {
        driver.get(url);
    }

    //Metodo per la ricerca del buttonlink relativo al Form Authentication
    public void searchformAuthentication() {
        driver.findElement(formAuthenticationButtonLink).click();
    }

    public void searchAddAndRemoveElements() {
        driver.findElement(addAndRemoveElementsButtonLink).click();
    }

    public void searchCheckboxes() {
        driver.findElement(checkboxesButtonLink).click();
    }

    public void searchDisappearingElements() {
        driver.findElement(disappearingElementsButtonLink).click();
    }

    public void searchDynamicContent() {
        driver.findElement(dynamicContentButtonLink).click();
    }

    public void searchDynamicLoading() {
        driver.findElement(dynamicLoadingButtonLink).click();
    }

    public void searchFileDownload() {
        driver.findElement(fileDownloadButtonLink).click();
    }

    public void searchShiftingContent() {
        driver.findElement(shiftingContent).click();
    }

    public void searchMultipleWindow() {
        System.out.println("Clicco su Multiple Windows");
        System.out.println(multipleWindowbutton.toString());
        driver.findElement(multipleWindowbutton).click();
    }
}
