package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class Checkboxes {
    private WebDriver driver;
    private By spuntaCheckbox;
    List<By> locatorDataList;

    public Checkboxes(WebDriver driver, List<By> locatorDataList) {
        this.driver = driver;
        this.locatorDataList = locatorDataList;


        for (By locator : locatorDataList) {

            String locatorType = getLocatorType(locator);
            //System.out.println( "locatorType: \t" + locatorType);
            String locatorValue = getLocatorValue(locator);
            //System.out.println( "locatorValue: \t" + locatorValue);

            if (locatorValue.contains("checkboxes")) {
                ConvertitoreDaStringheABy convertitoreDaStringheABy = new ConvertitoreDaStringheABy();
                spuntaCheckbox = convertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
                spuntaCheckbox.toString();
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



    public void checkbox() {
        if (spuntaCheckbox != null) {
            driver.findElement(spuntaCheckbox).click();
        } else {
            System.out.println("Element spuntaCheckbox1 is null");
        }
    }

}
