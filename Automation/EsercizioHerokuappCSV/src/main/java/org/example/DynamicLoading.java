package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class DynamicLoading {
    WebDriver driver;
    private By example1Link;

    public DynamicLoading(WebDriver driver, List<List<String>> locatorDataList){
        this.driver = driver;
        for (List<String> locator : locatorDataList) {
            String locatorName = locator.get(0);
            String locatorType = locator.get(1);
            String locatorValue = locator.get(2);

            if (locatorName.contains("example1Link")) {
                example1Link = ConvertitoreDaStringheABy.convertStringToBy(locatorType,locatorValue);
            }
        }

        if (example1Link == null) {
            throw new IllegalArgumentException("Locator for disappearing elements not found in the list.");
        }

        //System.out.println("Using locator: " + example1Link);
    }

    public void example1(){
        driver.findElement(example1Link).click();
    }

}

