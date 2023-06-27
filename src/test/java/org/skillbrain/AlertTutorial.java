package org.skillbrain;


import Utilities.Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AlertTutorial {

    private RemoteWebDriver driver;
    @BeforeSuite
    public void initializeDriver() throws MalformedURLException {
        driver = Utils.getRemoteWebDriver();
    }

    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }

    @Test(testName = "Verify alert box text returns expected message on web page.")
    public void textBoxAlertTest() {
        driver.get("https://demoqa.com/alerts");
        String messageToEnter = "This message";
        WebElement promptButton = driver.findElement(By.id("promtButton"));
        promptButton.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(messageToEnter);
        alert.accept();
        WebElement promptResult = driver.findElement(By.id("promptResult"));
        String actualResultOnPage = promptResult.getText();
        Assert.assertEquals(actualResultOnPage, "You entered " + messageToEnter);
    }

}









//    public static void main(String[] args) throws IOException {
//        driver = getChromeDriver();  // using static import
//        try {
//            driver.get("https://demoqa.com/alerts");
////            timerAlertButtonTest();
////            alertButtonTest();
////            acceptOrCancelAlertButton();
////            textBoxAlertTest();
//            System.out.println("Test finished successfully.");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            takeScreenshot(driver);
//        } finally {
//            driver.quit();
//        }


//    private static void textBoxAlertTest() {
//        WebElement promptButton = driver.findElement(By.id("promtButton"));
//        promptButton.click();
//        Alert alert = driver.switchTo().alert();
//        alert.sendKeys("This message");
//        alert.accept();
//        WebElement promptResult = driver.findElement(By.id("promptResult"));
//        System.out.println(promptResult.getText());
//    }
//
//    private static void acceptOrCancelAlertButton() {
//        WebElement confirmButton = driver.findElement(By.id("confirmButton"));
//        confirmButton.click();
//        Alert alert = driver.switchTo().alert();
//        alert.dismiss();
//        WebElement successMessage = driver.findElement(By.cssSelector(".text-success"));
//        System.out.println(successMessage.getText());
//    }
//
//    private static void timerAlertButtonTest() throws InterruptedException {
//        WebElement timerAlertButton = driver.findElement(By.id("timerAlertButton"));
//        timerAlertButton.click();
//        Thread.sleep(Duration.ofSeconds(6));
//    }
//
//    private static void alertButtonTest() throws InterruptedException {
//        WebElement alertButton = driver.findElement(By.id("alertButton"));
//        alertButton.click();
//        Thread.sleep(3000);
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        Thread.sleep(3000);
//    }



