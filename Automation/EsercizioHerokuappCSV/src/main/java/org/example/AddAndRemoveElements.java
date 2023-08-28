package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AddAndRemoveElements {
    private WebDriver driver;
    private By addButton;
    private By removeButton;

    public AddAndRemoveElements(WebDriver driver, List<List<String>> locatorDataList) {
        this.driver = driver;

        for (List<String> locator : locatorDataList){

            String locatorName = locator.get(0);
            String locatorType = locator.get(1);
            String locatorValue = locator.get(2);

            if (locatorName.contains("addbutton")) {
                addButton = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            } else if (locatorName.contains("removeButton")) {
                removeButton = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
            }
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