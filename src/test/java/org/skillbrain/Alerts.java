package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alerts {

    private ChromeDriver driver;
    private String currentURL;
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
    public void textBoxAlert() {
        driver.get("https://demoqa.com/alerts");
        WebElement promtButton = driver.findElement(By.id("promtButton"));
        promtButton.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("This message is a Test");
        alert.accept();
        WebElement promptResult = driver.findElement(By.id("promptResult"));
        System.out.println(promptResult.getText());
    }

    @Test
    public void acceptOrCancelAlertButton() {
        driver.get("https://demoqa.com/alerts");
        WebElement confirmButton = driver.findElement(By.id("confirmButton"));
        confirmButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept(); //alert.dismiss;
        WebElement successMessage = driver.findElement(By.cssSelector(".text-success"));
        System.out.println(successMessage.getText());
    }
    @Test
    public void timerAlertButtonTest(){
        driver.get("https://demoqa.com/alerts");
        WebElement timerAlertButton = driver.findElement(By.id("timerAlertButton"));
        timerAlertButton.click();

    }
    @Test
    public void alertButtonTest(){
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }
}







//    public static void main(String[] args) throws IOException {
//        driver = getChromeDriver(); // using static import
//        try {
//            driver.get("https://demoqa.com/alerts");
//            alertButtonTest();
//            timerAlertButtonTest();
//            acceptOrCancelAlertButton();
//            TextBoxtAlert();
//            System.out.println("Test finished successfully");
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            takeScreenShot(driver);
//
//        } finally {
//            driver.quit();
//        }
//
//
//    }

//    private static void TextBoxtAlert() throws InterruptedException {
//        WebElement promtButton = driver.findElement(By.id("promtButton"));
//        promtButton.click();
//        Alert alert = driver.switchTo().alert();
//        alert.sendKeys("This message is a Test");
//        alert.accept();
//        WebElement promptResult = driver.findElement(By.id("promptResult"));
//        System.out.println(promptResult.getText());
//        Thread.sleep(Duration.ofSeconds(2));
//    }

//    private static void acceptOrCancelAlertButton() {
//        WebElement confirmButton = driver.findElement(By.id("confirmButton"));
//        confirmButton.click();
//        Alert alert = driver.switchTo().alert();
//        alert.accept(); //alert.dismiss;
//        WebElement successMessage = driver.findElement(By.cssSelector(".text-success"));
//        System.out.println(successMessage.getText());
//    }

//    private static void timerAlertButtonTest() throws InterruptedException {
//        WebElement timerAlertButton = driver.findElement(By.id("timerAlertButton"));
//        timerAlertButton.click();
//        Thread.sleep(Duration.ofSeconds(5));
//    }

//    private static void alertButtonTest() throws InterruptedException {
//        WebElement alertButton = driver.findElement(By.id("alertButton"));
//        alertButton.click();
//        Thread.sleep(3000);
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        Thread.sleep(3000);
//    }

