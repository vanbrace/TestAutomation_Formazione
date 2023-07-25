package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FileDownload {
    WebDriver driver;
    private By testFileButtonLink = By.cssSelector("a[href='download/2.txt.txt']");

    public FileDownload(WebDriver driver){
        this.driver = driver;

    }
    public void downloadTest1(){
        driver.findElement(testFileButtonLink).click();
    }

}
