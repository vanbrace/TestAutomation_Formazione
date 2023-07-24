package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FileDownload {
    WebDriver driver;
    private By testFileButtomLink = By.cssSelector("a[href='download/testFile.txt']");

    public FileDownload(WebDriver driver){
        this.driver = driver;

    }
    public void downloadTest1(){
        driver.findElement(testFileButtomLink).click();
    }

}
