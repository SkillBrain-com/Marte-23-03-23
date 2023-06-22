package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class ButtonClick extends Utils {
    public static void main(String[] args) throws IOException {
        ChromeDriver driver = Utils.getChromeDriver();

        try {
            driver.get("https://demoqa.com/buttons");
            WebElement doubClickButton = driver.findElement(By.id("doubleClickBtn"));
            WebElement rightClickButton =  driver.findElement(By.id("rightClickBtn"));
            WebElement clickMeButton = driver.findElement(By.xpath("(//button[@type='button'])[4]"));

            Actions actions = new Actions(driver);

            actions.doubleClick(doubClickButton).build().perform();
            Thread.sleep(3000);
            actions.contextClick(rightClickButton).build().perform();
            Thread.sleep(3000);
            actions.click(clickMeButton).build().perform();
            Thread.sleep(3000);

            String doubleClickMessage = driver.findElement(By.id("doubleClickMessage")).getText();
            String rightClickMessage = driver.findElement(By.id("rightClickMessage")).getText();
            String clickMeButtonMessage = driver.findElement(By.id("dynamicClickMessage")).getText();


            System.out.println(rightClickMessage);
            System.out.println(doubleClickMessage);
            System.out.println(clickMeButtonMessage);
            takeScreenShot(driver);
            Thread.sleep(3000);


        } catch (Exception e) {
            System.out.println(e.getMessage());
            takeScreenShot(driver);

        } finally {
            driver.quit();
        }



    }
}

