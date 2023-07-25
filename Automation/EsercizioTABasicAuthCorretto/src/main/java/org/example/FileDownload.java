package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FileDownload {
    WebDriver driver;
    private By testFileButtonLink = By.cssSelector("a[href='download/test.txt']");
    private By test2ButtonLink = By.cssSelector("a[href='download/image (1).png']");

    public FileDownload(WebDriver driver){
        this.driver = driver;

    }
    public void downloadTest1(){
        driver.findElement(testFileButtonLink).click();
    }

    public void dowloadTest2(){
        driver.findElement(test2ButtonLink).click();
    }

}
