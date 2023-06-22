package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.EmagHomepage;

import java.time.Duration;

public class EmagTest {
    private static ChromeDriver driver;
    private static EmagHomepage emagHomepage;


    public static void main(String[] args) {
        driver = Utils.getChromeDriver();
        try {
            //           simpleEmagHomePage();
            driver.get("https://www.emag.ro/");

            emagHomepage = new EmagHomepage(driver);
            emagHomepage.gdprBanner.click();
            emagHomepage.acceptGdpr.click();
            emagHomepage.myAccount.click();


        } catch (Exception e) {

        } finally {
            driver.quit();
        }


    }







    private static void simpleEmagHomePage() {
        WebElement gdprBanner = driver.findElement(By.cssSelector(".gdpr-cookie-banner.js-gdpr-cookie-banner.pad-sep-xs.pad-hrz-none.show"));
        WebElement acceptJDPR = driver.findElement(By.cssSelector(".btn.btn-primary.js-accept.gtm_h76e8zjgoo.btn-block"));
        WebElement ofertZilei = driver.findElement(By.xpath("//button[@data-ntf='close']"));
        WebElement myAccount = driver.findElement(By.id("my_account"));
        gdprBanner.click();
        acceptJDPR.click();
        ofertZilei.click();
        myAccount.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}
