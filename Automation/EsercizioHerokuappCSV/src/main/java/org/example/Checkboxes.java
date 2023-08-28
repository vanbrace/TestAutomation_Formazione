package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class Checkboxes {
    private WebDriver driver;
    private By spuntaCheckbox;
    List<By> locatorDataList;

    public Checkboxes(WebDriver driver, List<List<String>> locatorDataList) {
        this.driver = driver;

        for (List<String> locator : locatorDataList) {
            String locatorName = locator.get(0);
            String locatorType = locator.get(1);
            String locatorValue = locator.get(2);

            if (locatorName.contains("spuntaCheckbox")) {
                spuntaCheckbox = ConvertitoreDaStringheABy.convertStringToBy(locatorType, locatorValue);
                //System.out.println(spuntaCheckbox.toString());
            }
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