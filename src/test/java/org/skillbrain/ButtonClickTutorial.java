package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;


public class ButtonClickTutorial extends Utils {

    public static void main(String[] args) throws IOException {
         ChromeDriver driver = Utils.getChromeDriver();


        try {
            driver.get("https://demoqa.com/buttons");

            WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
            WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
            WebElement clickMeBtn = driver.findElement(By.xpath("(//button[@type='button'])[4]"));

            Actions actions = new Actions(driver);
            actions.contextClick(rightClickBtn).build().perform();
            actions.doubleClick(doubleClickBtn).build().perform();
            actions.click(clickMeBtn).build().perform();
            Thread.sleep(3000);
            String doubleClickMessage = driver.findElement(By.id("doubleClickMessage")).getText();
            String rightClickMessage = driver.findElement(By.id("rightClickMessage")).getText();
            String dynamicClickMessage = driver.findElement(By.id("dynamicClickMessage")).getText();

            System.out.println(rightClickMessage);
            System.out.println(doubleClickMessage);
            System.out.println(dynamicClickMessage);

            takeScreenshot(driver);

            WebElement element = driver.findElement(By.xpath("(//div[@class='header-text'])[6]"));

            actions.scrollToElement(element).build().perform();

            Thread.sleep(1000);


        } catch (Exception e) {
            System.out.println(e.getMessage());
            takeScreenshot(driver);
        } finally {
            driver.quit();
        }




    }




}
