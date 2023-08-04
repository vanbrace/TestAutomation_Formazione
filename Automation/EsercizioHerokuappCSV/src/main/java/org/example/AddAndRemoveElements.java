package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AddAndRemoveElements {
    private WebDriver driver;
    private By addButton;
    private By removeButton;

    public AddAndRemoveElements(WebDriver driver, List<By> locatorDataList) {
        this.driver = driver;
        for (By locator : locatorDataList) {
            if (locator.toString().contains("Add Element")) {
                addButton = locator;
            } else if (locator.toString().contains("Delete")) {
                removeButton = locator;
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

    public void setButtonLocators(String buttonName, String buttonType, String buttonValue) {
        if (buttonName.contains("addButton")) {
            addButton = ConvertitoreDaStringheABy.convertStringToBy(buttonType, buttonValue);
        } else if (buttonName.contains("removeButton")) {
            removeButton = ConvertitoreDaStringheABy.convertStringToBy(buttonType, buttonValue);
        }
    }


    public void addAndRemove(int numberAdd, int numberRemove) {
        if (addButton == null || removeButton == null) {
            System.out.println("Locator dei pulsanti non è stato impostato correttamente.");
            return;
        }

        for (int i = 0; i < numberAdd; i++) {
            driver.findElement(addButton).click();
        }

        if (numberAdd >= numberRemove) {
            for (int j = 0; j < numberRemove; j++) {
                driver.findElement(removeButton).click();
            }
        } else {
            System.out.println("Non è possibile rimuovere un numero di elementi superiore a quelli aggiunti");
        }
    }
}

