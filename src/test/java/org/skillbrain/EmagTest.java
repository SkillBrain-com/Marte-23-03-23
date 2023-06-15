package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.EmagHomePage;

public class EmagTest {


    private static ChromeDriver driver;
    private static EmagHomePage emagHomePage;

    public static void main(String[] args) {

        driver = Utils.getChromeDriver();
        try {
            driver.get("https://www.emag.ro/");
//            simpleEmagHomePageExample();
            emagHomePage = new EmagHomePage(driver);
            emagHomePage.gdprBanner.click();
            emagHomePage.acceptGdpr.click();
            emagHomePage.myAccount.click();

            System.out.println("Test finished successfully");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }


    }

    private static void simpleEmagHomePageExample() {
        WebElement acceptGdpr = driver.findElement(By.cssSelector(".btn.btn-primary.js-accept.gtm_h76e8zjgoo.btn-block"));
        WebElement gdprBanner = driver.findElement(By.cssSelector(".gdpr-cookie-banner.js-gdpr-cookie-banner.pad-sep-xs.pad-hrz-none.show"));
        WebElement closeOfertaZilei = driver.findElement(By.xpath("//button[@data-ntf='close']"));
        WebElement myAccount = driver.findElement(By.id("my_account"));
        gdprBanner.click();
        acceptGdpr.click();
        closeOfertaZilei.click();
        myAccount.click();
    }


}
