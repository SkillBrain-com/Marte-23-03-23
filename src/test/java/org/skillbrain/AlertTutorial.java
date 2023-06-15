package org.skillbrain;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

import static Utilities.Utils.getChromeDriver;
import static Utilities.Utils.takeScreenshot;

public class AlertTutorial {

    public static ChromeDriver driver;


    public static void main(String[] args) throws IOException {
        driver = getChromeDriver();  // using static import
        try {
            driver.get("https://demoqa.com/alerts");
//            timerAlertButtonTest();
//            alertButtonTest();
//            acceptOrCancelAlertButton();
//            textBoxAlertTest();
            System.out.println("Test finished successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            takeScreenshot(driver);
        } finally {
            driver.quit();
        }

    }

    private static void textBoxAlertTest() {
        WebElement promptButton = driver.findElement(By.id("promtButton"));
        promptButton.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("This message");
        alert.accept();
        WebElement promptResult = driver.findElement(By.id("promptResult"));
        System.out.println(promptResult.getText());
    }

    private static void acceptOrCancelAlertButton() {
        WebElement confirmButton = driver.findElement(By.id("confirmButton"));
        confirmButton.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        WebElement successMessage = driver.findElement(By.cssSelector(".text-success"));
        System.out.println(successMessage.getText());
    }

    private static void timerAlertButtonTest() throws InterruptedException {
        WebElement timerAlertButton = driver.findElement(By.id("timerAlertButton"));
        timerAlertButton.click();
        Thread.sleep(Duration.ofSeconds(6));
    }

    private static void alertButtonTest() throws InterruptedException {
        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
    }


}
