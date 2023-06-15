package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleTutorial {


    private static ChromeDriver driver;


    public static void main(String[] args) {

        driver = Utils.getChromeDriver();

        try {
            driver.get("https://demoqa.com/");
            driver.findElement(By.cssSelector(".banner-image")).click();
            Set<String> windowHandles = driver.getWindowHandles();
            System.out.println(windowHandles);
            Iterator<String> windowHandlesIterator = windowHandles.iterator();
            String parentID = windowHandlesIterator.next();
            String childID = windowHandlesIterator.next();
            Thread.sleep(3000);
            driver.switchTo().window(childID);
            driver.findElement(
                    By.xpath("//a[@class='btn btn-primary-shadow btn-block']"))
                    .click();
            Thread.sleep(3000);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            driver.quit();
        }



    }



}
