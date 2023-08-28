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

    public HerokuappHomePage(WebDriver driver, List<List<String>> locatorDataList) {
        this.driver = driver;

        //System.out.println("LocatorDataList size: " + locatorDataList.size());

        for (List<String> locator : locatorDataList) {
            String locatorName = locator.get(0);
            //System.out.println("Nel costruttore HerokuappHomePage nel for \t" + locatorName);
            String locatorType = locator.get(1);
            //System.out.println("Nel costruttore HerokuappHomePage nel for \t" + locatorType);
            String locatorValue = locator.get(2);
            //System.out.println("Nel costruttore HerokuappHomePage nel for \t" + locatorValue);

            if (locatorName.contains("formAuthenticationButtonLink")) {
                formAuthenticationButtonLink = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorName.contains("addAndRemoveElementsButtonLink")) {
                addAndRemoveElementsButtonLink = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorName.contains("checkboxesButtonLink")) {
                checkboxesButtonLink = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorName.contains("disappearingElementsButtonLink")) {
                disappearingElementsButtonLink = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorName.contains("dynamicContentButtonLink")) {
                dynamicContentButtonLink = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorName.contains("dynamicLoadingButtonLink")) {
                dynamicLoadingButtonLink = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorName.contains("fileDownloadButtonLink")) {
                fileDownloadButtonLink = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorName.contains("shiftingContent")) {
                shiftingContent = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorName.contains("multipleWindowbutton")) {
                multipleWindowbutton = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
               // System.out.println("Nel costruttore \t" + multipleWindowbutton.toString());
            }
        }
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
        //System.out.println("BUTTON CHECKBOXES" + checkboxesButtonLink);
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
