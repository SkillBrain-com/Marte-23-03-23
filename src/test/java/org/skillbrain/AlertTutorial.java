package org.skillbrain;

import Utillitles.Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertTutorial {

    public ChromeDriver driver;

    private String currentUrl;
    private String title;

    @BeforeTest
    public void initializeDriver() {
        driver = Utils.getChromeDriver();

    }

    @AfterTest
    public void closeDriver() {
        driver.quit();
    }

  @Test
    public void textBoxAlertTest() {

        driver.get("https://demoqa.com/alerts");
        String messageToEnter = "This message";
        WebElement promptButton = driver.findElement(By.id("promtButton"));
        promptButton.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(messageToEnter);
        alert.accept();
        WebElement promptResult = driver.findElement(By.id("promptResult"));
        System.out.println(promptResult.getText());
        Assert.assertEquals(promptResult.getText(), "You entered " + messageToEnter);

    }


    //  public static void main(String[] args) throws IOException {
//        driver = getChromeDriver();//using static import
//
//        try {
//            driver.get("https://demoqa.com/alerts");
//            // timerAlertButtonText();
//            // alertButtonTest();
//            // acceptOrCancelAlertButton();
//            // textBoxAlertTest();
//
//
//            System.out.println("Test finished successFull");
//
////        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            takeScreenshot(driver);

//        }

//        private static void textBoxAlertTest () {
//            WebElement promptButton = driver.findElement(By.id("promtButton"));
//            promptButton.click();
//            Alert alert = driver.switchTo().alert();
//            alert.sendKeys("This message");
//            alert.accept();
//            WebElement promptResult = driver.findElement(By.id("promptResult"));
//            System.out.println(promptResult.getText());
//        }

//        private static void acceptOrCancelAlertButton () {
//            WebElement confirmButton = driver.findElement(By.id("confirmButton"));
//            confirmButton.click();
//            Alert alert = driver.switchTo().alert();
//            alert.dismiss();
//            WebElement successMessage = driver.findElement(By.cssSelector(".text-success"));
//            System.out.println(successMessage.getText());
//        }

//        private static void timerAlertButtonText () throws InterruptedException {
    //           WebElement timerAlertButton = driver.findElement(By.id("timerAlertButton"));
//            timerAlertButton.click();

//        }

//        private static void alertButtonTest () throws InterruptedException {
//            WebElement alertButton = driver.findElement(By.id("alertButton"));
    //           alertButton.click();

//            Alert alert = driver.switchTo().alert();
//            alert.accept();

//        }


}
