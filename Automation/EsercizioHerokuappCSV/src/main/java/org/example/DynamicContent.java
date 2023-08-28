package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class DynamicContent {
    private WebDriver driver;
    private By clickHereLink;

    public DynamicContent(WebDriver driver, List<List<String>>locatorDataList){
        this.driver = driver;

        for (List<String> locator : locatorDataList) {
            String locatorName = locator.get(0);
            String locatorType = locator.get(1);
            String locatorValue = locator.get(2);

            if (locatorName.contains("clickHereLink")) {
                clickHereLink = ConvertitoreDaStringheABy.convertStringToBy(locatorType,locatorValue);
            }
        }

        if (clickHereLink == null) {
            throw new IllegalArgumentException("Locator for disappearing elements not found in the list.");
        }

        //System.out.println("Using locator: " + clickHereLink);
    }

    public void clickHere(){
        driver.findElement(clickHereLink).click();
    }
}
